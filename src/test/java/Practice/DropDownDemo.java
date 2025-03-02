package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();
       WebElement dropdownele= driver.findElement(By.id("oldSelectMenu"));

        Select select_dev=new Select(dropdownele);

        select_dev.selectByVisibleText("Blue");// select dropdown
        System.out.println("Select by visible text :"+select_dev.getFirstSelectedOption().getText());
        Thread.sleep(5000);

        select_dev.selectByIndex(3);
        System.out.println("Select by index :" +select_dev.getFirstSelectedOption().getText());


        select_dev.selectByValue("4");
        System.out.println("selectby value :"+select_dev.getFirstSelectedOption().getText());

        List<WebElement> alloptions=select_dev.getOptions();
        System.out.println("no of option" +alloptions.size());

        //Printing all option
        for(int i=0;i< alloptions.size();i++)
        {
            System.out.println(alloptions.get(i).getText());
        }


    }
}
