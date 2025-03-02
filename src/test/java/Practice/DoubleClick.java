package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DoubleClick {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
        WebElement box2=driver.findElement(By.xpath("//input[@id='field2']"));
        WebElement copytext=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
        box1.clear();
        box1.sendKeys("Selenium");

        Actions act=new Actions(driver);
        act.doubleClick(copytext).build().perform();

        String text=box2.getAttribute("value");
        System.out.println(text);

    }
}
