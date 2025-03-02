package Day24_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Demo2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        // Contains
        //driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("shirt");


        // start with
       // driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("shirt");

        // chained xpath
     boolean  displaystatus= driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
        System.out.println(displaystatus);
    }
}
