package com.myfirstproject;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FileDownload extends TestBase{
    @Test
    public void test01() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/download");
        WebElement dummyLinki=driver.findElement(By.xpath("//*[text()='dummy.txt']"));
        dummyLinki.click();
        Thread.sleep(5000);
        String farkliKisim="D:\\Users\\User";
        System.out.println(farkliKisim);
        String ortakKisim="\\Downloads\\dummy.txt";
        String arananDosyaYolu=farkliKisim+ortakKisim;
        Assert.assertTrue(Files.exists(Paths.get(arananDosyaYolu)));
        //System.out.println(Files.exists((Paths.get(arananDosyaYolu))));
    }




}
