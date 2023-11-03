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

public class AbstractFactoryMain {
    public static void main(String[] args) {
      //get shape factory
//      AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
      AbstractFactory shapeFactory = FactoryProducer.getFactory("Rounded");
      //get an object of Shape Rectangle
      Shape shape1 = shapeFactory.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      shape1.draw();
      //get an object of Shape Square 
      Shape shape2 = shapeFactory.getShape("SQUARE");
      //call draw method of Shape Square
      shape2.draw();
      //get an object of Shape Square 
      Shape shape3 = shapeFactory.getShape("TRIANGLE");
      //call draw method of Shape Square
      shape3.draw();
      //get shape factory
//      AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
      AbstractFactory shapeFactory1 = FactoryProducer.getFactory("DoubleBordered");
      //get an object of Shape Rectangle
      Shape shape4 = shapeFactory1.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      shape4.draw();
      //get an object of Shape Square 
      Shape shape5 = shapeFactory1.getShape("SQUARE");
      //call draw method of Shape Square
      shape5.draw();
      //get an object of Shape Square 
      Shape shape6 = shapeFactory1.getShape("TRIANGLE");
      //call draw method of Shape Square
      shape6.draw();
      ///get shape factory
      AbstractFactory shapeFactory2 = FactoryProducer.getFactory("SingleBordered");
      //get an object of Shape Rectangle
      Shape shape7 = shapeFactory2.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      shape7.draw();
      //get an object of Shape Square 
      Shape shape8 = shapeFactory2.getShape("SQUARE");
      //call draw method of Shape Square
      shape8.draw();
      //get an object of Shape Square 
      Shape shape9 = shapeFactory2.getShape("TRIANGLE");
      //call draw method of Shape Square
      shape9.draw();
      ///get shape factory
      AbstractFactory shapeFactory3 = FactoryProducer.getFactory("DoubleBorderedRounded");
      //get an object of Shape Rectangle
      Shape shape10 = shapeFactory3.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      shape10.draw();
      //get an object of Shape Square 
      Shape shape11 = shapeFactory3.getShape("SQUARE");
      //call draw method of Shape Square
      shape11.draw();
      //get an object of Shape Square 
      Shape shape12 = shapeFactory3.getShape("TRIANGLE");
      //call draw method of Shape Square
      shape12.draw();
      ///get shape factory
      AbstractFactory shapeFactory4 = FactoryProducer.getFactory("Simple");
      //get an object of Shape Rectangle
      Shape shape13 = shapeFactory4.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      shape13.draw();
      //get an object of Shape Square 
      Shape shape14 = shapeFactory4.getShape("SQUARE");
      //call draw method of Shape Square
      shape14.draw();
      //get an object of Shape Square 
      Shape shape15 = shapeFactory4.getShape("TRIANGLE");
      //call draw method of Shape Square
      shape15.draw();
   }
}
