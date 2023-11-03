/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.DP_Lab6.Visitor.LabTask;

/**
 *
 * @author Zain
 */
public class ComputerPartSpecificMaintainer implements ComputerPartMaintainer{

    @Override
    public void maintain(Multimedia multimedia) {
        System.out.println("Multimedia is maintained only....");
    }
    
}
