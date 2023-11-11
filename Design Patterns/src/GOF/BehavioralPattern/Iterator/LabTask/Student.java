/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.BehavioralPattern.Iterator.LabTask;

/**
 *
 * @author shafq
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Student class representing the attributes of a student
class Student {
    private int regNo;
    private String name;
    private String gender;
    private String phoneNumber;

    public Student(int regNo, String name, String gender, String phoneNumber) {
        this.regNo = regNo;
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    // Getters for the attributes
    public int getRegNo() {
        return regNo;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // toString method for easy printing of student details
    @Override
    public String toString() {
        return "Student{" +
                "regNo=" + regNo +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

// Implementation of the Container interface
public class NameRepository implements Container {
    private List<Student> students = new ArrayList<>();

    // Constructor to initialize the list of students
    public NameRepository() {
        // Add some sample students to the list
        students.add(new Student(1, "Muhammad Ali", "Male", "123456789"));
        students.add(new Student(2, "John Doe", "Male", "987654321"));
        students.add(new Student(3, "Julie Smith", "Female", "456789123"));
        students.add(new Student(4, "Lora Johnson", "Female", "789123456"));
    }

    // Implementation of the getIterator method from the Container interface
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    // Inner class implementing the Iterator interface
    private class NameIterator implements Iterator {
        int index;

        // Implementation of the hasNext method from the Iterator interface
        @Override
        public boolean hasNext() {
            return index < students.size();
        }

        // Implementation of the next method from the Iterator interface
        @Override
        public Object next() {
            if (this.hasNext()) {
                return students.get(index++);
            }
            return null;
        }

        // Implementation of the previous method
        public Object previous() {
            if (index > 0) {
                return students.get(--index);
            }
            return null;
        }

        // Implementation of the moveToLast method
        public Object moveToLast() {
            index = students.size() - 1;
            return students.get(index);
        }

        // Implementation of the moveToFirst method
        public Object moveToFirst() {
            index = 0;
            return students.get(index);
        }
    }

    // Method to print students whose names start with a given value (from last to first)
    public void printStudentsWithNameStartingFrom(String startingValue) {
        NameIterator iterator = new NameIterator();
        while (iterator.previous() != null) {
            Student student = (Student) iterator.previous();
            if (student.getName().startsWith(startingValue)) {
                System.out.println(student);
            }
        }
    }

    // Method to print all students (optionally in sorted order by name)
    public void printAllStudents(boolean sortedByName) {
        List<Student> studentList = new ArrayList<>(students);
        if (sortedByName) {
            Collections.sort(studentList, (s1, s2) -> s1.getName().compareToIgnoreCase(s2.getName()));
        }
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}

