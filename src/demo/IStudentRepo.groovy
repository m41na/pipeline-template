package demo

interface IStudentRepo {

    List<Float> getStudentScores(String studentId);

    void updateStudentGrade(String studentId, String grade);

    String getStudentGrade(String studentId);
}