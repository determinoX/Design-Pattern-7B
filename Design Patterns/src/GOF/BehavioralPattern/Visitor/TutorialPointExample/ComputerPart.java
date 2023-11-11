/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.BehavioralPattern.Visitor.TutorialPointExample;

/**
 *
 * @author shafq
 */
public interface ComputerPart {
   public void accept(ComputerPartVisitor computerPartVisitor);
}