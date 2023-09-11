package demo

import spock.lang.Specification

class DemoStubSpec extends Specification{

    def studentRepoStub = Stub(IStudentRepo.class)
    def app = new StudentGrader(studentRepoStub)

    def "app stubbing student repo with grade 'A'" (){
        given: "given a student id"
        //act
        var studentId = "ABC"
        studentRepoStub.getStudentGrade(studentId) >> "A"

        when: "when student id is used with calculateStudentGrade"
        //arrange
        var grade = app.calculateStudentGrade(studentId)

        then: "interface methods should be called once"
        //assert
        grade == "A"
    }

    def "app stubbing student repo with 'null'" (){
        given: "given a student id"
        //act
        var studentId = "ABC"
        studentRepoStub.getStudentGrade(studentId) >> null
        studentRepoStub.getStudentScores(studentId) >> [40F, 40F, 15F]

        when: "when student id is used with calculateStudentGrade"
        //arrange
        var grade = app.calculateStudentGrade(studentId)

        then: "interface methods should be called once"
        //assert
        grade == "A"
    }
}
