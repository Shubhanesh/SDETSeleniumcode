package Day46_Listners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import java.time.Duration;
//@Listeners(Day46_Listners.MyListnerclass.class)

public class OrangeHRM {
    WebDriver driver;
    @BeforeClass
    void setup() throws InterruptedException {
        driver=new EdgeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(5000);

    }
   @Test(priority = 1)
    void testLogo()
    {
        boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        Assert.assertEquals(status,true);

    }

    @Test(priority = 3,dependsOnMethods = {"testURL"})
    void testTitle()
    {
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");


    }
    @Test(priority = 2)
    void testURL()
    {
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login/nm");
    }
    @AfterClass
    void tearDown()
    {
        driver.close();

    }


}


