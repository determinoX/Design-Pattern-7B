/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.DP_Lab6.Visitor.LabTask;


/**
 *
 * @author Zain
 */
public interface ComputerPart {
   public void accept(ComputerPartVisitor computerPartVisitor);
}