/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.BehavioralPattern.Strategy.LabTask;

/**
 *
 * @author shafq
 */
public class OperationPower implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        // Implement power operation (num1^num2)
        return (int) Math.pow(num1, num2);
    }
}
