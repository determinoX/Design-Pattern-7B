/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScenarioExample2;

/**
 *
 * @author shafq
 */
public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        
        // Creating observers (Views)
        WeatherObserver phoneDisplay = new PhoneDisplay();
        WeatherObserver laptopDisplay = new LaptopDisplay();
        
        // Register observers
        station.addObserver(phoneDisplay);
        station.addObserver(laptopDisplay);
        
        // Simulating temperature changes
        station.setTemperature(25);
        station.setTemperature(30);
        
        // Unregister an observer
        station.removeObserver(phoneDisplay);
        
        // Simulating temperature change after unregistering
        station.setTemperature(27);
    }
}

