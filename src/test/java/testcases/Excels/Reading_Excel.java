package testcases.Excels;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class Reading_Excel {
    public static void main(String[] args) throws IOException {
    //Excel File >>> Workbook >> Rows >>> cells
    // for Reading Mode :     FileInputStreamReader
    // for writing mode :     FileOutputStreamReader

        FileInputStream file = new FileInputStream("C:\\Users\\NANI0235\\IdeaProjects\\Selenium-Git\\testData\\testExcel.xlsx");

        //for workbook
        XSSFWorkbook workbook = new XSSFWorkbook(file);

        // for sheets
        XSSFSheet sheet =  workbook.getSheet("Sheet1");

        // for rows
        int  totalRows = sheet.getLastRowNum();
        // this will get last cell int the row
        int noOfCells = sheet.getRow(1).getLastCellNum();
        System.out.println("Number of Rows " + totalRows);
        System.out.println("Number of Cells " + noOfCells);
        for(int r=0; r<=totalRows; r++){
            XSSFRow currentRow = sheet.getRow(r);
            for (int c=0; c<noOfCells; c++){
                String data = currentRow.getCell(c).toString();
                System.out.print(data + "  ");
            }
            System.out.println();
        }
        workbook.close();
        file.close();

    }
}
