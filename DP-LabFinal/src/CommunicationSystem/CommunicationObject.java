/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CommunicationSystem;

/**
 *
 * @author shafq
 */
public class CommunicationObject {
    private String content;
    private String sender;
    private String receiver;

    public CommunicationObject(String content, String sender, String receiver) {
        this.content = content;
        this.sender = sender;
        this.receiver = receiver;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void send() {
        // Placeholder logic for sending the communication
        System.out.println("Sending communication: " + content + " from " + sender + " to " + receiver);
    }

    public void receive() {
        // Placeholder logic for receiving the communication
        System.out.println("Receiving communication: " + content + " by " + receiver);
    }
}
