/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab7.Builder.LabTask;


/**
 *
 * @author fa20-bse-017
 */
public class MealBuilder {

   public Meal prepareVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new VegBurger());
      meal.addItem(new Coke());
      return meal;
   }   

   public Meal prepareNonVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new ChickenBurger());
      meal.addItem(new Pepsi());
      return meal;
   }

   public Meal prepareDietMeal (){
      Meal meal = new Meal();
      meal.addItem(new DietBurger());
      meal.addItem(new SugerFreePepsi());
      return meal;
   }

   public Meal prepareTea (){
      Meal meal = new Meal();
      meal.addItem(new Tea());
      
      return meal;
   }
}