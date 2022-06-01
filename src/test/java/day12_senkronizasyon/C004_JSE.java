//package day12_senkronizasyon;
//
//import com.myfirstproject.TestBase;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;
//
//public class C004_JSE extends TestBase {
//    @Test
//    public void jSE() throws InterruptedException {
//        driver.get("https://www.hyrtutorials.com");
//        JavascriptExecutor jse= (JavascriptExecutor) driver;
//        WebElement element=driver.findElement(By.id("blog-pager-older-link"));
//        Thread.sleep(4000);
//        jse.executeScript("arguments[0].scrollIntoView()",element);
//        jse.executeScript("arguments[0].click()",element);
//
//
//
//    }
//}
