package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NextGenerationAutomation {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.nextgenerationautomation.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//span[normalize-space()='Log In / Sign Up']")).click();
        driver.findElement(By.xpath("(//input[@id='input_comp-kaoxkn4j'])")).sendKeys("shubha");
        driver.findElement(By.xpath("//input[@id='input_comp-kaoxkn4o']")).sendKeys("Gholap");
        driver.findElement(By.xpath("//input[@id='input_comp-kaoxkn4s']")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//input[@id='input_comp-kaoxkn4w']")).sendKeys("password");
        driver.findElement(By.xpath("//input[@id='input_comp-kaoxr1ae']")).sendKeys("9999999999");
        driver.findElement(By.xpath("//input[@id='input_comp-karpvdv0']")).sendKeys("pune");
        driver.findElement(By.xpath("//button[@class='uDW_Qe wixui-button PlZyDq']")).click();

    }
}
