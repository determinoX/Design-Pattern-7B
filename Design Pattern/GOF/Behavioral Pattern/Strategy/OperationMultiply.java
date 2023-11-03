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

public class OperationMultiply extends Computer{
    
    public OperationMultiply(){}
    
    public OperationMultiply(OperationDiv nextStrategy){
        this.nextStrategy = nextStrategy;
    }
    
    @Override
    public int doOperation(int num1, int num2) {
       return num1 * num2;
    }

  @Override
    public int ComputeInRange(int num1, int num2) {
        if(num1<= 300 &&  num1>=200 && num2<=300 && num2>=200){
            return num1 * num2;
        }
        if(nextStrategy==null){
            System.out.println("Support not available...");
        }
        else{
            nextStrategy.ComputeInRange(num1, num2);
        }
    
        return 0;
        
    }
}
