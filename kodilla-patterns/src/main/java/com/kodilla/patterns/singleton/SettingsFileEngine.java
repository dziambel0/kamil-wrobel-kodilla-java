package com.kodilla.patterns.singleton;

public enum SettingsFileEngine {
    INSTANCE;
    private String fileName;

    public String getFileName(){
        return fileName;
    }
    public void open(final String fileName){
        this.fileName = fileName;
        System.out.println("Opening the setting file");
    }
    public void close(){
        this.fileName = "";
    }
    public boolean loadSetting(){
        System.out.println("Load seting from file");
        return true;
    }
    public boolean saveSatting(){
        System.out.println("Save setting from file");
        return true;
    }
}
