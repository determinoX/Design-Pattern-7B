/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScenarioExample6;

/**
 *
 * @author shafq
 */
// MessageView
class MessageView {
    public void displayMessage(Message message) {
        System.out.println("New message from " + message.getSender() + ": " + message.getContent());
    }
}

