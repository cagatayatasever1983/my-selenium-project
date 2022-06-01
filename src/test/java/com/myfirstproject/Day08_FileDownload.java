package com.myfirstproject;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Day08_FileDownload extends TestBase {
    @Test
    public void downloadTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(By.linkText("sample.png")).click();
        Thread.sleep(3000);
        String path="D:\\Users\\User\\Downloads\\sample.png";
        System.out.println(path);
        boolean isFileExist= Files.exists(Paths.get("path"));
        Assert.assertTrue(isFileExist);


    }
}
