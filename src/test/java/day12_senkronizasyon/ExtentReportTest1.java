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

public class ExtentReportTest1 extends TestBase {
    protected ExtentReports extentReports;
    protected ExtentHtmlReporter extentHtmlReporter;
    protected ExtentTest extentTest;

    @Test
    public void extentReportTest1(){
        String currentDate=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

        String path=System.getProperty("user.dir")+"/test-output/report1/"+currentDate+"test_report.html";

        extentHtmlReporter=new ExtentHtmlReporter(path);

        extentReports=new ExtentReports();
        extentReports.setSystemInfo("Enviroment","Test Environment");
        extentReports.setSystemInfo("Browser","Chrome");
        extentReports.setSystemInfo("Application","Techproed");
        extentReports.setSystemInfo("SQA","John");

        extentHtmlReporter.config().setDocumentTitle("Techproed QA'S");
        extentHtmlReporter.config().setReportName("Techproed Extent Reports");

        extentReports.attachReporter(extentHtmlReporter);

        extentTest=extentReports.createTest("My Project Extent Report","This is a report for smoke test");

        extentTest.info("User goes to google homepage");
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//div[.='Ik ga akkoord']")).click();

        extentTest.info("Hungry user search baklava");
        driver.findElement(By.name("q")).sendKeys("baklava"+ Keys.ENTER);

        extentReports.flush();


    }
}
