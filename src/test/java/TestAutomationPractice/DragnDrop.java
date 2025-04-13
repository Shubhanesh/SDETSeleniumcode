package TestAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        Actions actions=new Actions(driver);

       WebElement source_ele= driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement targest_ele=driver.findElement(By.xpath("//div[@id='droppable']"));
        actions.dragAndDrop(source_ele,targest_ele).perform();

    }
}
