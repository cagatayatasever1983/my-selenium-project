package day12_senkronizasyon;

import com.myfirstproject.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class C02_ExplicitlyWait extends TestBase {
    @Test
    public void enableTest(){
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        WebElement enableKutusu=driver.findElement(By.xpath("//input[@type='text']"));
        Assert.assertTrue(!enableKutusu.isEnabled());
        driver.findElement(By.xpath("//button[text()='Enable']")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(enableKutusu));
        WebElement itsEnabledaziElementi=driver.findElement(By.xpath("//p[text()=\"It's enabled!\"]"));
        Assert.assertTrue(itsEnabledaziElementi.isDisplayed());
        Assert.assertTrue(enableKutusu.isEnabled());

    }
}
