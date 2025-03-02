package Day21_Introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LaunchBrowser {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();// this can also used to launch browser
       //ChromeDriver driver=new ChromeDriver(); //launch browser

        // Open URL
        driver.get("https://demo.opencart.com/");

        //Validate title "Your Store" right click inspect element search title

       /* String act_T= driver.getTitle();
        if(act_T.equals("Your Store")){
            System.out.println("test pass");
        }
        else {
            System.out.println("Test failed");
        }

        */
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Your Store");

        //closed brower
        driver.quit();//closed all window
       // driver.close();//current



    }
}
