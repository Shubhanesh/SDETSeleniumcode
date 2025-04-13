package TestAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class PopUp {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@id='PopUp']")).click();
       Set<String> WindowIDs= driver.getWindowHandles();
        String mainWindow = driver.getWindowHandle();

       for(String windowsHandle:WindowIDs){
           String windowstitle=driver.switchTo().window(windowsHandle).getTitle();
           if(!windowstitle.equals(mainWindow)){
               driver.switchTo().window(windowsHandle);
               System.out.println(driver.getTitle());
              // driver.close();
           }

       }

       driver.switchTo().window("Automation Testing Practice");
        System.out.println("the title of main window :"+ driver.getTitle());

        //driver.quit();




    }
}
