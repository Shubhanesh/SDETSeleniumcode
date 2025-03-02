package Day22_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDemo {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        //name locators
        //driver.findElement(By.name("search")).sendKeys("Mac");
        //id
       boolean logodisplayStatus= driver.findElement(By.id("logo")).isDisplayed();
       // System.out.println(logodisplayStatus);

        //Linktext and Partial linktext
        //A -linktext ;href represent target link
        //driver.findElement(By.linkText("https://demo.opencart.com/en-gb/catalog/tablet")).click();
       // driver.findElement(By.linkText("Tablets")).click();
       // driver.findElement(By.partialLinkText("Table")).click();

        //Class --capture multiple elements
        // Returning multiple element so we mentioned variable List <Webelement>
       //List<WebElement> headerlinks=driver.findElements(By.className("list-inline-item"));
       // System.out.println("Total number of links:"+headerlinks.size());

        // Tag name
     //List<WebElement>  all_tag=driver.findElements(By.tagName("a"));
       // System.out.println("Total number of links"+all_tag.size());

        //find all images
        List<WebElement> all_images=driver.findElements(By.tagName("img"));
        System.out.println("All images:" + all_images.size());





    }
}
