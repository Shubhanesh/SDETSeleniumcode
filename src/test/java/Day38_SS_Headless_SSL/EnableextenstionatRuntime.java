package Day38_SS_Headless_SSL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class EnableextenstionatRuntime {
    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        File file=new File("CRX file path n file name ");
        options.addExtensions(file);
        WebDriver driver=new ChromeDriver();
        driver.get("https://text-compare.com/");
    }
}
