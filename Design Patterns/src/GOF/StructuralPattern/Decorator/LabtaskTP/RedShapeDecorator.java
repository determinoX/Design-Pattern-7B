/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.StructuralPattern.Decorator.LabTaskTP;

/**
 *
 * @author shafq
 */
// Concrete RedShapeDecorator with a decoration cost
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape, double decorationCost) {
        super(decoratedShape, decorationCost);
    }

    @Override
    protected void computeCost() {
        super.computeCost();
        System.out.println("Red Color Cost: $2.0"); // Example cost for red color
    }
}