/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CommunicationSystem;

/**
 *
 * @author shafq
 */
import java.util.ArrayList;
import java.util.List;

public class Stakeholder {
    private List<StakeholderObserver> observers = new ArrayList<>();

    public void addObserver(StakeholderObserver observer) {
        observers.add(observer);
    }

    public void receiveMessage(String message) {
        // Receive message logic
        notifyObservers(message);
    }

    private void notifyObservers(String message) {
        for (StakeholderObserver observer : observers) {
            observer.update(message);
        }
    }
   
    public void update(String message) {
        // Implementation of update method
        System.out.println("Received message: " + message);
    }
}
