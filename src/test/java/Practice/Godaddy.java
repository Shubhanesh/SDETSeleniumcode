package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Godaddy {
    WebDriver driver=new ChromeDriver();
    String title;
    String url;
    //1. Test Case - Open Godaddy.com and maximize the browser window.
    @Test(priority = 1)
    void openapplication()
    {
        driver.get("https://www.godaddy.com/");
        driver.manage().window().maximize();
    }
    //2. Test Case - Open Godaddy.com and Print its Page title.

    @Test(priority = 2)
    void getTitle()
    {
        String title=driver.getTitle();
        String url=driver.getCurrentUrl();
        System.out.println(title);
        System.out.println(url);
        if (title.equals("Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN"))
        {
            System.out.println("Correct title"+title);
        }
        else{
            System.out.println("wrong tile");
    }





    }
}
