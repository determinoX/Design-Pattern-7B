    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.DP_Lab6.Visitor.LabTask;

/**
 *
 * @author Zain
 */
public class Computer implements ComputerPart {
	
    ComputerPart[] parts;

    public Computer(){
       parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor(), new Multimedia()};		
    } 


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
       for (int i = 0; i < parts.length; i++) {
          parts[i].accept(computerPartVisitor);
       }
       computerPartVisitor.visit(this);
    }
}