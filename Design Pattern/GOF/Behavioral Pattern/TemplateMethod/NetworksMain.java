/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.DP_Lab6.TemplateMethod.LabTask;

/**
 *
 * @author Zain
 */

import GOF.DP_Lab6.TemplateMethod.LabTask.*;
//import GOF.DP_Lab6.TemplateMethod.LabTask.Facebook;
//import GOF.DP_Lab6.TemplateMethod.LabTask.Network;
//import GOF.DP_Lab6.TemplateMethod.LabTask.Twitter;
//import GOF.DP_Lab6.TemplateMethod.LabTask.LinkedIn;
//import GOF.DP_Lab6.TemplateMethod.LabTask.Message;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NetworksMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        Network network = null;
        System.out.print("Input user name: ");
        String userName = reader.readLine();
        System.out.print("Input password: ");
        String password = reader.readLine();
        
        Boolean check = true;

        do{
            // Enter the message.
            System.out.print("Enter message: ");
            String messageDetails = reader.readLine();
            
            System.out.println("Choose message type:\n"+ 
                    "1 - ERROR\n" +
                    "2 - WARNING\n" +
                    "3 - INFO"
            );
            int messageTypeChoice = Integer.parseInt(reader.readLine());
          
            MessageType messageType = MessageType.ERROR;
            
            if(messageTypeChoice == 1){
                messageType = MessageType.ERROR;
            }else if(messageTypeChoice == 2){
                messageType = MessageType.WARNING;
            }else if(messageTypeChoice == 3){
                messageType = MessageType.INFO;
            }else{
                messageType = MessageType.ERROR;
            }

            System.out.println("\nChoose social network for posting message.\n" +
                    "1 - Facebook\n" +
                    "2 - Twitter\n" +
                    "3 - LinkedIn\n" +
                    "4 - Leave empty for all...." 
            );
            int Networkchoice = Integer.parseInt(reader.readLine());
            String networkTypeInput;
            // Create proper network object and send the message.
            if (Networkchoice == 1) {
                networkTypeInput = "Facebook";
            } else if (Networkchoice == 2) {
                networkTypeInput = "Twitter";
            } else if (Networkchoice == 3) {
                networkTypeInput = "LinkedIn";
            } else {
                networkTypeInput = "";
            }
            
            NetworkType networkType = (networkTypeInput.isEmpty()) ? null : NetworkType.valueOf(networkTypeInput);
             
            Message message = new Message(messageDetails, messageType, networkType);
            Network network = null;
            
            
            if (message.getNetworkType() == null) {
                network = new Facebook(userName, password);
//                network.post(message.getDescription());
                network.post(message);
                network = new Twitter(userName, password);
                network.post(message);
                network = new LinkedIn(userName, password);
                network.post(message);
            } else {
                if (networkTypeInput == "Facebook") {
                    network = new Facebook(userName, password);
                    network.post(message);
                } else if (networkTypeInput == "Twitter") {
                    network = new Twitter(userName, password);
                    network.post(message);
                } else if (networkTypeInput == "LinkedIn") {
                    network = new LinkedIn(userName, password);
                    network.post(message);
                }
            }
            
            
            
//            network.post(message);
            
            System.out.print("Do you want to Continue (Y/N)? ");
            String continueInput = reader.readLine();
            if (!continueInput.equalsIgnoreCase("Y")) {
                check = false;
                break;
                
            }
            
        }while(check);
    }
}
