package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.webaudio.WebAudio;

public class Day02_ThreadSleep {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(5000);
        driver.get("https://www.amazon.com");
        Thread.sleep(10000);
        driver.quit();
    }
}
