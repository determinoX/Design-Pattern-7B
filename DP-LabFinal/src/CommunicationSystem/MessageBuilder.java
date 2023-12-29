/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CommunicationSystem;

/**
 *
 * @author shafq
 */


public class MessageBuilder implements CommunicationBuilder {
    private CommunicationObject message;
    

    public MessageBuilder(String content, String sender, String receiver) {
        this.message = new CommunicationObject(content, sender, receiver);
    }

    MessageBuilder() {
     
    }

    @Override
    public void build() {
        System.out.println("Building a message...");
    }

    @Override
    public CommunicationObject getResult() {
        return message;
    }
}


