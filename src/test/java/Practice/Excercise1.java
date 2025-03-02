package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Write a script to open google.com and verify that title is Google
// and also verify that it is redirected to google.co.in
public class Excercise1 {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        if (title.equals("Google")){
            System.out.println("Test pass");
        }
        else{
            System.out.println("test failed");
        }
       String URL= driver.getCurrentUrl();
        if(URL.contains("google.co.in")){
            System.out.println("redirected to correct URL");
        }
        else{
            System.out.println("Redrircted to wrong URL");
        }

    }
}
