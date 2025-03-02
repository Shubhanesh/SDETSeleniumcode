package Day40_DDT_Excel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataRandom {
    public static void main(String[] args) throws IOException {
        FileOutputStream file=new FileOutputStream("C:\\Users\\Shubhangi\\IdeaProjects\\Hellow world\\SeleniumSDET\\target\\DDT\\randomexcel.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Data");
       XSSFRow row=sheet.createRow(3);
      XSSFCell cell= row.createCell(4);
      cell.setCellValue("shubha");


        workbook.write(file);
        workbook.close();
        file.close();
        System.out.println("file is created");
    }
}
