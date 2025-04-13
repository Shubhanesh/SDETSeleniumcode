package TestAutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LaunchBrowser {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // verify title
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Automation Testing Practice");

        // Get URL
        System.out.println(driver.getCurrentUrl());


    }
}
