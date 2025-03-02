package Day31_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Select_DropDown {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
            driver.get("https://testautomationpractice.blogspot.com/");
            driver.manage().window().maximize();
            WebElement drpdownele=driver.findElement(By.xpath("//select[@id='country']"));
            Select drpdowncountry=new Select(drpdownele);

            // select option from drowpdown

        //drpdowncountry.selectByVisibleText("India");// Visible text started from uppercase

        // select option by value
       // drpdowncountry.selectByValue("india");// value started with lowercase
        //drpdowncountry.selectByIndex(2);

       // captured all option from dropdown
      List<WebElement> alloptions =drpdowncountry.getOptions();
        System.out.println("No of avialble options : " + alloptions.size());

        //Printing all 10 options
        /*for(int i=0;i<alloptions.size();i++)

        {
            System.out.println(alloptions.get(i).getText());

        }

         */
        for(WebElement op:alloptions){
            System.out.println(op.getText());
        }



    }
}
