package Day47_POMPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {
    WebDriver driver;
    @BeforeClass
    void setUp()
    {
        driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

    }
    @Test
    void testLogin()
    {

        LoginPOM1 lp=new LoginPOM1(driver);
        //LoginPOM lp=new LoginPOM(driver);
        lp.setUsername("admin");
        lp.setPassword("admin123");
        lp.clickLogin();
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");

    }
    @AfterClass
    void tearDown()
    {
        driver.quit();

    }
}
