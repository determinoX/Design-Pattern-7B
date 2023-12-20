/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScenarioExample6;

/**
 *
 * @author shafq
 */
// MessageObserver
interface MessageObserver {
    void update(Message message);
}

// Concrete Observer - MessageNotification
class MessageNotification implements MessageObserver {
    @Override
    public void update(Message message) {
        System.out.println("Notification: New message from " + message.getSender());
    }
}

