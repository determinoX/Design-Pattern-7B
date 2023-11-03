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
import java.math.*;

public class OperationPow extends Computer{
    
    public OperationPow(){}

    @Override
    public int doOperation(int num1, int num2) {
        int base = num1;
        int exponent = num2;
        int pow;
        return pow = (int) Math.pow(base, exponent);
    }

    @Override
    public int ComputeInRange(int num1, int num2) {
//        if(num1<= 500 &&  num1>=400 && num2<=500 && num2>=400){
        if(num1<= 100 &&  num1>=1 && num2<=100 && num2>=1){
            int base = num1;
            int exponent = num2;
            int pow;
            return pow = (int) Math.pow(base, exponent);
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
