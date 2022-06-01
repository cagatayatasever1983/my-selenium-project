package day12_senkronizasyon;

import com.myfirstproject.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Day012_Synchronization1 extends TestBase {
    @Test
    public void synchronization() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//div[@id='start']//button")).click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement helloWorld=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']//h4")));
        Assert.assertEquals("Hello World!",helloWorld.getText());

//        String helloWorld=driver.findElement(By.xpath("//div[@id='finish']//h4")).getText();
//        Assert.assertEquals("Hello World!",helloWorld);
    }

}
