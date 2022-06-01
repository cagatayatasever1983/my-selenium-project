import com.myfirstproject.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Day08_Aactions4 extends TestBase {
    @Test
    public void dragAndDropTest(){
        driver.get("https://jqueryui.com/droppable/");
        WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(frame);
        WebElement dragElement=driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement dropElement=driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(dragElement,dropElement).perform();
    }

}
