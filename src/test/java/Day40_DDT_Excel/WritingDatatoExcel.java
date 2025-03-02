package Day40_DDT_Excel;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingDatatoExcel {
    public static void main(String[] args) throws IOException {
        FileOutputStream file=new FileOutputStream("C:\\Users\\Shubhangi\\IdeaProjects\\Hellow world\\SeleniumSDET\\target\\DDT\\emptyexcel.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Data");
        XSSFRow row1=sheet.createRow(0);
        row1.createCell(0).setCellValue("Welcome");
        row1.createCell(1).setCellValue(123);
        row1.createCell(2).setCellValue("welcome");

        XSSFRow row2=sheet.createRow(1);
        row2.createCell(0).setCellValue("python");
        row2.createCell(1).setCellValue(1234);
        row2.createCell(2).setCellValue("come");

        XSSFRow row3=sheet.createRow(2);
        row3.createCell(0).setCellValue("API");
        row3.createCell(1).setCellValue(21);
        row3.createCell(2).setCellValue("SDET");

        workbook.write(file);
        workbook.close();
        file.close();
        System.out.println("file is created");


    }
}
