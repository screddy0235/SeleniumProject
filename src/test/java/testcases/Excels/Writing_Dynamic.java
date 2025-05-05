package testcases.Excels;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Writing_Dynamic {
    public static void main(String[] args) throws IOException {
        //Excel File >>> Workbook >> Rows >>> cells
        // for Reading Mode :     FileInputStreamReader
        // for writing mode :     FileOutputStreamReader

        FileOutputStream file = new FileOutputStream("C:\\Users\\NANI0235\\IdeaProjects\\Selenium-Git\\testData\\Data.XLSX");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("DataSheet");

        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows you want");
        int noOfRows = sc.nextInt();
        System.out.println("How many Columns you want");
        int noOfCells = sc.nextInt();
        for (int r=0; r<=noOfRows; r++){
            XSSFRow currentRow = sheet.createRow(r);
            for (int c =0; c<noOfCells; c++){
                XSSFCell currentcell = currentRow.createCell(c);
                currentcell.setCellValue(sc.next());
            }
        }
        workbook.write(file);
        workbook.close();
        file.close();
        System.out.println("File Created");
    }
}
