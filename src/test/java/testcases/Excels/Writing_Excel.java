package testcases.Excels;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writing_Excel {
    public static void main(String[] args) throws IOException {
        //Excel File >>> Workbook >> Rows >>> cells
        // for Reading Mode :     FileInputStreamReader
        // for writing mode :     FileOutputStreamReader

        FileOutputStream file = new FileOutputStream("C:\\Users\\NANI0235\\IdeaProjects\\Selenium-Git\\testData\\Data.XLSX");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("DataSheet");
        XSSFRow row1 = sheet.createRow(0);
            row1.createCell(0).setCellValue("Welcome");
            row1.createCell(1).setCellValue("Welcome1");
            row1.createCell(2).setCellValue("Welcome2");
            row1.createCell(3).setCellValue("Welcome3");

        XSSFRow row2 = sheet.createRow(1);
            row1.createCell(0).setCellValue("Welcome");
            row1.createCell(1).setCellValue("Welcome1");
            row1.createCell(2).setCellValue("Welcome2");
            row1.createCell(3).setCellValue("Welcome3");
        workbook.write(file);
        workbook.close();
        file.close();
    }
}
