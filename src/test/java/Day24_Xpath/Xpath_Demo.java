package Day24_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Demo {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        //xpath with single attribute
       // driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("shirt");

        // xpath with multiple attribute
        //driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("shirt");

        // Xpath with and operator
      //  driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("shirt");

        // Xpath with OR operator
      //  driver.findElement(By.xpath("//input[@name='search' or @placeholder='Sear']")).sendKeys("shirt");

        //Xpath with text-inner text  * represent tag name
        //driver.findElement(By.xpath("//a[text()='MacBook']")).click();
      boolean  displays=driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
        System.out.println(displays);
       String value= driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
        System.out.println(value);



    }

}
