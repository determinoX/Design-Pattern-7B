/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScenarioExample3;

/**
 *
 * @author shafq
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Observable (Subject)
class InventorySystem {
    private Map<String, Integer> inventory;
    private List<InventoryObserver> observers;

    public InventorySystem() {
        inventory = new HashMap<>();
        observers = new ArrayList<>();
    }

    public void addObserver(InventoryObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(InventoryObserver observer) {
        observers.remove(observer);
    }

    public void updateStock(String item, int quantity) {
        inventory.put(item, quantity);
        notifyObservers(item, quantity);
    }

    private void notifyObservers(String item, int quantity) {
        for (InventoryObserver observer : observers) {
            observer.update(item, quantity);
        }
    }
}

