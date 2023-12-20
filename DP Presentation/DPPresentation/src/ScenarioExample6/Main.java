/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScenarioExample6;

/**
 *
 * @author shafq
 */
public class Main {
    public static void main(String[] args) {
        // Singleton instance of the MessageSystem
        MessageSystem messageSystem = MessageSystem.getInstance();

        // Create observers
        MessageObserver notification = new MessageNotification();

        // Add observers to the MessageSystem
        messageSystem.addObserver(notification);

        // Create a new message
        Message newMessage = new Message("Hello!", "Alice");

        // Send the new message via the MessageSystem
        messageSystem.newMessage(newMessage);

        // Set up MVC for displaying messages
        MessageView messageView = new MessageView();
        MessageController messageController = new MessageController(newMessage, messageView);

        // Display the new message
        messageController.updateView();
    }
}

