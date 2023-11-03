/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab7.Builder.LabTask;


/**
 *
 * @author fa20-bse-017
 */
public class DietBurger extends Burger {

   @Override
   public float price() {
      return 45.5f;
   }

   @Override
   public String name() {
      return "Diet Burger";
   }
}