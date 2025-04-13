package TestAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //find no of rows
        int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println("Number of rows :" + rows);


        // find no of columns
        int colom = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println("Number of colum :" + colom);

        // Read the data from specific data and colum
        String data = driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]//td[3]")).getText();
        System.out.println(data);

        //Read all the data from table
        for (int r = 2; r <= rows; r++) {
            for (int c = 1; c <= colom; c++) {
                String alldata = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[" + c + "]")).getText();
                System.out.println(alldata + "\t");
            }
            System.out.println();
        }


    }
}