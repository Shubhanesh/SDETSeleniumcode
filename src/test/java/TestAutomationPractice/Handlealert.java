package TestAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Handlealert {
    WebDriver driver;

    @BeforeClass
    void open_application() {
        driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    void simple_alert(){

     driver.findElement(By.xpath("//button[@id='alertBtn']")).click();

     org.openqa.selenium.Alert myalert=driver.switchTo().alert();
        System.out.println(myalert.getText());
        myalert.accept();

    }

    @Test
    void confirmation_alert(){
        driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
        org.openqa.selenium.Alert myalert1=driver.switchTo().alert();
        System.out.println(myalert1.getText());
        myalert1.accept();

    }

    @Test
    void prompt_alert(){
        driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
        org.openqa.selenium.Alert myalert2=driver.switchTo().alert();
        System.out.println(myalert2.getText());
        myalert2.sendKeys("Shubha");
        myalert2.accept();
    }
}
