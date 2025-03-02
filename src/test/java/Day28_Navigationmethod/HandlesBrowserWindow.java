package Day28_Navigationmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandlesBrowserWindow {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
        Set<String> windowsID=driver.getWindowHandles();

        //Extract window ids from set collection

        //approch 1 convert set into list-when we have 1 or 2,3 window
       /* List<String> windowlist=new ArrayList(windowsID);
        String parentid=windowlist.get(0);
        String childid=windowlist.get(1);
        System.out.println(parentid);

        // switch to child
        driver.switchTo().window(childid);
        System.out.println(driver.getTitle());


        // switch to parent
        driver.switchTo().window(parentid);
        System.out.println(driver.getTitle());

        */

        // approch 2 enhance for loop

        for(String winid:windowsID){
           String title= driver.switchTo().window(winid).getTitle();
           if (title.equals("OrangeHRM")){
               System.out.println(driver.getCurrentUrl());
           }
        }

    }
}
