/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.StructuralPattern.Builder.LabTask;

/**
 *
 * @author shafq
 */
// Tea.java
public class Tea implements Item {
    private SweetnessType sweetnessType;
    private boolean withCream;
    private int sweetnessSpoons;

    public Tea(SweetnessType sweetnessType, boolean withCream, int sweetnessSpoons) {
        this.sweetnessType = sweetnessType;
        this.withCream = withCream;
        this.sweetnessSpoons = sweetnessSpoons;
    }

    @Override
    public String name() {
        return "Tea";
    }

    @Override
    public Packing packing() {
        return new Cup(); // You can create a new Cup class for packing tea
    }

    @Override
    public float price() {
        float basePrice = 20.0f;

        // Add additional cost for decorations
        float totalCost = basePrice;
        if (withCream) {
            totalCost += 5.0f; // Additional cost for cream
        }
        totalCost += sweetnessSpoons * 2.0f; // Additional cost for sweetness (adjust as needed)

        return totalCost;
    }
}

