package demo

class StudentGrader {

    public IStudentRepo studentRepo

    StudentGrader(IStudentRepo studentRepo) {
        this.studentRepo = studentRepo
    }

    String calculateStudentGrade(String studentId) {
        String grade = studentRepo.getStudentGrade(studentId)
        if (grade != null && !grade.isEmpty()) {
            return grade
        }

        List<Float> scoreList = studentRepo.getStudentScores(studentId)
        Float totalScore = 0f

        if (scoreList != null) {
            totalScore = scoreList.stream().reduce(0F, (a, b) -> (a + b) as float )
        }

        if (totalScore > 90) {
            grade = "A"
        } else if (totalScore > 80) {
            grade = "B"
        } else {
            grade = "C"
        }

        //update student grade in database
        studentRepo.updateStudentGrade(studentId, grade)
        return grade
    }
}
