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
public abstract class ShapeDecorator implements Shape {
   protected Shape decoratedShape;
   private double price;

    public ShapeDecorator(Shape decoratedShape, double price){
      this.decoratedShape = decoratedShape;
      this.price = price;
    }    

    public void draw(){
        double totalCost = computeCost();
        decoratedShape.draw();
        System.out.println("Decoration Cost: " + totalCost);
    }	
    
    @Override
    public double getPrice() {
        return price;
    }

    private double computeCost() {
        return getPrice() + decoratedShape.getPrice();
    }
}
