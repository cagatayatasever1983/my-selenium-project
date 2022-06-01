package day12_senkronizasyon;

import com.myfirstproject.TestBase;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.text.spi.DateFormatProvider;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C003_IstenenWebElementsSS extends TestBase {
    @Test
    public void WebElementSS() throws IOException {
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        WebElement sonucYaziElementi = driver.findElement(By.xpath("//h1[@class=\"a-size-base s-desktop-toolbar a-text-normal\"]"));
        File sonucYaziElementiSS=new File("target/SS/sonuc.jpeg");
        File temp=sonucYaziElementi.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(temp,sonucYaziElementiSS);

    }
    @Test
    public void tumSayfaSS() throws IOException {
        driver.get("https://www.techproed.com");
        LocalDateTime date=LocalDateTime.now();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("YYMMDDHHMMSS");
        String tarih=date.format(dtf);

        TakesScreenshot ts= (TakesScreenshot) driver;
        File tumSayfaSS=new File("target/Hafsa-Kerem/tumScreen+"+tarih+".jpeg");
        File temp=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(temp,tumSayfaSS);

    }
}
