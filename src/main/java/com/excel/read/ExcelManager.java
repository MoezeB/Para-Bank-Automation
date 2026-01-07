package com.excel.read;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelManager {

    public String readCellData(int rowNum, int colNum) throws Exception {

        // STEP 1: Locate the Excel file on your computer
        File file = new File("./src/test/resources/Login Test Data.xlsx");

        // STEP 2: Convert the Excel file into a stream (like water flowing)
        FileInputStream fis = new FileInputStream(file);

        // STEP 3: Apache POI opens the Excel file as a Workbook (entire Excel)
        Workbook workbook = WorkbookFactory.create(fis);

        // STEP 4: Get the first sheet from the Excel file
        Sheet sheet = workbook.getSheetAt(0);

        // STEP 5: Get the specific row you want
        Row row = sheet.getRow(rowNum);

        // STEP 6: Get the specific cell from that row
        Cell cell = row.getCell(colNum);

        // STEP 7: Read the cell value as text
        String value = cell.getStringCellValue();

        // STEP 8: Close everything to prevent memory leaks
        workbook.close();
        fis.close();

        return value;
    }

    public static void main(String[] args) throws Exception {
        ExcelManager em = new ExcelManager();

        // Reads row 1, column 1 (2nd row, 2nd column)
        String data = em.readCellData(1, 1);

        System.out.println("Excel Value: " + data);
    }
}