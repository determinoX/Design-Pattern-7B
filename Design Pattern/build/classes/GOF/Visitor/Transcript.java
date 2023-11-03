/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Visitor;

/**
 *
 * @author fa20-bse-042
 */
import java.io.Serializable;

public class Transcript implements Serializable {
    private int studentId;
    private String subject;
    private int grade;

    public Transcript(int studentId, String subject, int grade) {
        this.studentId = studentId;
        this.subject = subject;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getSubject() {
        return subject;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Subject: " + subject + ", Grade: " + grade;
    }
}
