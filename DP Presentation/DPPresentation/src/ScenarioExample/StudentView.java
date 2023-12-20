/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScenarioExample;

/**
 *
 * @author shafq
 */
public class StudentView implements Observer {
     public void printStudentDetails(String studentName, String studentRollNo){
      System.out.println("Student: ");
      System.out.println("Name: " + studentName);
      System.out.println("Roll No: " + studentRollNo);
   }

    public void update(String name, String rollNo) {
        // Update view with new data
        System.out.println("Updated Student View:");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}
