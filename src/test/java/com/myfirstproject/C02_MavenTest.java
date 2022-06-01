package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

public class C02_MavenTest {

    @Test
    public void name() {
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));
        System.out.println("CAGATAY");
        //D:\Users\User\Downloads
        String dosyaYolu=System.getProperty("user.home")+"\\Desktop\\text.txt";
        System.out.println(dosyaYolu);
        //System.out.println(Files.exists(Paths.get(dosyaYolu)));
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));giti
    }
    //        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        driver.get("http://zero.webappsecurity.com");
//        driver.findElement(By.xpath("(//button[@id='signin_button'])")).click();
//        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username");
//        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
//        driver.findElement(By.xpath("//input[@name='submit']")).click();
//        driver.navigate().back();
//        driver.findElement(By.xpath("(//*[text()='Online Banking'])[1]")).click();
//        driver.findElement(By.xpath("//span[@id='pay_bills_link']")).click();
//        driver.findElement(By.xpath("//input[@id='sp_amount']")).sendKeys("5000");
//        driver.findElement(By.xpath("//input[@id='sp_date']")).sendKeys("2020-09-10");
//        driver.findElement(By.xpath("//input[@id='pay_saved_payees']")).click();
//        WebElement sonucYazisiElementi=driver.findElement(By.xpath("//div[@id='alert_content']"));
//        if(sonucYazisiElementi.getText().equals("The payment was successfully submitted.")){
//            System.out.println("Passed");
//        }else{
//            System.out.println("Failed");
//        }
//        driver.close();

    }

