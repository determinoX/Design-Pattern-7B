/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab7.Builder.MealBuilder;

/**
 *
 * @author fa20-bse-017
 */
public interface Item {
   public String name();
   public Packing packing();
   public float price();	
}