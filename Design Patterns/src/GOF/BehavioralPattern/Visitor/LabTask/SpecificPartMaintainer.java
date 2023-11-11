/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.BehavioralPattern.Visitor.LabTask;

/**
 *
 * @author shafq
 */
public class SpecificPartMaintainer implements ComputerPartMaintainer {

   @Override
   public void maintain(ComputerPart part) {
      // Implement maintenance logic for the specific part
      System.out.println("Maintaining specific part: " + part.getClass().getSimpleName());
   }
}

