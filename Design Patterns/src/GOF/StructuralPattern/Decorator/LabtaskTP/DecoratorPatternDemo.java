/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.StructuralPattern.Decorator.LabTaskTP;

/**
 *
 * @author shafq
 */
// Demo
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();

        Shape redCircle = new RedShapeDecorator(new Circle(), 2.0);
        redCircle.draw();

        Shape redRectangle = new RedShapeDecorator(new Rectangle(), 3.0);
        redRectangle.draw();
    }
}

