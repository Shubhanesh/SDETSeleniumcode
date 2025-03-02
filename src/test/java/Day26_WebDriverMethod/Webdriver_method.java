package Day26_WebDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Webdriver_method {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        String Wh=driver.getWindowHandle();
        System.out.println(Wh);

        Set<String> wh2=driver.getWindowHandles();
        System.out.println(wh2);

        //isdisplayed
        boolean displaystatus=driver.findElement(By.xpath("//h1[@class='title']")).isDisplayed();
        System.out.println(displaystatus);

        //is enabled
        boolean isenabled=driver.findElement(By.xpath("//input[@id='name']")).isEnabled();
        System.out.println("Webelement is enabled status" +isenabled);

        // is selected
        WebElement mal_button=driver.findElement(By.xpath("//input[@id='male']"));
        WebElement femal_button=driver.findElement(By.xpath("//label[@for='female']"));
        System.out.println("before selected...");
        System.out.println(mal_button.isSelected());
        System.out.println(femal_button.isSelected());

        System.out.println("After selected male button...");
        mal_button.click();
        System.out.println(mal_button.isSelected());
        System.out.println(femal_button.isSelected());

        System.out.println("After selected female button...");
        femal_button.click();
        System.out.println(mal_button.isSelected());
        System.out.println(femal_button.isSelected());

        driver.quit();





    }
}
