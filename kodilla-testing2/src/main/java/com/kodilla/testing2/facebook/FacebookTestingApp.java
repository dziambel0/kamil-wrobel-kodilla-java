package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriversConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class FacebookTestingApp {
    public static final String XPATH_COOKIES = "//div[contains(@class, \"_al64\")]/button[2]";
    public static final String XPATH_NEW_ACCOUNT = "//div[contains(@class, \"_6ltg\")]/a";
    public static final String XPATH_DAY = "//select[@id=\"day\"]";
    public static final String XPATH_MONTH = "//*[@id=\"month\"]";

    public static final String XPATH_YEAR = "//*[@id=\"year\"]";
    public static void main(String[] args) {
        WebDriver driver = WebDriversConfig.getDriver(WebDriversConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement cookies = driver.findElement(By.xpath(XPATH_COOKIES));
        cookies.click();

        WebElement newAccount = driver.findElement(By.xpath(XPATH_NEW_ACCOUNT));
        newAccount.click();

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(selectComboDay);
        selectDay.selectByIndex(4);

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(selectComboMonth);
        selectMonth.selectByIndex(4);

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(selectComboYear);
        selectYear.selectByIndex(4);
    }
}
