package Day31_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Bootstrap_Dropdown {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
       // driver.findElement(By.xpath("//input[@value='Java']")).click();

        // Capture all option and findout size
      List<WebElement> options= driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//li//label"));
        System.out.println("No of element :  " +options.size());

        //Printing all options
        /*for(WebElement op:options)
        {
            System.out.println(op.getText());
        }

         */

        // Select Multiple options
        for(WebElement op:options)

        {
            String option=op.getText();
            if(option.equals("Java")||option.equals("Python")||option.equals("MySQL")){
                op.click();
            }

        }

    }
}
