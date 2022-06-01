package com.myfirstproject;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Day0012_ExtentReports extends TestBase {



    @Test
    public void extentReportTest(){

        extentTest.info("User goes to google home page");
        extentTest.pass("User goes to google home page");
        extentTest.fail("User goes to google home page");
        extentTest.skip("User goes to google home page");
        extentTest.warning("User goes to google home page");


        driver.get("https://google.com");

        driver.findElement(By.xpath("//div[text()='Ik ga akkoord']")).click();
        extentTest.info("User search for cybertruck release date");
        driver.findElement(By.name("q")).sendKeys("Tesla Cybertruck release date"+ Keys.ENTER);

        extentReports.flush();

    }
}
