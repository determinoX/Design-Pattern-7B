/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.BehavioralPattern.Strategy.LabTask;

/**
 *
 * @author shafq
 */
public class Context {
   private Strategy strategy;

   public Context(Strategy strategy){
      this.strategy = strategy;
   }

   public int executeStrategy(int num1, int num2){
      return strategy.doOperation(num1, num2);
   }
}
 private RangeHandler rangeHandler;

    public Context(RangeHandler rangeHandler) {
        this.rangeHandler = rangeHandler;
    }

    public int executeStrategy(int num1, int num2) {
        // Delegate to the range handler
        return rangeHandler.handleRequest(num1, num2);
    }

