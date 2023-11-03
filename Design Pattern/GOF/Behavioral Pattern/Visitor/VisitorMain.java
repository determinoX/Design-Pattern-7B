/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.DP_Lab6.Visitor.LabTask;


/**
 *
 * @author Zain
 */
public class VisitorMain {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
        
        ComputerPartSpecificMaintainer maintainer = new ComputerPartSpecificMaintainer();
        
        Multimedia multimedia = new Multimedia();
        
        maintainer.maintain(multimedia);
        
    }
}
