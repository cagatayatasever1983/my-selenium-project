package day12_senkronizasyon;

import com.myfirstproject.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StageMovementTest extends TestBase {
    @Test
    public void stageMovements() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        WebElement image1= driver.findElement(By.xpath("//img[@class='replace-2x img-responsive']"));
        scrollIntoViewByJS(image1);
        Thread.sleep(3000);
        Actions actions=new Actions(driver);
        actions.moveToElement(image1).perform();

        WebElement addToCatButton=driver.findElement(By.xpath("(//span[.='Add to cart'])[1]"));
        Thread.sleep(2000);
        addToCatButton.click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement product=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h2)[1]")));
        String productText= product.getText();
        Assert.assertEquals("Product successfully added to your shopping cart",productText);
        WebElement colorAndSize=driver.findElement(By.id("layer_cart_product_attributes"));
        Assert.assertEquals("Orange, S",colorAndSize.getText());
        WebElement quantity=driver.findElement(By.id("layer_cart_product_quantity"));
        Assert.assertEquals(1,quantity.getText());

    }

}
