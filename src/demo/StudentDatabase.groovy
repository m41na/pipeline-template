package demo

class StudentDatabase implements IStudentRepo{

    private Map<String, List<Float>> scoreMap = [:]
    private Map<String, String> gradeMap = [:]

    StudentDatabase() {
        scoreMap.put("123", [40f, 30f, 30f])
        scoreMap.put("456", [10f, 10f, 30f])
        scoreMap.put("789", [10f, 40f, 45f])
        gradeMap.put("123", "C")
        gradeMap.put("456", "A")
    }

    @Override
    List<Float> getStudentScores(String studentId) {
        return scoreMap.get(studentId)
    }

    @Override
    void updateStudentGrade(String studentId, String grade) {
        gradeMap.put(studentId, grade)
    }

    @Override
    String getStudentGrade(String studentId) {
        return gradeMap.get(studentId)
    }
}
