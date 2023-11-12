/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.StructuralPattern.Builder.LabTask;

/**
 *
 * @author shafq
 */
import java.util.Scanner;

public class InteractiveBuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = new Meal();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Interactive Meal Builder!");
        System.out.println("Choose options for your meal:");

        System.out.print("Include Diet Drinks? (y/n): ");
        String includeDietDrinksOption = scanner.next().toLowerCase();
        boolean includeDietDrinks = includeDietDrinksOption.equals("y");

        System.out.print("Include Tea? (y/n): ");
        String includeTeaOption = scanner.next().toLowerCase();
        boolean includeTea = includeTeaOption.equals("y");

        meal = mealBuilder.prepareNonVegMeal(includeDietDrinks, includeTea);

        System.out.println("\nYour Meal Details:");
        meal.showItems();
        System.out.println("Total Cost: " + meal.getCost());
    }
}

