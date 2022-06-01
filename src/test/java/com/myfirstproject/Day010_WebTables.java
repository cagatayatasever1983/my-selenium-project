package com.myfirstproject;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;
import java.util.List;



public class Day010_WebTables extends TestBase {
    @Test
    public void printTable() {
        driver.get("https://the-internet.herokuapp.com/tables");
        System.out.println("Print Table");
        WebElement table = driver.findElement(By.xpath("//table[@id='table1']"));
        System.out.println(table.getText());
        System.out.println("****Printing Table Data");
        List<WebElement> tableData = driver.findElements(By.xpath("//table[@id='table1']//td"));
        for (WebElement each : tableData) {
            System.out.println(each.getText());
        }

    }

    @Test
    public void getRows() {
        driver.get("https://the-internet.herokuapp.com/tables");
        System.out.println("Print Rows");
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='table1']//tr"));
        for (WebElement eachRow : allRows) {
            System.out.println(eachRow.getText());
        }
    }

    @Test
    public void getLastRow() {
        driver.get("https://the-internet.herokuapp.com/tables");
        System.out.println("Print Last Row");
        WebElement lastRowData = driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[last()]"));
    }

    @Test
    public void getColumn5() {
        printData(2, 5);
        printData(2, 5, "table1");


    }

    public void printData(int row, int column) {
        driver.get("https://the-internet.herokuapp.com/tables");
        String xpath = "//table[@id='table1']//tbody//tr[" + row + "]//td[" + column + "]";
        WebElement cellData = driver.findElement(By.xpath(xpath));
        System.out.println(cellData.getText());


    }

    public void printData(int row, int column, String tableID) {
        driver.get("https://the-internet.herokuapp.com/tables");
        String xpath = "//table[@id='"+tableID+"']//tbody//tr["+row+"]//td["+column+"]";
        WebElement cellData = driver.findElement(By.xpath(xpath));
        System.out.println(cellData.getText());
    }
}

