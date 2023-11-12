/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.StructuralPattern.Builder.LabTask;

/**
 *
 * @author shafq
 */
public class MealBuilder {

   public Meal prepareVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new VegBurger());
      meal.addItem(new Coke());
      return meal;
   }   

 // Modify the prepareNonVegMeal method to include diet drinks and tea
public Meal prepareNonVegMeal(boolean includeDietDrinks, boolean includeTea) {
    Meal meal = new Meal();
    meal.addItem(new ChickenBurger());

    if (includeDietDrinks) {
        meal.addItem(new DietPepsi());
    } else {
        meal.addItem(new Pepsi());
    }

    if (includeTea) {
        meal.addItem(new Tea(SweetnessType.MEDIUM, true, 2)); // Example values for sweetness type, cream, and sweetness amount
    }

    return meal;
}

