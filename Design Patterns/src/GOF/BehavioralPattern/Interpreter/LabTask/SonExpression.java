/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.BehavioralPattern.Interpreter.LabTask;

/**
 *
 * @author FA20-BSE-042
 */
public class SonExpression implements Expression{
    private Expression fatherExpression = null;
    private Expression sonExpression = null;

    public SonExpression(Expression fatherExpression, Expression sonExpression) {
        this.fatherExpression = fatherExpression;
        this.sonExpression = sonExpression;
    }

    @Override
    public boolean interpret(String context) {
        return fatherExpression.interpret(context) && sonExpression.interpret(context);
    }
}