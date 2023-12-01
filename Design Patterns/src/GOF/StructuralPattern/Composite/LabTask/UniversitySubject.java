/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.StructuralPattern.Composite.LabTask;

/**
 *
 * @author FA20-BSE-042
 */
import java.util.*;
import GOF.StructuralPattern.Composite.LabTask.Observer;
//public class UniversitySubject {

class UniversitySubject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(double bonus) {
        for (Observer observer : observers) {
            observer.update(bonus);
        }
    }
}