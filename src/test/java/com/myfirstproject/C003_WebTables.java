package com.myfirstproject;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C003_WebTables extends TestBase {

    @Test
    public void dinamikYazisi() {
    }

    public void girisYap() {
        driver.get("https://www.hotelmycamp.com");
        driver.findElement(By.xpath("//a[text()='Log in']")).click();
        Actions actions = new Actions(driver);
        WebElement username = driver.findElement(By.id("UserName"));
        actions.click(username).
                sendKeys("manager").
                sendKeys(Keys.TAB).
                sendKeys("Manager1!").
                sendKeys(Keys.ENTER)
                .perform();

    }
}
