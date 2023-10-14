package com.kodilla.patterns.singleton;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SettingsFileEngineTestSuite {
    private static SettingsFileEngine settingsFileEngine;
    @BeforeAll
    public static void openSettingFile(){
        settingsFileEngine = SettingsFileEngine.INSTANCE;
        settingsFileEngine.open("myapp.settings");
    }
    @AfterAll
    public static void closeSettingFile(){
        settingsFileEngine.close();
    }
    @Test
    void testGetFileName(){
        String filename = settingsFileEngine.getFileName();
        System.out.println("Oppened: "+ filename);

        assertEquals("myapp.settings", filename);
    }
    @Test
    void testLoadSettings(){
        boolean resoult = settingsFileEngine.loadSetting();

        assertTrue(resoult);
    }
    @Test
    void testSaveSettings(){
        boolean reaoult = settingsFileEngine.saveSatting();

        assertTrue(reaoult);
    }
}
