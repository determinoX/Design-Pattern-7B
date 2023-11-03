/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab7.AbstractFactory.LabTask;

/**
 *
 * @author fa20-bse-017
 */
public class ShapeFactory extends AbstractFactory {
   @Override
   public Shape getShape(String shapeType){    
      if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();         
      }else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square(); 
      }else if(shapeType.equalsIgnoreCase("TRIANGLE")){
         return new Triangle();
      }	 
      return null;
   }
}