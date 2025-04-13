package TestAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class CreateAccount {
    WebDriver driver;

    @BeforeClass
    void open_application(){
        driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    void create_account(){

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("shubha");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9999999999");
        driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("Pune");
        driver.findElement(By.xpath("//label[@for='female']")).click();
        driver.findElement(By.xpath("//label[@for='sunday']")).click();


    }
    @Test
    void select_Dropdown(){

        WebElement country=driver.findElement(By.xpath("//select[@id='country']"));
        Select drop_ele =new Select(country);
        drop_ele.selectByIndex(2);

        WebElement color=driver.findElement(By.xpath("//select[@id='colors']"));
        Select drop_colr=new Select(color);
        drop_colr.selectByVisibleText("Red");

        WebElement animals= driver.findElement(By.xpath("//select[@id='animals']"));
        Select drop_animal=new Select(animals);
        drop_animal.selectByIndex(0);

    }



}
