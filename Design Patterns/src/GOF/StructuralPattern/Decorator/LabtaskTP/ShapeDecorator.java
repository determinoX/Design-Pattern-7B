/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.StructuralPattern.Decorator.LabTaskTP;

/**
 *
 * @author shafq
 */
// Abstract class with price attribute and default implementation of computeCost
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;
    protected double decorationCost;

    public ShapeDecorator(Shape decoratedShape, double decorationCost) {
        this.decoratedShape = decoratedShape;
        this.decorationCost = decorationCost;
    }

    @Override
    public double getPrice() {
        return decoratedShape.getPrice() + decorationCost;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        computeCost();
        System.out.println("Total Cost: $" + getPrice());
    }

    protected void computeCost() {
        System.out.println("Decoration Cost: $" + decorationCost);
    }
}

