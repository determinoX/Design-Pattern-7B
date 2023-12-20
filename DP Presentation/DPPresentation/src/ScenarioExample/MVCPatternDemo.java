/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScenarioExample;

/**
 *
 * @author shafq
 */
// Modify MVCPatternDemo to demonstrate Observer pattern
public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();

        StudentView view1 = new StudentView();
        StudentView view2 = new StudentView();

        model.registerObserver(view1);
        model.registerObserver(view2);

        model.notifyObservers();

        model.setName("John");
        model.setRollNo("10");

        model.notifyObservers();
    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("20");
        return student;
    }
}

