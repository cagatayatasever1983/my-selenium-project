package com.myfirstproject;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C05_FileUpload extends TestBase{
    @Test
    public void test01() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement dosyaSecButonu=driver.findElement(By.id("file-upload"));
        //System.out.println(System.getProperty("user.home"));
        String farkliKisim="D:\\Users\\User";
        System.out.println(farkliKisim);
        String ortakKisim="\\Downloads\\dummy.txt";
        String yuklenecekDosyaYolu=farkliKisim+ortakKisim;
        dosyaSecButonu.sendKeys(yuklenecekDosyaYolu);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='file-submit']")).click();

    }
}
