package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class BrokenLink {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("Total no of link:" +links.size());
        int brkenlinks=0;
        for(WebElement brkenlinkele:links){
            String hrefvalue=brkenlinkele.getAttribute("href");
            if (hrefvalue==null || hrefvalue.isEmpty()){
                System.out.println("href empty or null not possible to check");
                continue;
            }

        }


    }
}
