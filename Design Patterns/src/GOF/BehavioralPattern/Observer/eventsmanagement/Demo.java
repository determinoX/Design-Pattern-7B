/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.BehavioralPattern.Observer.eventsmanagement;

/**
 *
 * @author shafq
 */
import GOF.BehavioralPattern.Observer.eventsmanagement.editor.Editor;
import GOF.BehavioralPattern.Observer.eventsmanagement.listeners.EmailNotificationListener;
import GOF.BehavioralPattern.Observer.eventsmanagement.listeners.LogOpenListener;
import GOF.BehavioralPattern.Observer.eventsmanagement.listeners.SMSSupportListener;

public class Demo {
    private static final String LOG_FILE_PATH = "/path/to/log/file.txt";
    private static final String ADMIN_EMAIL = "admin@example.com";
    private static final String PHONE_NUMBER = "1234567890"; // Replace with the actual phone number
    private static final int MAX_SMS_LENGTH = 160;

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener(LOG_FILE_PATH));
        editor.events.subscribe("save", new EmailNotificationListener(ADMIN_EMAIL));
        editor.events.subscribe("save", new SMSSupportListener(PHONE_NUMBER, MAX_SMS_LENGTH));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
