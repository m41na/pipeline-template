package demo

import spock.lang.Specification

class DemoSpySpec extends Specification{

    def studentRepoSpy = Spy(StudentDatabase.class) //cannot use interface here - must real object instance
    def app = new StudentGrader(studentRepoSpy)

    def "app spying student repo with grade 'A'" (){
        given: "given a student id"
        //act
        var studentId = "ABC"

        when: "when student id is used with calculateStudentGrade"
        //arrange
        var grade = app.calculateStudentGrade(studentId)

        then: "interface methods should be called once"
        //assert
        grade == "C"
        1 * studentRepoSpy.getStudentScores(studentId)
    }
}
