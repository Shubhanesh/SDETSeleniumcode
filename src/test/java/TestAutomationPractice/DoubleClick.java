package TestAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        Actions action=new Actions(driver);
        //WebElement first=driver.findElement(By.xpath("//input[@id='field1']"));
       // WebElement second=driver.findElement(By.xpath("//input[@id='field2']"));
        WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
        action.doubleClick(button).perform();
    }
}