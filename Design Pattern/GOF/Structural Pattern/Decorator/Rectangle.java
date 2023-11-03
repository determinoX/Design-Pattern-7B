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
public class Rectangle implements Shape {

  private double price;
    
    public Rectangle(double price){
        this.price = price;
    }
   
    @Override
    public void draw() {
        double totalCost = computeCost();
        System.out.println("Shape: Rectangle, Cost: " + totalCost);
    }
   
   @Override
    public double getPrice(){
        return price;
    }
    private double computeCost() {
        return getPrice();
    }
}
