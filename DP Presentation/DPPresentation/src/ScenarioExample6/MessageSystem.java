/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScenarioExample6;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author shafq
 */
// MessageSystem Singleton
class MessageSystem {
    private static MessageSystem instance;
    private List<MessageObserver> observers;

    private MessageSystem() {
        observers = new ArrayList<>();
    }

    public static synchronized MessageSystem getInstance() {
        if (instance == null) {
            instance = new MessageSystem();
        }
        return instance;
    }

    public void addObserver(MessageObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(MessageObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Message message) {
        for (MessageObserver observer : observers) {
            observer.update(message);
        }
    }

    public void newMessage(Message message) {
        notifyObservers(message);
    }
}

