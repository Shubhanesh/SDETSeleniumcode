package Day40_DDT_Excel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WritingDyanamicdata {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("C:\\Users\\Shubhangi\\IdeaProjects\\Hellow world\\SeleniumSDET\\target\\DDT\\emptyexcel1.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook();
       XSSFSheet sheet = workbook.createSheet("Dyanamicdata");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the required rows");
        int noofrows= sc.nextInt();

        System.out.println("Enter required cells");
        int noofcells=sc.nextInt();

        for(int r=0;r<=noofrows;r++){
         XSSFRow currentrow= sheet.createRow(r);
            for(int c=0;c<noofcells;c++){
                XSSFCell cell=currentrow.createCell(c);
                cell.setCellValue(sc.next());



            }
        }
        workbook.write(file);
        workbook.close();
        file.close();
        System.out.println("file is created");
    }
}
