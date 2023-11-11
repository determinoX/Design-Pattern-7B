/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.BehavioralPattern.Strategy.LabTask;

/**
 *
 * @author shafq
 */
public class OperationMultiplication implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        // Implement multiplication operation (num1 * num2)
        return num1 * num2;
    }
}
