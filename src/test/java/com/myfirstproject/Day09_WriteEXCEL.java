//package com.myfirstproject;
//
//import org.apache.poi.ss.usermodel.*;
//import org.junit.Test;
//import org.openqa.selenium.support.ui.Wait;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.function.Function;
//
//public class Day09_WriteEXCEL {
//    @Test
//    public void writeExcel() throws IOException {
//        String path=".\\src\\test\\java\\resources\\TechProed.xlsx";
//        FileInputStream fileInputStream=new FileInputStream(path);
//        Workbook workbook= WorkbookFactory.create(fileInputStream);
//         Sheet sheet1=workbook.getSheetAt(0);
//         Row row1=sheet1.getRow(0);
//         Cell row1Cell3=row1.createCell(2);
//         row1Cell3.setCellValue("POPULATION");
//        FileOutputStream fileOutputStream=new FileOutputStream(path);
//        workbook.write(fileOutputStream);
//        Wait wait = new Wait() {
//            @Override
//            public Object until(Function isTrue) {
//                return null;
//            }
//        }
//
//
//
//
//
//
//    }
//}
