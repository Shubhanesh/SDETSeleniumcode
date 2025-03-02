package Day29_HandlingCheckboxalerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assignment {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        ////table[@id='productTable' and @type='checkbox']
        ////div[@class='table-container' and @type='checkbox']
        ////div[@class='table-container'] //table[@id='productTable']//input[@type='checkbox']

        List<WebElement> checkboxes= driver.findElements(By.xpath("//div[@class='table-container'] //table[@id='productTable']//input[@type='checkbox']"));
        for(int i=0;i<checkboxes.size();i++){
            checkboxes.get(i).click();

        }

        // deselect all


    }
}
