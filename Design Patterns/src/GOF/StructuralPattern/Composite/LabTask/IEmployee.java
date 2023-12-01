/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.StructuralPattern.Composite.LabTask;

/**
 *
 * @author FA20-BSE-042
 */
import java.util.*;

interface IEmployee extends Observer {
    void giveBonus(double bonus);
    double calculateSalary();
    Iterable<IEmployee> getSubordinates(); // Iterable for subordinates
}
