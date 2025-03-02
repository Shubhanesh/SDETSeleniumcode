package Day32_AutosuggestedDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingStaticTable {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //find total no of rows

      int rows=  driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println("no of rows :" +rows);

        //int r=driver.findElements(By.tagName("tr")).size();//used when single table

        // find total no of column
       int column= driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println("no of coloumn :" +column);

        //Read data from specific row and column(5throw n first column)
        String name=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
        //System.out.println("specific data captured:" +name);

        //Read all data from table
       // System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");

        /*for(int r=2;r<=rows;r++){
            for(int c=1;c<=column;c++){
               String alldata= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
               // System.out.print(alldata+"\t");

            }

         */
            //System.out.println();


            // Print bookname whose author is Mukesh
           /* for(int r1=2;r1<=rows;r1++){
              String authorname=  driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r1+"]//td[2]")).getText();
                if(authorname.equals("Mukesh"))
                {
                   String Bookname= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r1+"]//td[1]")).getText();
                    //System.out.println(Bookname+"\t"+authorname);
                }

            */

                //Find total price of all book
        int total=0;

                for(int r2=2;r2<=rows;r2++) {
                    String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r2+"]//td[4]")).getText();
                    total=total+Integer.parseInt(price);
                }
        System.out.println(total);


            }
        }


