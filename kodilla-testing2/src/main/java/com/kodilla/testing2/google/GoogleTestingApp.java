package com.kodilla.testing2.google;

import com.kodilla.testing2.config.WebDriversConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {
    public static final String SEARCHFIELD = "q";

    public static void main(String[] args) {
        WebDriver driver = WebDriversConfig.getDriver(WebDriversConfig.CHROME);
        driver.get("https://www.google.com");

        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();

        WebElement searchField = driver.findElement(By.name(SEARCHFIELD));
        searchField.sendKeys("Kodilla");
        searchField.submit();
    }
}