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
public class Demo {

    public static void main(String[] args) {

        RemoteControl control = new RemoteControl();
        Light light = new Light();
        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);

        // switch on
        control.setCommand(lightsOn);
        control.pressButton();

        // switch off
        control.setCommand(lightsOff);
        control.pressButton();

    }

}
