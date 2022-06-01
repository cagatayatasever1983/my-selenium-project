package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_BasicNavigations {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
//        driver.close();
        driver.quit();

    }
}
