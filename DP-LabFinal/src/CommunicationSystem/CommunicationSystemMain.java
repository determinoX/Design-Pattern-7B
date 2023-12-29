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
        Stakeholder alice = new Stakeholder();
        Stakeholder bob = new Stakeholder();
        Stakeholder charlie = new Stakeholder();

        // Add stakeholders to mediator
        mediator.addStakeholder(alice);
        mediator.addStakeholder(bob);
        mediator.addStakeholder(charlie);

        // Facade for easy interface
        CommunicationFacade facade = new CommunicationFacade();
        facade.sendMessageToAll("Broadcast message using facade");

        // Strategy for adopting different communication methods
        CommunicationStrategy highSeverityStrategy = new HighSeverityStrategy();
        CommunicationStrategy lowSeverityStrategy = new LowSeverityStrategy();

        highSeverityStrategy.applyCommunicationMethod("High");
        lowSeverityStrategy.applyCommunicationMethod("Low");

        // Builder for creating different communication objects
        CommunicationBuilder messageBuilder = new MessageBuilder();
        messageBuilder.build();
        CommunicationObject message = messageBuilder.getResult();

        // Iterator for iterating through stakeholders
        List<Stakeholder> stakeholdersList = Arrays.asList(alice, bob, charlie);
        StakeholderIterator iterator = new StakeholderIterator(stakeholdersList);
        while (iterator.hasNext()) {
            Stakeholder currentStakeholder = iterator.next();
            // Do something with each stakeholder
        }

        // Observer for real-time communication among stakeholders
        StakeholderObserver observer = new StakeholderObserver() {
            @Override
            public void update(String message) {
                System.out.println("Received message: " + message);
            }
        };

        alice.addObserver(observer);
        bob.addObserver(observer);
        charlie.addObserver(observer);

        // Simulate message reception
        mediator.sendMessage("Emergency message", alice);
    }
}

