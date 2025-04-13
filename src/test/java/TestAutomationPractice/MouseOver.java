package TestAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        Actions act =new Actions(driver);
        WebElement button=driver.findElement(By.xpath("//div[@class='dropdown-content']"));
        WebElement first_ele=driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
        act.moveToElement(button).moveToElement(first_ele).click().build().perform();
    }
}
