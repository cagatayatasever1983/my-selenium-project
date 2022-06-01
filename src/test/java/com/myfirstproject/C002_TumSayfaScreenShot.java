//package com.myfirstproject;
//
//import org.apache.commons.io.FileUtils;
//import org.junit.Test;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//
//import java.io.File;
//import java.io.IOException;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//
//public class C002_TumSayfaScreenShot extends TestBase {
//    @Test
//    public void tumSayfa() throws IOException {
//        driver.get("https://www.amazon.com");
//        int i=1;
//        if(i>0){
//
//
//        TakesScreenshot ts= (TakesScreenshot) driver;
//        File tumSayfaSS=new File("target/SS/photo+"+i+".jpeg");
//        File gecici=ts.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(gecici,tumSayfaSS);
//
//
//
//    }
//
//}
