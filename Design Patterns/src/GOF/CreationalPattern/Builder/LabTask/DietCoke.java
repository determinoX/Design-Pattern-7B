/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.StructuralPattern.Builder.LabTask;

/**
 *
 * @author shafq
 */
// DietCoke.java
public class DietCoke extends ColdDrink {

    @Override
    public float price() {
        return 40.0f; // Adjust the price for the diet version
    }

    @Override
    public String name() {
        return "Diet Coke";
    }
}

// DietPepsi.java
public class DietPepsi extends ColdDrink {

    @Override
    public float price() {
        return 40.0f; // Adjust the price for the diet version
    }

    @Override
    public String name() {
        return "Diet Pepsi";
    }
}

