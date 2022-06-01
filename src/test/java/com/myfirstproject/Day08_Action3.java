package com.myfirstproject;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Day08_Action3 extends TestBase{

    @Test
    public void pageUpDown() throws InterruptedException {
        driver.get("https://www.amazon.com");
        Thread.sleep(3000);
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.ARROW_UP);
    }
}
