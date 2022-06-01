package day12_senkronizasyon;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.myfirstproject.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Day11_ExtentReports2 extends TestBase {
    protected ExtentReports extentReports;
    protected ExtentHtmlReporter extentHtmlReporter;
    protected ExtentTest extentTest;

    @Test
    public void extentReportTest(){
        String currentDate=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String path=System.getProperty("user.dir")+"/newfolder/report/"+currentDate+"report.html";

        extentHtmlReporter=new ExtentHtmlReporter(path);

        extentReports=new ExtentReports();
        extentReports.setSystemInfo("Environment","Test Environment");
        extentReports.setSystemInfo("Browser","Chrome");
        extentReports.setSystemInfo("Application","Techproed");
        extentReports.setSystemInfo("SQA","Cagatay");
        extentHtmlReporter.config().setDocumentTitle("Techproed blue car");
        extentHtmlReporter.config().setReportName("Extend Report");

        extentReports.attachReporter(extentHtmlReporter);


        extentTest=extentReports.createTest("My project extend report","This is for smoke test report");
        extentTest.info("User goes to google homepage");
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//div[.='Ik ga akkoord']")).click();
        extentTest.info("User search cybertruck release date");
        driver.findElement(By.name("q")).sendKeys("Tesla Cybertruck release date"+Keys.ENTER);


       extentReports.flush();





    }
}
