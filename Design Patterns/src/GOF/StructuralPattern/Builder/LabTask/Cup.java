/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.StructuralPattern.Builder.LabTask;

/**
 *
 * @author shafq
 */
// Add a new Cup class for packing tea
public class Cup implements Packing {
    @Override
    public String pack() {
        return "Cup";
    }
}

