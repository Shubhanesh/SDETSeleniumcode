package Day28_Navigationmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class ClosingSpecificBrowser {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
        Set<String> windowsids = driver.getWindowHandles();

        for (String winid : windowsids) {
            String title = driver.switchTo().window(winid).getTitle();
            System.out.println(title);

            if (title.equals("OrangeHRM")) {
                driver.close();

            }

        }
    }
}
    // if we want to closed multiple browser window
   /* if(title.equals("OrangeHRM")||title.equals("Mentioned tiyle"))
    {
        driver.closed
        break;// if we want to exit from loop
    }

}

    */
