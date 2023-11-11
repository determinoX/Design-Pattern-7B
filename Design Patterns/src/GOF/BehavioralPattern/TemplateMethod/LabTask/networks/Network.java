/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.BehavioralPattern.TemplateMethod.LabTask.networks;

/**
 *
 * @author shafq
 */
/**
 * Base class of social network.
 */

import GOF.BehavioralPattern.TemplateMethod.LabTask.utilities.NetworkUtils;

/**
 * Base class of social network.
 */
public abstract class Network {
    String userName;
    String password;

    Network() {}

    /**
     * Publish the data to whatever network.
     */
    public boolean post(Message message) {
        if (logIn(this.userName, this.password)) {
            boolean result = sendData(message);
            // No need to log out after each message
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);
    abstract boolean sendData(Message message);
    abstract void logOut();

    // Static method for simulating network latency
    public static void simulateNetworkLatency() {
        NetworkUtils.simulateNetworkLatency();
    }
}
