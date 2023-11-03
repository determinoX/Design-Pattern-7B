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
public class Context {
    private Computer strategy;

    public Context(Computer strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
   
    public int executeInRange(int num1, int num2){
        Computer ChainOfResponsibity = new OperationAdd(new OperationSubstract(new OperationMultiply(new OperationDiv(new OperationPow()))));
        return ChainOfResponsibity.ComputeInRange(num1, num2);
    }
    
}
