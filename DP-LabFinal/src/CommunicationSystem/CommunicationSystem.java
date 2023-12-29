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

public class CommunicationSystem {
    private List<Stakeholder> stakeholders;

    public CommunicationSystem() {
        this.stakeholders = new ArrayList<>();
        // Initialize stakeholders or retrieve them from a database or other source
    }

    // Add a method to add stakeholders to the system
    public void addStakeholder(Stakeholder stakeholder) {
        stakeholders.add(stakeholder);
    }

    // Method to send a broadcast message to all stakeholders
    public void sendBroadcastMessage(String message) {
        System.out.println("Broadcasting message: " + message);

        // Send the message to each stakeholder
        for (Stakeholder stakeholder : stakeholders) {
            stakeholder.receiveMessage(message);
        }
    }
}
