package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_VerifyUrl {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        String expectedUrl="www.google.com";
        String actualUrl=driver.getCurrentUrl();
        if(expectedUrl.equals(actualUrl)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
            System.out.println("Expected :" +expectedUrl);
            System.out.println("Actual: "+ actualUrl);
        }

    }
}
