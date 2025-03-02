package Day23_CSSselector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Demo {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        //tag id
        //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Tshirt");
        //driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("shirt");//tag name is optional

        // tag class  tag.class
       // driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("shirt");
       // driver.findElement(By.cssSelector(".search-box-text")).sendKeys("shirt"); //tag name is optional


        //tag attributes
        //driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("shirt");
        //driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("shirt");

        // tag class attribute
      //  driver.findElement(By.cssSelector("input.search-box-text[name='q'] ")).sendKeys("shirt");
       // driver.findElement(By.cssSelector(".search-box-text[name='q'] ")).sendKeys("shirt");//tag name is optional

    }
}
