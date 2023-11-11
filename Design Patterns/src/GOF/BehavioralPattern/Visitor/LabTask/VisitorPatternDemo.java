/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.BehavioralPattern.Visitor.LabTask;

/**
 *
 * @author shafq
 */
public class VisitorPatternDemo {
   public static void main(String[] args) {

      // Create a Computer with Multimedia
      ComputerPart computer = new Computer();
      ComputerPart multimedia = new Multimedia();
      
      // Visitor to display parts
      ComputerPartVisitor displayVisitor = new ComputerPartDisplayVisitor();
      computer.accept(displayVisitor);
      multimedia.accept(displayVisitor);

      // Maintainer to maintain specific part
      ComputerPartMaintainer maintainer = new SpecificPartMaintainer();
      multimedia.accept(maintainer);
   }
}


