/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.StructuralPattern.Proxy.LabTask;

/**
 *
 * @author FA20-BSE-042
 */
public class ProtectedExamResults {

    private ExamResults examResults;
    private Student student;

    public ProtectedExamResults(ExamResults examResults, Student student) {
        this.examResults = examResults;
        this.student = student;
    }

    public void view() {
        if (student.isTeacher()) {
            System.out.println("Teacher viewing all exam results:");
            for (ExamResult result : examResults.getResults()) {
                System.out.println(result);
            }
        } else {
            System.out.println("Student viewing their exam results:");
            ExamResult studentResult = examResults.getResults().stream()
                    .filter(result -> result.getStudentId().equals(student.getId()))
                    .findFirst().orElse(null);
            if (studentResult != null) {
                System.out.println(studentResult);
            } else {
                System.out.println("No results found for student.");
            }
        }
    }
}

