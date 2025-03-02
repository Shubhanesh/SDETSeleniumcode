package Day47_POMPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//without Page Factory

public class LoginPOM {

    WebDriver driver;
    // constructotr
    LoginPOM(WebDriver driver){
        this.driver=driver;

    }
    //Locators
    By txt_username_loc= By.xpath("//input[@placeholder='Username']");
    By txt_password_loc=By.xpath("//input[@placeholder='Password']");
    By txt_loginbtn_loc=By.xpath("//button[@type='submit']");

    // Action method
    public void setUsername(String user){
        driver.findElement(txt_username_loc).sendKeys(user);

    }
    public void setPassword(String pass)
    {
        driver.findElement(txt_password_loc).sendKeys(pass);
    }
    public void clickLogin()
    {
        driver.findElement(txt_loginbtn_loc).click();
    }
}
