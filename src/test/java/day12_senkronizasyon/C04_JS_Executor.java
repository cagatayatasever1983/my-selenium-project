package day12_senkronizasyon;

import com.myfirstproject.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class C04_JS_Executor extends TestBase {
    @Test
    public void JSExecutorTest() throws InterruptedException {
        driver.get("https://www.amazon.com");
        JavascriptExecutor jse= (JavascriptExecutor) driver;
        WebElement shop=driver.findElement(By.xpath("(//a[@class='a-link-normal see-more truncate-1line'])[15]"));
        Thread.sleep(3000);

       // jse.executeScript("arguments[0].scrollIntoView(true);",shop);
        jse.executeScript("arguments[0].click;",shop);


        Thread.sleep(3000);

    }
}
