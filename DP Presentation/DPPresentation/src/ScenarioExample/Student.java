/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScenarioExample;

/**
 *
 * @author shafq
 */
// Modify Student class to act as Subject
import java.util.ArrayList;
import java.util.List;

public class Student implements Subject {
    private String rollNo;
    private String name;
    private List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(name, rollNo);
        }
    }

    public void setName(String name) {
        this.name = name;
        notifyObservers();
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
        notifyObservers();
    }
}


