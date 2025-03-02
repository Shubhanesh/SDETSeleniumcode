package Day27_Webdriver_WAIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static java.time.Duration.*;

public class ImplicitWait_Demo {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        // implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();


        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.close();
    }
}
