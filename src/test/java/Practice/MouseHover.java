package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
       WebElement pointme= driver.findElement(By.xpath("//button[@class='dropbtn']"));
       WebElement mobile=driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
      // WebElement laptop=driver.findElement(By.xpath("//a[normalize-space()='Laptops']"));
       Actions act=new Actions(driver);
       act.moveToElement(pointme).moveToElement(mobile).click().build().perform();


    }
}
