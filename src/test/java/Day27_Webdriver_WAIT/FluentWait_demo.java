package Day27_Webdriver_WAIT;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

import static com.google.common.util.concurrent.Futures.withTimeout;

public class FluentWait_demo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //Delcration
        Wait<WebDriver> mywait=new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);


        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement txt_element = mywait.until(new Function<WebDriver, WebElement>()
                                              {
                                                  public WebElement apply(WebDriver driver){
                                                      return driver.findElement(By.xpath("//input[@placeholder='Username']"));
                                                  }
                                              });
                                          txt_element.sendKeys("Admin");


        //driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        //driver.close();
    }
}
