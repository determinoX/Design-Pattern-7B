/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.StructuralPattern.Decorator.LabTaskTP;

/**
 *
 * @author shafq
 */
// Concrete Rectangle class with a price
public class Rectangle implements Shape {
    private double price = 7.0; // Example price for Rectangle

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }

    @Override
    public double getPrice() {
        return price;
    }
}

