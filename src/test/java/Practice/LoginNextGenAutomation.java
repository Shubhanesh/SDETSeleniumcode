package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginNextGenAutomation {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.nextgenerationautomation.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("VGMdYn")).click();
        driver.findElement(By.id("input_comp-kaoxkn4j")).sendKeys("Shubha");
        driver.findElement(By.id("input_comp-kaoxkn4o")).sendKeys("Gholap");
        driver.findElement(By.id("input_comp-kaoxkn4s")).sendKeys("gholap.shubhangi6@gamil.com");
        driver.findElement(By.id("input_comp-kaoxkn4w")).sendKeys("password");
        driver.findElement(By.id("input_comp-kaoxr1ae")).sendKeys("7720891479");
        driver.findElement(By.id("input_comp-karpvdv0")).sendKeys("Pune");
        driver.findElement(By.xpath("//span[normalize-space()='Sign up']")).click();
    }
}
