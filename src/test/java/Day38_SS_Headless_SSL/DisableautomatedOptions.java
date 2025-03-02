package Day38_SS_Headless_SSL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableautomatedOptions {
    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demo.opencart.com/");


        String act_T = driver.getTitle();
        if (act_T.equals("Your Store")) {
            System.out.println("test pass");
        } else {
            System.out.println("Test failed");
        }
    }
}



