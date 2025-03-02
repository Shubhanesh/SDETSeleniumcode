package Day28_Navigationmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import java.awt.*;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Assignment1 {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

driver.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("Selenium");
WebElement searchbutton= driver.findElement(By.xpath("//input[@type='submit']"));
searchbutton.click();
       // List<WebElement> allLinks=driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results-header']/"));
        List<WebElement> links = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));
        System.out.println(links.size());

        // Click on each link using loops
        for(WebElement link:links){
            System.out.println(link.getText());
            link.click();

        }
        // Collect all windows id
        Set<String> windowsIDs=driver.getWindowHandles();
        System.out.println(windowsIDs);

        for(String winid:windowsIDs){
            String title= driver.switchTo().window(winid).getTitle();
            System.out.println(title);
            // closing specific browser

            if(title.equals("Automation Testing Practice")){
                driver.close();

            }

        }


    }
}
