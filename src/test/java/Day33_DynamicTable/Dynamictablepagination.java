package Day33_DynamicTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Dynamictablepagination {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.opencart.com/admin/index.php");
        driver.manage().window().maximize();

        WebElement username=driver.findElement(By.xpath("//input[@type='text']"));
        username.clear();
        username.sendKeys("demo");

        WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
        password.clear();
        password.sendKeys("demo");

        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
    }
}
