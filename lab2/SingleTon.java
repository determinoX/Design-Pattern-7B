/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author FA20-BSE-042
 */
class Singleton {

    private static volatile Singleton instance = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized(Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
 public class SingleTon {

  public static void main(String[] args) {
    // Get the single instance of Singleton
    Singleton singleton1 = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();

    // Check if both instances are the same
    if (singleton1 == singleton2) {
      System.out.println("singleton1 and singleton2 are the same instance.");
    } else {
      System.out.println("singleton1 and singleton2 are different instances.");
    }
  }
}
