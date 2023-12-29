/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CommunicationSystem;

import java.util.List;
import java.util.Arrays; // You might also need this for Arrays.asList usage


/**
 *
 * @author shafq
 */
public class CommunicationSystemMain {
    public static void main(String[] args) {
        // Singleton for Settings
        SingletonSettings settings = SingletonSettings.getInstance();
        System.out.println("Initial settings: " + settings.getSettingsData());
        settings.setSettingsData("Updated settings");
        System.out.println("Updated settings: " + settings.getSettingsData());

        // Mediator for controlling coupling
        CommunicationMediator mediator = new CommunicationMediator();
        
        // Create stakeholders
        Stakeholder talah = new Stakeholder();
        Stakeholder fahad = new Stakeholder();
        Stakeholder ehsan = new Stakeholder();

        // Add stakeholders to mediator
        mediator.addStakeholder(talah);
        mediator.addStakeholder(fahad);
        mediator.addStakeholder(ehsan);

        
        CommunicationFacade facade = new CommunicationFacade();
        facade.sendMessageToAll("Broadcast message using facade");

       
        CommunicationStrategy highSeverityStrategy = new HighSeverityStrategy();
        CommunicationStrategy lowSeverityStrategy = new LowSeverityStrategy();

        highSeverityStrategy.applyCommunicationMethod("High");
        lowSeverityStrategy.applyCommunicationMethod("Low");

      
        CommunicationBuilder messageBuilder = new MessageBuilder();
        messageBuilder.build();
        CommunicationObject message = messageBuilder.getResult();

        
        List<Stakeholder> stakeholdersList = Arrays.asList(talah, fahad, ehsan);
        StakeholderIterator iterator = new StakeholderIterator(stakeholdersList);
        while (iterator.hasNext()) {
            Stakeholder currentStakeholder = iterator.next();
            
        }

        
        StakeholderObserver observer = new StakeholderObserver() {
            @Override
            public void update(String message) {
                System.out.println("Received message: " + message);
            }
        };

        talah.addObserver(observer);
        fahad.addObserver(observer);
        ehsan.addObserver(observer);

        
        mediator.sendMessage("Emergency message", talah);
        mediator.sendMessage("Polling Station will be closed in 10minutes", talah);
        
    }
}

