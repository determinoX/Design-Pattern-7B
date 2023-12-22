/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.StructuralPattern.Bridge.RFExample;

/**
 *
 * @author FA20-BSE-042
 */
import GOF.StructuralPattern.Bridge.RFExample.devices.Device;
import GOF.StructuralPattern.Bridge.RFExample.devices.Radio;
import GOF.StructuralPattern.Bridge.RFExample.devices.Tv;
import GOF.StructuralPattern.Bridge.RFExample.remotes.AdvancedRemote;
import GOF.StructuralPattern.Bridge.RFExample.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
