/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScenarioExample5;

/**
 *
 * @author shafq
 */
public class Main {
    public static void main(String[] args) {
        // Create order
        Order order = new Order(150);

        // Set up MVC for order
        OrderView orderView = new OrderView();
        OrderController orderController = new OrderController(order, orderView);

        // Display order details
        orderController.updateView();

        // Perform payment using different strategies
        PaymentStrategy creditCardPayment = new CreditCardPayment();
        PaymentStrategy paypalPayment = new PayPalPayment();

        creditCardPayment.pay(order.getTotalAmount());
        paypalPayment.pay(order.getTotalAmount());
    }
}

