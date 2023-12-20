/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScenarioExample2;

/**
 *
 * @author shafq
 */
// Observer
interface WeatherObserver {
    void update(int temperature);
}

// Concrete Observer - PhoneDisplay
class PhoneDisplay implements WeatherObserver {
    @Override
    public void update(int temperature) {
        System.out.println("Phone Display: Temperature updated to " + temperature + "°C");
    }
}

// Concrete Observer - LaptopDisplay
class LaptopDisplay implements WeatherObserver {
    @Override
    public void update(int temperature) {
        System.out.println("Laptop Display: Temperature updated to " + temperature + "°C");
    }
}
