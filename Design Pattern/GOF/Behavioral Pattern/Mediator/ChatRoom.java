/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab5.Mediator.LabTask;

/**
 *
 * @author FA20-BSE-017
 */
import java.util.Date;
import java.util.List;

public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
    
    public static void sendMessageToTarget(User sender, User target, String message){
        System.out.println(new Date().toString() + " [" + sender.getName() + " -> " + target.getName() + "] : " + message);
    }
    
    public static void sendMessageToAll(User sender, List<User> targets, String message){
        StringBuilder targetNames = new StringBuilder();
        
        for (User target : targets) {
            targetNames.append(target.getName()).append(", ");
        }
        
        targetNames.delete(targetNames.length() - 2, targetNames.length());
        System.out.println(new Date().toString() + " [" + sender.getName() + " -> " + targetNames + "] : " + message);
        
    }
}
