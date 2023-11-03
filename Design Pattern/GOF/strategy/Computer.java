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
abstract class Computer implements Strategy{
    Computer nextStrategy = null;
    public abstract int ComputeInRange(int num1, int num2);
}
