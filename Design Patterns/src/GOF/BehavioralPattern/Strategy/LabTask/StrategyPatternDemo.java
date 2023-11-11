/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.BehavioralPattern.Strategy.LabTask;

/**
 *
 * @author shafq
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationPower());
        System.out.println("2 ^ 3 = " + context.executeStrategy(2, 3));

        context = new Context(new OperationMultiplication());
        System.out.println("7 * 8 = " + context.executeStrategy(7, 8));
        
        
     // Create the chain of responsibility
        RangeHandler addHandler = new AddHandler();
        RangeHandler subtractHandler = new SubtractHandler();
        // Create and set handlers for other ranges (Multiply, Division, Power)

        // Set the next handler in the chain
        addHandler.setNextHandler(subtractHandler);
        // Set the next handler for subtractHandler, and so on...

        // Create a Context with the chain of responsibility
        Context context = new Context(addHandler);

        // Test with inputs
        int result = context.executeStrategy(10, 5);
        System.out.println("Result: " + result);    
    }
    
}

