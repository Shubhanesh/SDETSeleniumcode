package Day27_Webdriver_WAIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait_Demo {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));//declration

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
      WebElement txtusername= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
      txtusername.sendKeys("Admin");

        WebElement txtpassword= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
        txtpassword.sendKeys("admin123");

        WebElement loginbtn=mywait.until((ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))));
        loginbtn.click();



        //driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        //driver.close();
    }
}
