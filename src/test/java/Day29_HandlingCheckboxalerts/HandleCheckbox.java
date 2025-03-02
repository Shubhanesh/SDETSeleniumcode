package Day29_HandlingCheckboxalerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleCheckbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //Select specific checkbox
        //driver.findElement(By.xpath("//input[@id='sunday']")).click();

        //select all checkbox
      List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@class='form-check-input'and @type='checkbox']"));

      /*for(int i=0;i<checkboxes.size();i++)
      {
          checkboxes.get(i).click();

      }

       */

      //enhance for loop
       /* for(WebElement checbox:checkboxes)
        {
            checbox.click();
        }

        */

        // i want to select last 3 checkboxes

        //starting index=total no pf checkboxes-how many checkbox want to select
        //7-3=4
        /*for(int i=4;i<checkboxes.size();i++)
        {
           checkboxes.get(i).click();
        }

         */


        // Select first 3 checkboxes
       /* for(int i=0;i<3;i++)
        {
            checkboxes.get(i).click();
        }

        */

        //Unselect checkbox if they are selected

        for(int i=0;i<3;i++)
        {
            checkboxes.get(i).click();
        }
        Thread.sleep(5000);

        for(int i=0;i<checkboxes.size();i++)
        {
            if (checkboxes.get(i).isSelected()) {
                checkboxes.get(i).click();
            }
        }


    }
}
