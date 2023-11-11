/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.BehavioralPattern.Mediator.LabTask;

/**
 *
 * @author shafq
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

interface Colleague {
    String getName();

    void sendMessage(String message);
}

class User implements Colleague {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.sendMessage(this, message);
    }
}

class University implements Colleague {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public University(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.sendMessage(this, message);
    }
}

class Teacher implements Colleague {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.sendMessage(this, message);
    }
}

class ChatRoom {
    public static void sendMessage(Colleague sender, Colleague target, String message) {
        System.out.println(new Date().toString() + " [" + sender.getName() + " -> " + target.getName() + "] : " + message);
    }

    public static void sendMessageToGroup(Colleague sender, List<Colleague> targets, String message) {
        for (Colleague target : targets) {
            sendMessage(sender, target, message);
        }
    }
}

public class MediatorPatternDemo {
    public static void main(String[] args) {
        User mAli = new User("M Ali");
        University comsatsUniversity = new University("COMSATS University");
        University nust = new University("NUST");
        Teacher teacherAli = new Teacher("Teacher Sir Ali");
        User ahmad = new User("Ahmad");
        User ali = new User("Ali");

        mAli.sendMessageTo(comsatsUniversity, "Hello COMSATS!");
        mAli.sendMessageToGroup(List.of(comsatsUniversity, nust, teacherAli, ahmad, ali), "Hello everyone!");
    }
}

