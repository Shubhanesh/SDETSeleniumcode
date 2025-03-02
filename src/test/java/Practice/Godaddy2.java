package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

//1. Test Case - Automate the first menu link of godaddy.com with Selenium.
public class Godaddy2 {


    @Test(priority = 1)
    void openapp(){
        //driver=new ChromeDriver();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.godaddy.com/");
       driver.manage().window().maximize();
      //driver.findElement(By.xpath("//button[@data-creative-name='domains']")).click();

        driver.findElement(By.xpath("//input[@name='searchText']")).sendKeys("sdfg");
       driver.findElement(By.xpath("//button[@data-testid='domain-search-box-button']")).click();

    }

}
