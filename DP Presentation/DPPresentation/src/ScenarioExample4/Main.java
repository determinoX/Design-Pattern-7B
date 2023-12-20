/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScenarioExample4;

/**
 *
 * @author shafq
 */
public class Main {
    public static void main(String[] args) {
        // Create factories
        CarFactory sedanFactory = new SedanFactory();
        CarFactory suvFactory = new SUVFactory();

        // Create cars using factories
        Car sedan = sedanFactory.createCar();
        Car suv = suvFactory.createCar();

        // Set up MVC for each car
        CarView sedanView = new CarView();
        CarController sedanController = new CarController(sedan, sedanView);

        CarView suvView = new CarView();
        CarController suvController = new CarController(suv, suvView);

        // Display car details
        sedanController.updateView();
        suvController.updateView();
    }
}

