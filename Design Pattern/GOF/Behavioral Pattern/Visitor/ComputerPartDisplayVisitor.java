/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.DP_Lab6.Visitor.LabTask;


/**
 *
 * @author Zain
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
       System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
       System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
       System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
       System.out.println("Displaying Monitor.");
    }
    
    @Override
    public void visit(Multimedia multimedia) {
       System.out.println("Displaying Multimedia.");
    }
}