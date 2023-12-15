/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.BehavioralPattern.Memento.refactoringguru.commands;

/**
 *
 * @author FA20-BSE-042
 */
public interface Command {
    String getName();
    void execute();
}
