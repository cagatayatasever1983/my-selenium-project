//package day12_senkronizasyon;
//
//import com.myfirstproject.TestBase;
//import org.apache.commons.io.FileUtils;
//import org.junit.Test;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//
//import java.io.File;
//import java.io.IOException;
//import java.text.spi.DateFormatProvider;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//
//public class C0002_TumSayfaSS extends TestBase {
//
//    @Test
//    public void screenShotTesti() throws IOException {
//        driver.get("https://www.amazon.com");
//        LocalDateTime date=LocalDateTime.now();
//        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("YYMMDDHHmmss");
//        String tarih=date.format(dtf);
//
//
//        TakesScreenshot ts= (TakesScreenshot) driver;
//        File tumSayfaScreenShot=new File("target/tumSayfa/photo+"+date+".jpeg");
//        File gecici=ts.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(gecici,tumSayfaScreenShot);
//
//    }
//}
