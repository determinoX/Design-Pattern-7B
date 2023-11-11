/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.BehavioralPattern.Observer.eventsmanagement.listeners;

/**
 *
 * @author shafq
 */

import java.io.File;

public class SMSSupportListener implements EventListener {
    private String phoneNumber;
    private int maxSmsLength;

    public SMSSupportListener(String phoneNumber, int maxSmsLength) {
        this.phoneNumber = phoneNumber;
        this.maxSmsLength = maxSmsLength;
    }

    @Override
    public void update(String eventType, File file) {
        if ("save".equals(eventType)) {
            String smsContent = "Someone has performed " + eventType + " operation with the following file: " + file.getName();
            if (smsContent.length() > maxSmsLength) {
                System.out.println("Warning: Please define a valid default SMS. The content is too long.");
            } else {
                sendSMS(smsContent);
            }
        }
    }

    private void sendSMS(String content) {
        // Code to send SMS to phoneNumber
        System.out.println("Sending SMS to " + phoneNumber + ": " + content);
    }
}
