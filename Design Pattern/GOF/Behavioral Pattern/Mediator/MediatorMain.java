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
import java.util.ArrayList;
import java.util.List;

public class MediatorMain {
    public static void main(String[] args) {
//        User robert = new User("Robert");
//        User john = new User("John");
//        robert.sendMessage("Hi! John!");
//        john.sendMessage("Hello! Robert!");
        

        University comsatsUniversity = new University("COMSATS University");
        University nustUniversity = new University("NUST");
        Teacher teacherAli = new Teacher("Teacher Sir Ali");
        User mAli = new User("M Ali");
        User ahmad = new User("Ahmad");
        User ali = new User("Ali");
        
        
        ChatRoom.sendMessageToTarget(mAli, comsatsUniversity, "Hello, COMSATS University!");
//        ChatRoom.sendMessageToAll(mAli, List.of(comsatsUniversity, nustUniversity, teacherAli, ahmad, ali), "Hello, everyone!");

    }
}
