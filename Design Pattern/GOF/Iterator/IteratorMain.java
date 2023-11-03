/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.Iterator;

/**
 *
 * @author FA20-BSE-042
 */
public class IteratorMain {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        Iterator iterator = nameRepository.getIterator();
        iterator.moveToLast();

        System.out.println("Students with names starting from 'Muhammad':");
        while (iterator.hasPrevious()) {
            Student student = (Student) iterator.previous();
            if (student.getName().startsWith("Muhammad")) {
                System.out.println("Name: " + student.getName());
            }
        }

        iterator.moveToFirst();

        System.out.println("\nAll students:");
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            System.out.println("Name: " + student.getName() + ", RegNo: " + student.getRegNo() + ", Gender: " + student.getGender() + ", Phone: " + student.getPhoneNumber());
        }
    }
}
