package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DropDown {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.bstackdemo.com/");
        driver.manage().window().maximize();
       WebElement orderele= driver.findElement(By.xpath("//div[@class='sort']//select"));
       orderele.click();
        Select Dropdownele=new Select(orderele);
        //Dropdownele.selectByVisibleText("lowestprice");
        Dropdownele.selectByIndex(2);

        // Select all option from drodown
        List<WebElement>alloptions=Dropdownele.getOptions();
        System.out.println(alloptions.size());

        //Print all options
        for(int i=0;i<alloptions.size();i++){
            System.out.println(alloptions.get(i).getText());
        }

    }
}
