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
import GOF.StructuralPattern.Composite.LabTask.*;

public class EmployeeMain {
    public static void main(String[] args) {


            Director director = new Director("Prof. Maroof Shah (Director)", 10000);
            HOD hod1 = new HOD("Prof. Mazhar (HOD)", 8000);
            HOD hod2 = new HOD("Prof. Ahmad (HOD)", 7500);
            Teacher teacher1 = new Teacher("Mukhtiyar Zamin (Teacher)", 5000);
            Teacher teacher2 = new Teacher("Fuzail Jameel (Teacher)", 5500);
            DOO doo = new DOO("Imran Ali (DOO)", 7000);

            director.addSubordinate(hod1);
            director.addSubordinate(hod2);
            hod1.addSubordinate(teacher1);
            hod2.addSubordinate(teacher2);
            director.addSubordinate(doo);
            
            EmployeeController controller = new EmployeeController();
            String organogram = controller.generateOrganogram(director);

            System.out.println("Organization Hierarchy:");
            System.out.println(organogram);
            System.out.println();

            // Giving a bonus to all employees using Iterator
            giveBonusToAllEmployees(director);
    }
    
    public static void giveBonusToAllEmployees(IEmployee employee) {
        Queue<IEmployee> queue = new LinkedList<>();
        queue.offer(employee);

        while (!queue.isEmpty()) {
            IEmployee currentEmployee = queue.poll();
            
            //10% bouns to all
            double bonus = 0.10;
            currentEmployee.giveBonus(bonus);
//            currentEmployee.giveBonus(1000);

            for (IEmployee subordinate : currentEmployee.getSubordinates()) {
                queue.offer(subordinate);
            }
        }
    }
}
