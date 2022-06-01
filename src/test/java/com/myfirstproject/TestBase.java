package com.myfirstproject;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public abstract class TestBase {
    protected static WebDriver driver;
    protected ExtentReports extentReports;
    protected ExtentTest extentTest;
    protected ExtentHtmlReporter extentHtmlReporter;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        String currentDate=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String path=System.getProperty("user.dir")+"/test-output/report/"+currentDate+"extent_report.html";
        extentHtmlReporter=new ExtentHtmlReporter(path);
        extentReports=new ExtentReports();

        extentReports.setSystemInfo("Enviroment","Test Enviroment");
        extentReports.setSystemInfo("Browser","Chrome");
        extentReports.setSystemInfo("Application","Techproed");
        extentReports.setSystemInfo("SQA","Cagatay");
        extentHtmlReporter.config().setDocumentTitle("TechProed BlueCar");
        extentReports.attachReporter(extentHtmlReporter);
        extentTest=extentReports.createTest("My Project Extent Report","This is for smoke test report");

    }
    @After
    public void tearDown(){
//        driver.quit();
        extentReports.flush();

    }
     public static void selectCheckBox(WebElement checkboxElement, boolean checked){
        if(checked){
            if(!checkboxElement.isSelected()){
                checkboxElement.click();
            }
        }else{
            if(checkboxElement.isSelected()){
                checkboxElement.click();
            }
        }

     }
     public static void switchToTargetWindow(String targetTitle) {
         for (String handle : driver.getWindowHandles()) {
             String title = driver.switchTo().window(handle).getTitle();
             if (title.equals(targetTitle)) {
                 System.out.println("Page found:" + driver.getTitle());
                 return;
             }
         }
     }
        public void scrollIntoViewByJS(WebElement element){
            JavascriptExecutor js= (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);",element);


         }
         public void scrollAllDownByJs(){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

         }
         public void scrollAllUpJS(){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
         }
         public void clickByJS(WebElement element){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",element);

         }
         public void setValueByJS(WebElement element,String text){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','"+text+"')",element);

         }
     }


