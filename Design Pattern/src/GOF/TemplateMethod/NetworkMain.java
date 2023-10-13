/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.TemplateMethod;

/**
 *
 * @author FA20-BSE-042
 */
import GOF.TemplateMethod.Facebook;
import GOF.TemplateMethod.Network;
import GOF.TemplateMethod.Twitter;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NetworkMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.print("Input user name: ");
        String userName = reader.readLine();
        System.out.print("Input password: ");
        String password = reader.readLine();

        // Enter the message.
        System.out.print("Input message: ");
        String message = reader.readLine();

        System.out.println("\nChoose social network for posting message.\n" +
                "1 - Facebook\n" +
                "2 - Twitter" +
                "3 - LinkedIn" 
                
        );
        int choice = Integer.parseInt(reader.readLine());

        // Create proper network object and send the message.
        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        } else if (choice == 3) {
            network = new LinkedIn(userName, password);
        }
        network.post(message);
    }
}