/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScenarioExample6;

/**
 *
 * @author shafq
 */
// MessageController
class MessageController {
    private Message model;
    private MessageView view;

    public MessageController(Message model, MessageView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.displayMessage(model);
    }
}

