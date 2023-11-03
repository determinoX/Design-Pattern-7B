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
public class FactoryProducer {
//   public static AbstractFactory getFactory(boolean rounded){   
   public static AbstractFactory getFactory(String Factory){   
      if(Factory == "Rounded"){
         return new RoundedShapeFactory();         
      }else if(Factory == "DoubleBordered"){
          return new DoubleBorderedShapeFactory();
      }else if(Factory == "DoubleBorderedRounded"){
         return new ShapeFactory();
      }else if(Factory == "SingleBordered"){
         return new ShapeFactory();
      }else if(Factory == "Simple"){
         return new ShapeFactory();
      }
      
      return null;
//      }else{
//         return new ShapeFactory();
//      }
   }
   
//   public AbstractFactory getFactory(){
//       return new ShapeFactory();
//   }
}