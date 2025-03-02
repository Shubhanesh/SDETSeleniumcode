package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlerHandlingDemo2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@id='alertButton']")).click();
        Thread.sleep(5000);
        Alert myalert=mywait.until(ExpectedConditions.alertIsPresent());
        System.out.println(myalert.getText());
        myalert.accept();
      //  Alert alert=driver.switchTo().alert();
      //  alert.accept();

    }

}
