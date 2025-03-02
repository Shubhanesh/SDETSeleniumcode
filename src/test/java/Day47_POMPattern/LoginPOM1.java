package Day47_POMPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//with Page Factory

public class LoginPOM1 {

    WebDriver driver;
    // constructotr
    LoginPOM1(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    //Locators
   /* By txt_username_loc= By.xpath("//input[@placeholder='Username']");
    By txt_password_loc=By.xpath("//input[@placeholder='Password']");
    By txt_loginbtn_loc=By.xpath("//button[@type='submit']");

    */

    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement txt_username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement txt_pass;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btn_login;

    // Action method
    public void setUsername(String user){
        txt_username.sendKeys(user);

    }
    public void setPassword(String pass)
    {
        txt_pass.sendKeys(pass);
    }
    public void clickLogin()
    {
        btn_login.click();
    }
}
