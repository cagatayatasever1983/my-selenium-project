package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_VerifyTitleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        String actualTitle=driver.getTitle();
        System.out.println("actualTitle:"+actualTitle);
        String expectedTitle="Google";
        if(expectedTitle.equals(actualTitle)){
            System.out.println("passed");
        }else{
            System.out.println("failed");

        }
    }
}
