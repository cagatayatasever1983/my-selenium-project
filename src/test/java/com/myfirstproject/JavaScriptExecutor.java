package com.myfirstproject;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutor extends TestBase {
    @Test
    public void jsExecutorTest() throws InterruptedException {

        driver.get("https://www.carettahotel.com");
        Thread.sleep(5000);
        WebElement ourRooms = driver.findElement(By.xpath("(//h2[@class='mb-4'])[3]"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true)", "ourRooms");
//        WebElement email=driver.findElement(By.xpath("//span[.='info@carettahotel.com']"));
//        jse.executeScript("arguments[0].scrollIntoView(true);","email");

    }
}

