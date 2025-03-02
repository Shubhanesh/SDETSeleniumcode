package Day42_TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

/*
open application
test logo presense
login
closed
 */

public class TestNGdemo1 {
    WebDriver driver;// create class level object to accessible in all method
    @Test(priority = 1)
    void openapp(){
         driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

    }
    @Test(priority = 2)
    void logopresense()
    {


    }
    @Test(priority = 3)
    void testlogin()
    {

    }
    @Test(priority = 4)
    void logout()
    {

    }

}
