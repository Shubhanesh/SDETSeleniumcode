package Day35_MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();
      WebElement button= driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        Actions act=new Actions(driver);
        // rightclick
        act.contextClick(button).build().perform();

        //click on copy
        driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
        //closed alert box
        driver.switchTo().alert().accept();
    }
}
