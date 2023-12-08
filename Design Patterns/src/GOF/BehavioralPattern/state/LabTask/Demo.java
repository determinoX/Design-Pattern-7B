/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.BehavioralPattern.state.LabTask;

/**
 *
 * @author FA20-BSE-042
 */
import GOF.BehavioralPattern.state.LabTask.ui.Player;
import GOF.BehavioralPattern.state.LabTask.ui.UI;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
