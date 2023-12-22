/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.StructuralPattern.Bridge.LabTask;

/**
 *
 * @author FA20-BSE-042
 */
import GOF.StructuralPattern.Bridge.LabTask.devices.Device;
import GOF.StructuralPattern.Bridge.LabTask.devices.Radio;
import GOF.StructuralPattern.Bridge.LabTask.devices.Tv;
import GOF.StructuralPattern.Bridge.LabTask.devices.AC;
import GOF.StructuralPattern.Bridge.LabTask.remotes.AdvancedRemote;
import GOF.StructuralPattern.Bridge.LabTask.remotes.BasicRemote;
import GOF.StructuralPattern.Bridge.LabTask.remotes.UniversalRemote;

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
        
         System.out.println("Tests with AC and universal remote.");
         AC ac = new AC();
         UniversalRemote universalRemote = new UniversalRemote(ac);
         universalRemote.power();
         universalRemote.maxVolume();
         device.isACPoweredOn();
    }
}
