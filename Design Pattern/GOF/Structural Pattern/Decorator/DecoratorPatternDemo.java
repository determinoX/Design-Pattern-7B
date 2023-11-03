/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.Decorator;

/**
 *
 * @author FA20-BSE-042
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
      Shape circle = new Circle(5.0);

      Shape redCircle = new RedShapeDecorator(new Circle(5.0), 20.0);

      Shape redRectangle = new RedShapeDecorator(new Rectangle(10.0), 8.0);
      System.out.println("Circle with normal border");
      circle.draw();

      System.out.println("\nCircle of red border");
      redCircle.draw();

      System.out.println("\nRectangle of red border");
      redRectangle.draw();

    }
}
