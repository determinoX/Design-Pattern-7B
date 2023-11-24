/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.BehavioralPattern.Command.SubExpertExample;

/**
 *
 * @author FA20-BSE-042
 */
//Concrete Command

public class LightOnCommand implements Command {

    // reference to the light
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.switchOn();
        System.out.println("Light is on");
    }

}
