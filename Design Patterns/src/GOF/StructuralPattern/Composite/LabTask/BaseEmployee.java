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


abstract class BaseEmployee implements IEmployee {
    protected String name;
    protected double salary;
    protected double bonus;
    protected List<IEmployee> subordinates;
    private UniversitySubject subject;

    public BaseEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
        this.subject = new UniversitySubject();
    }

//    public void giveBonus(double bonus) {
    public void giveBonus(double b) {
        this.bonus = this.salary * b;
        this.salary += bonus;
        System.out.println(this.name + " received a bonus of " + bonus + ". New salary: " + this.salary);
        this.subject.notifyObservers(bonus); // Notify observers about the bonus
    }

    public double calculateSalary() {
        return this.salary;
    }

    public void addSubordinate(IEmployee employee) {
        this.subordinates.add(employee);
        this.subject.attach(employee); // Attach subordinates as observers
    }

    public Iterable<IEmployee> getSubordinates() {
        return this.subordinates;
    }

    public void update(double bonus) {
        System.out.println(this.name + " received a notification about a bonus of " + bonus + "\n");
    }
}