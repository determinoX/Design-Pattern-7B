/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScenarioExample3;

/**
 *
 * @author shafq
 */
public class Main {
    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();

        // Creating observers (departments)
        InventoryObserver warehouse = new WarehouseDepartment();
        InventoryObserver sales = new SalesDepartment();

        // Registering observers
        inventorySystem.addObserver(warehouse);
        inventorySystem.addObserver(sales);

        // Updating stock
        inventorySystem.updateStock("Laptops", 50);
        inventorySystem.updateStock("Laptops", 40);
        inventorySystem.updateStock("Smartphones", 100);
        inventorySystem.updateStock("Smartphones", 90);
    }
}
