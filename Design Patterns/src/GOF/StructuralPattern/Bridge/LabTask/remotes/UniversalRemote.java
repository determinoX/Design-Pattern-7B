/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.StructuralPattern.Bridge.LabTask.remotes;

import GOF.StructuralPattern.Bridge.LabTask.devices.Device;


/**
 *
 * @author FA20-BSE-042
 */
public class UniversalRemote extends BasicRemote {

    public UniversalRemote(Device device) {
        super.device = device;
    }

    @Override
    public void maxVolume() {
        System.out.println("Remote: setting max volume");
        device.setVolume(100);
    }
}
