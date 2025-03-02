package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlerthandlingDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.browserstack.com/users/sign_up");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='user_full_name']")).sendKeys("shubha gholap");
        driver.findElement(By.xpath("//input[@id='user_email_login']")).sendKeys("shubha@xyz.com");
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
       // driver.findElement(By.xpath("//input[@id='tnc_checkbox']")).click();
        driver.findElement(By.xpath("//input[@id='user_submit']")).click();
        Thread.sleep(5000);
       // driver.findElement(By.xpath("//a[@class='bs-alert-close']")).click(); //handled alert manually
       Alert alert=driver.switchTo().alert();
        String alertmessage=driver.switchTo().alert().getText();
        System.out.println(alertmessage);
        Thread.sleep(5000);

        alert.accept();

    }
}
