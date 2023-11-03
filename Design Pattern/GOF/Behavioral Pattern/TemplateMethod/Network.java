/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.DP_Lab6.TemplateMethod.LabTask;

import GOF.DP_Lab6.TemplateMethod.LabTask.*;

/**
 *
 * @author Zain
 */

public abstract class Network {
    String userName;
    String password;

    Network() {}

    public boolean post(Message message) {
        if (logIn(this.userName, this.password)) {
            boolean result = sendData(message);
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);
    abstract boolean sendData(Message message);
    abstract void logOut();

    protected void simulateNetworkLatency() {
        try {
            int i = 0;
            System.out.println();
            while (i < 10) {
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
