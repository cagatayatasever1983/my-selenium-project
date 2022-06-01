package com.myfirstproject;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Day0014_WebTables extends TestBase {
    @Test
    public void webTable() {
        girisYap();
        List<WebElement> basliklarListesi = driver.findElements(By.xpath("//thead//tr[1]//th"));
        int emailSutunNo = 0;
        for (int i = 0; i < basliklarListesi.size(); i++) {
            if (basliklarListesi.get(i).getText().equals("Email")) {
                emailSutunNo = i;

            }
        }
        List<WebElement> emailSutunListesi = driver.findElements(By.xpath("//tbody//td[" + (emailSutunNo + 1) + "]"));
        for (WebElement each : emailSutunListesi) {
            System.out.println(each.getText());
        }
    }

       public void dinamikYazici (int satir,int sutun) {
           girisYap();

           WebElement arananCell = driver.findElement(By.xpath("//tbody//tr[" + satir + "]//td[" + sutun + "]"));
           System.out.println(arananCell.getText());
       }





        @Test
        public void test01(){
        dinamikYazici(4,4);
        }










    public void girisYap() {
        driver.get("https://www.hotelmycamp.com");
        driver.findElement(By.xpath("//a[text()='Log in']")).click();
        Actions actions = new Actions(driver);
        WebElement username = driver.findElement(By.id("UserName"));
        actions.click(username).
                sendKeys("manager").
                sendKeys(Keys.TAB).
                sendKeys("Manager1!").
                sendKeys(Keys.ENTER)
                .perform();
    }

}
