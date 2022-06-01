package day12_senkronizasyon;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ReadExcel {
    @Test
    public void readExcelTest() throws IOException {
        String dosyaYolu="src/test/java/resources/list-countries-world-25j.xlsx";
        FileInputStream fis=new FileInputStream(dosyaYolu);
        Workbook workbook=WorkbookFactory.create(fis);
        Sheet sheet=workbook.getSheet("List of countries");
        Row row= sheet.getRow(3);
        Cell cell=row.getCell(3);
        System.out.println(cell);


    }
}
