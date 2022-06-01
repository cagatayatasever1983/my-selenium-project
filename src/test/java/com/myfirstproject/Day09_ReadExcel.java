package com.myfirstproject;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Day09_ReadExcel {


    @Test
    public void readExcel() throws IOException {
        String path = ".\\src\\test\\java\\resources\\TechProed.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet1 = workbook.getSheetAt(0);
        Row row1 = sheet1.getRow(0);
        Cell cell1 = row1.getCell(0);
        System.out.println(cell1.toString());
        Cell cell2 = row1.getCell(1);
        System.out.println(cell2.toString().toUpperCase());
        String row1Cell2 = sheet1.getRow(1).getCell(0).toString();
        Assert.assertEquals("USA", row1Cell2);
        String row3Cell2 = sheet1.getRow(2).getCell(1).toString();
        System.out.println(row3Cell2);
        int numberOfRow = sheet1.getLastRowNum() + 1;
        System.out.println(numberOfRow);
        int numberOfRowUsed = sheet1.getPhysicalNumberOfRows();
        System.out.println(numberOfRowUsed);
        Map<String, String> countryCapitals = new HashMap<>();


        int rowNumber;
        for (rowNumber = 1; rowNumber < numberOfRow; rowNumber++) {
            String countries = sheet1.getRow(rowNumber).getCell(0).toString();
            System.out.println(countries);
            String capitals=sheet1.getRow(rowNumber).getCell(1).toString();
            System.out.println(capitals);
            countryCapitals.put(countries,capitals);


        }
        System.out.println(countryCapitals);




    }
}
