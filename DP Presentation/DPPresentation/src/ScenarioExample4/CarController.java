/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScenarioExample4;

/**
 *
 * @author shafq
 */
// CarController
class CarController {
    private Car model;
    private CarView view;

    public CarController(Car model, CarView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.displayCarDetails(model);
    }
}

