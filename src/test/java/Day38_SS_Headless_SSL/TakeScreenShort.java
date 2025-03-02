package Day38_SS_Headless_SSL;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class TakeScreenShort {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        //full page ss
       /* TakesScreenshot ts=(TakesScreenshot)driver;
        File sourcefile=ts.getScreenshotAs(OutputType.FILE); // don't know the location
        File targetfile=new File(System.getProperty("user.dir")+"\\takescreen\\Fullpage.png");
        sourcefile.renameTo(targetfile); //copy source file

        */

        //Capture SS from specific section
       /* WebElement Featuredproduct=driver.findElement(By.xpath("//div[@class='category-grid home-page-category-grid']"));
      File sourcefile=  Featuredproduct.getScreenshotAs(OutputType.FILE);
      File targetfile=new File(System.getProperty("user.dir")+"\\takescreen\\featureproduct.png");

        */

      // Capture the ss of webelement
        WebElement logss=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        File sourcefile=  logss.getScreenshotAs(OutputType.FILE);
        File targetfile=new File(System.getProperty("user.dir")+"\\takescreen\\logoss.png");


    }

}
