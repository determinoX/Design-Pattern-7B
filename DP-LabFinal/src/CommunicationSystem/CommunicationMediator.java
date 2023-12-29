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

public class CommunicationMediator {
    private List<Stakeholder> stakeholders = new ArrayList<>();

    public void addStakeholder(Stakeholder stakeholder) {
        stakeholders.add(stakeholder);
    }

    public void sendMessage(String message, Stakeholder sender) {
        for (Stakeholder stakeholder : stakeholders) {
            if (stakeholder != sender) {
                stakeholder.receiveMessage(message);
            }
        }
    }
}

