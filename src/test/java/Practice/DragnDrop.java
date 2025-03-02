package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DragnDrop {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        Actions action=new Actions(driver);
       WebElement target_ele= driver.findElement(By.xpath("//div[@id='draggable']"));
       WebElement Droppedele=driver.findElement(By.xpath("//div[@id='droppable']"));
       action.dragAndDrop(target_ele,Droppedele).perform();
    }
}
