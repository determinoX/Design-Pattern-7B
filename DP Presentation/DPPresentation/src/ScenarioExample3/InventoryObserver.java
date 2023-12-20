/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScenarioExample3;

/**
 *
 * @author shafq
 */
// Observer
interface InventoryObserver {
    void update(String item, int quantity);
}

// Concrete Observer - WarehouseDepartment
class WarehouseDepartment implements InventoryObserver {
    @Override
    public void update(String item, int quantity) {
        System.out.println("Warehouse Department: Updated " + item + " quantity to " + quantity);
    }
}

// Concrete Observer - SalesDepartment
class SalesDepartment implements InventoryObserver {
    @Override
    public void update(String item, int quantity) {
        System.out.println("Sales Department: Item " + item + " quantity changed to " + quantity);
    }
}

