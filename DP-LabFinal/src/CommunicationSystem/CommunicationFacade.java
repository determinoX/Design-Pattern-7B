/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CommunicationSystem;

// Other import statements...

/**
 *
 * @author shafq
 */

public class CommunicationFacade {
    private CommunicationSystem communicationSystem;

    public CommunicationFacade() {
        communicationSystem = new CommunicationSystem();
    }

    public void sendMessageToAll(String message) {
        communicationSystem.sendBroadcastMessage(message);
    }
}
