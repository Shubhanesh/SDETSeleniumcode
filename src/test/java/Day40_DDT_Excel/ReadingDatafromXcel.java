package Day40_DDT_Excel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingDatafromXcel {
    public static void main(String[] args) throws IOException {
      //  FileInputStream file =new FileInputStream(System.getProperty("user.dir")+"\\DDT\\employee details.xlsx") ;
        FileInputStream file=new FileInputStream("C:\\Users\\Shubhangi\\IdeaProjects\\Hellow world\\SeleniumSDET\\target\\DDT\\employee details.xlsx");

        XSSFWorkbook workbbok=new XSSFWorkbook(file);
     XSSFSheet sheet= workbbok.getSheet("employee details");
       // XSSFSheet sheet=workbbok.getSheetAt(0);
       int totalrows= sheet.getLastRowNum();
       int totalcells= sheet.getRow(1).getLastCellNum();
        System.out.println("not of rows"+totalrows);
        System.out.println("no of cells"+totalcells);

        for(int r=0;r<=totalrows;r++){
          XSSFRow currentrow=sheet.getRow(r);

            for(int c=0;c<totalcells;c++){
              XSSFCell cell =currentrow.getCell(c);
                System.out.print(cell.toString()+"\t");

            }
        }
        workbbok.close();
        file.close();





    }

}
