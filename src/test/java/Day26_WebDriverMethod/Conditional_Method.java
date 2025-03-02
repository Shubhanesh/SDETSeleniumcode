package Day26_WebDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_Method {
    // conditional method
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.nopcommerce.com/register");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        //is displayed
      //WebElement logo= driver.findElement(By.xpath("//img[@alt='nopCommerce']"));
      //WebElement logo=driver.findElement(By.xpath("//img[@title='nopCommerce']"));
         //WebElement logo=driver.findElement(By.cssSelector("img[title='nopCommerce']"));
      //  System.out.println(logo.isDisplayed());

      // boolean status= driver.findElement(By.xpath("//img[@alt='nopCommerce']")).isDisplayed();
       // System.out.println(status);

        // is enabled
       boolean be= driver.findElement(By.xpath("//input [@id='FirstName']")).isEnabled();
        System.out.println(be);

        // is selected

    }
}
