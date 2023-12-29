/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CommunicationSystem;

/**
 *
 * @author shafq
 */
public class SingletonSettings {
    private static SingletonSettings instance;
    private String settingsData;

    private SingletonSettings() {
        // Initialization logic
        settingsData = "Default settings";
    }

    public static SingletonSettings getInstance() {
        if (instance == null) {
            instance = new SingletonSettings();
        }
        return instance;
    }

    public String getSettingsData() {
        return settingsData;
    }

    public void setSettingsData(String data) {
        this.settingsData = data;
    }
}
