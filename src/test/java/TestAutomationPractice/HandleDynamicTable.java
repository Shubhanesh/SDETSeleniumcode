package TestAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicTable {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
       int row= driver.findElements(By.xpath("//table[@id='taskTable']//tr")).size();
        System.out.println(row);
      int clm=driver.findElements(By.xpath("//table[@id='taskTable']//th")).size();
        System.out.println(clm);

        String readdata=driver.findElement(By.xpath("//table[@id='taskTable']//tr[4]//td[4]")).getText();
        System.out.println(readdata);
    }
}
