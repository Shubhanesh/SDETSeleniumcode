package Day26_WebDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetMethode_Demo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);

        //title
        System.out.println(driver.getTitle());
        // current uRL
        System.out.println(driver.getCurrentUrl());

        //Get page source
        //System.out.println(driver.getPageSource());

        // get window handles
        String windowid=driver.getWindowHandle();
        System.out.println(windowid);

        //getwindow handles
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        Set<String> windowsid=driver.getWindowHandles();
        System.out.println(windowsid);

    }
}
