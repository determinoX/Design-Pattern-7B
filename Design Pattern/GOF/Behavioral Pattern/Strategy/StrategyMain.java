/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.Strategy;

/**
 *
 * @author FA20-BSE-042
 */
public class StrategyMain {
    public static void main(String [] args){
        Context context = new Context(new OperationAdd());		
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());		
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());		
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
        
        context = new Context(new OperationDiv());		
        System.out.println("10 / 5 = " + context.executeStrategy(10, 5));
        
        context = new Context(new OperationPow());		
        System.out.println("10 ^ 5 = " + context.executeStrategy(10, 5));
        
        int executeInRange = context.executeInRange(2, 4);
        System.out.println(executeInRange);
    }
}
