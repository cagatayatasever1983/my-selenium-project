package com.myfirstproject;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day08_FileUpload extends TestBase{
    @Test
    public void fileUploadTest(){
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement chooseFile=driver.findElement(By.xpath("//input[@id='file-upload']"));
        String pathOfFile="C:\\Users\\User\\Desktop\\Hafsa.docx";
        chooseFile.sendKeys(pathOfFile);
        WebElement upload=driver.findElement(By.xpath("//input[@id='file-submit']"));
        upload.click();
        WebElement uploadMessage=driver.findElement(By.tagName("h3"));
        String uploadMessageStr=uploadMessage.getText();
        Assert.assertEquals("File Uploaded!",uploadMessageStr);

    }
}
