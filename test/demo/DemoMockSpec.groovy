package demo

import spock.lang.Specification

class DemoMockSpec extends Specification{

    def mockRepo = Mock(IStudentRepo.class)
    def app = new StudentGrader(mockRepo)

    def "app using mock student repo to test without concrete dependency" (){
        given: "given a student id"
        //act
        var studentId = "12345"

        when: "when student id is used with calculateStudentGrade"
        //arrange
        app.calculateStudentGrade(studentId)

        then: "interface methods should be called once"
        //assert
        1 * mockRepo.getStudentScores(studentId)
        1 * mockRepo.updateStudentGrade(studentId, "C")
    }

    def "testing app using argument matchers" (){
        given:
        //act

        when: "when student id is used with calculateStudentGrade"
        //arrange
        app.calculateStudentGrade("12345")

        then: "interface methods should be called once (regardless of invocation order)"
        //assert
        1 * mockRepo.updateStudentGrade(_ as String, "C")
        1 * mockRepo.getStudentScores(_ as String)
    }

    def "testing app using argument matchers and validation order of invocations" (){
        given:
        //act

        when: "when student id is used with calculateStudentGrade"
        //arrange
        app.calculateStudentGrade("12345")

        then: "getStudentScores should be called first once"
        1 * mockRepo.getStudentScores(_ as String)

        then: "updateStudentGrade should be called next once"
        1 * mockRepo.updateStudentGrade(_ as String, "C")
    }

    def "test delete function with mock UserDao" (){
        given:
        def mockDao = Mock(IUserDao)
        //mock behavior of delete function
        mockDao.delete(_ as String) >> true >> false

        expect:
        mockDao.delete("1")
        !mockDao.delete("2")
        !mockDao.delete("3")
    }
}
