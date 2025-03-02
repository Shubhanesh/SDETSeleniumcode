package Day23_CSSselector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
        // class name
       // driver.findElement(By.cssSelector("input.form-control")).sendKeys("Mac");

        // tag name class and attribute
        //driver.findElement(By.cssSelector("input.form-control [placeholder='search']")).sendKeys("Mac");

        //tag name attribute
        //driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("Mac");
    }
}
