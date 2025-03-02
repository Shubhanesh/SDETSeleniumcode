package Day36_KeyboardAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class OpenLinkinNewTab {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

       //WebElement reg_link=driver.findElement(By.xpath("//a[@class='ico-register']"));
       WebElement reg_link=driver.findElement(By.xpath("(//a[normalize-space()='Register'])"));
       Thread.sleep(5000);
        Actions act=new Actions(driver);
        act.keyDown(Keys.CONTROL).click(reg_link).keyUp(Keys.CONTROL).perform();
        Thread.sleep(5000);
        //switching to reg page
       // Set<String> ids=driver.getWindowHandles();
        List<String>ids=new ArrayList<>(driver.getWindowHandles());
       driver.switchTo().window(ids.get(1)) ;
       driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("shubha");

       //switch to homepage
        driver.switchTo().window(ids.get(0));
        driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Shirt");

    }
}
