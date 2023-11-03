/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab3.observer.SimpleObserver;

/**
 *
 * @author fa20-bse-017
 */
public class ObserverPatternMain {
    public static void main(String[] args) {
        Subject subject = new Subject();
        
        new HexaObserver(subject);
        OctalObserver obj = new OctalObserver(subject);
        new BinaryObserver(subject);
        
        System.out.println("Here all Observers all attached: ");
        System.out.println("First state change: 15");
        subject.setState(15);
        
        System.out.println("\nDetaching Octal Observer Here...");
        subject.Detach(obj);
        
        System.out.println("\nHere two Observers all attached: ");
        System.out.println("First state change: 10");
        subject.setState(10);
    }
    
}
