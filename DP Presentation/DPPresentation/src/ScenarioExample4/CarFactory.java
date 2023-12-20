/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScenarioExample4;

/**
 *
 * @author shafq
 */
// CarFactory
abstract class CarFactory {
    public abstract Car createCar();
}

// Specific Factory Implementations
class SedanFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new Car("Toyota", "Camry");
    }
}

class SUVFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new Car("Jeep", "Wrangler");
    }
}

