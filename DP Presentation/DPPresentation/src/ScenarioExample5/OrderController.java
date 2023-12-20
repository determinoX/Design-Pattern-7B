/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScenarioExample5;

/**
 *
 * @author shafq
 */
// OrderController
class OrderController {
    private Order model;
    private OrderView view;

    public OrderController(Order model, OrderView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.displayOrderDetails(model);
    }
}

