package com.myfirstproject;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day012_JSExecutor2 extends TestBase {
    @Test
    public void jsExecutorTest() throws InterruptedException {
        driver.get("https://www.carettahotel.com");
        Thread.sleep(3000);
        WebElement ourRooms=driver.findElement(By.xpath("(//h2[@class='mb-4'])[3]"));
        scrollIntoViewByJS(ourRooms);
    }
    @Test
    public void scrollAllDownByJSTest() throws InterruptedException {
        driver.get("https://www.carettahotel.com");
        Thread.sleep(5000);
        scrollAllDownByJs();

        Thread.sleep(3000);
        scrollAllUpJS();


    }
    @Test
    public void clickByJSTest() throws InterruptedException {
        driver.get("https://www.carettahotel.com");
        Thread.sleep(5000);
        WebElement checkAvailability=driver.findElement(By.xpath("//input[@type='submit']"));
        clickByJS(checkAvailability);
        WebElement search=driver.findElement(By.xpath("//input[@type='submit']"));
        clickByJS(search);
    }
    @Test
    public void setValueByJS() throws InterruptedException {
        driver.get("https://www.carettahotel.com");
        Thread.sleep(5000);
       WebElement checkOutDate= driver.findElement(By.id("checkout_date"));
       setValueByJS(checkOutDate,"6/25/2022");

    }

}
