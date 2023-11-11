/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.BehavioralPattern.TemplateMethod.LabTask.message;

/**
 *
 * @author shafq
 */

public class Message {
    private String description;
    private MessageType messageType;
    private NetworkType networkType;

    // Constructors, getters, setters, etc.

    // Enums for MessageType and NetworkType
    public enum MessageType {
        ERROR, WARNING, INFO
    }

    public enum NetworkType {
        FACEBOOK, TWITTER, LINKEDIN
    }
}

