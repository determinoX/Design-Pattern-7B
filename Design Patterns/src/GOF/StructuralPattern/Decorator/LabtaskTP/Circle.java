/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.StructuralPattern.Decorator.LabTaskTP;

/**
 *
 * @author shafq
 */
// Concrete Circle class with a price
public class Circle implements Shape {
    private double price = 5.0; // Example price for Circle

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }

    @Override
    public double getPrice() {
        return price;
    }
}

