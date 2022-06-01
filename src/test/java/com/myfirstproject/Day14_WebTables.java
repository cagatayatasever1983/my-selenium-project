//package com.myfirstproject;
//
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//
//import java.util.List;
//
//public class Day14_WebTables extends TestBase {
//    @Test
//    public void webTable(){
//        girisYap();
//        List<WebElement> sutunBasliklariListesi=driver.findElements(By.xpath("//thead//tr[1]//th"));
//        System.out.println("sutun Sayisi"+sutunBasliklariListesi.size());
//        WebElement tumBody=driver.findElement(By.xpath("//tbody"));
//        System.out.println(tumBody.getText());
//        List<WebElement> satirlarListesi=driver.findElements(By.xpath("//tbody//tr"));
//        System.out.println(satirlarListesi.size());
//        for(WebElement each:satirlarListesi){
//            System.out.println(each.getText());
//
//        }
//        List<WebElement> cellList=driver.findElements(By.xpath("//tbody//tr[4]//td"));
//        //System.out.println(cellList.getText());
//        for(WebElement each:cellList) {
//            System.out.println(each.getText());
//        }
//        List<WebElement>emailSutunListesi=driver.findElements(By.xpath("//tbody//td[3]"));
//
//        List<WebElement>basliklarListesi=driver.findElements(By.xpath("//tbody//tr[1]//th"));
//        int emailSutunNo=0;
//        for(int i=0; i<basliklarListesi.size();i++){
//        if(basliklarListesi.get(i).equals("Email")){
//            emailSutunNo=i;
//
//
//        }
//        }
//        List<WebElement>EmailSutunListesi=driver.findElements(By.xpath("//tbody//td["+(emailSutunNo+1)+"]"));
//
//        for(WebElement each:emailSutunListesi){
//            System.out.println(each.getText() );}
//    }
//    }
//
//
//
//
////    public void girisYap() {
////        driver.get("https://www.hotelmycamp.com");
////        driver.findElement(By.xpath("//a[text()='Log in']")).click();
////        Actions actions=new Actions(driver);
////        WebElement username=driver.findElement(By.id("UserName"));
////        actions.click(username).
////                sendKeys("manager").
////                sendKeys(Keys.TAB).
////                sendKeys("Manager1!").
////                sendKeys(Keys.ENTER)
////                .perform();
////    }