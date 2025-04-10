package utils;

import baseTest.BaseClass;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.BasePage;

import java.io.*;
import java.time.Duration;
import java.util.Iterator;

public class ExcelUtility {

    // Method to open the Excel file (either XLSX or XLS)
    private static Workbook openExcelFile(String filePath) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);

        // Check for file extension and open the corresponding Workbook type
        if (filePath.endsWith(".xlsx")) {
            return new XSSFWorkbook(fis);  // Open .xlsx file
        } else {
            throw new IOException("Unsupported file format. Please provide a valid .xlsx file.");
        }
    }

    // Method to update the Excel file with new value based on column name
    public static void updateColumnInExcel(String filePath, String columnName, String newValue) throws IOException {
        // Open the Excel file
        Workbook workbook = openExcelFile(filePath);
        Sheet sheet = workbook.getSheetAt(0);  // Assuming the data is in the first sheet

        // Find the column index based on the column name (Header Row is at index 0)
        Row headerRow = sheet.getRow(0);
        int columnIndex = -1;
        Iterator<Cell> headerIterator = headerRow.iterator();
        while (headerIterator.hasNext()) {
            Cell cell = headerIterator.next();
            if (columnName.equalsIgnoreCase(cell.getStringCellValue().trim())) {
                columnIndex = cell.getColumnIndex();
                break;
            }
        }

        // If the column is not found, throw an exception
        if (columnIndex == -1) {
            workbook.close();
            throw new IOException("Column '" + columnName + "' not found in the file.");
        }

        // Update the entire column with the new value (assuming row starts from index 1)
        for (int rowIndex = 1; rowIndex < sheet.getPhysicalNumberOfRows(); rowIndex++) {
            Row row = sheet.getRow(rowIndex);
            if (row == null) {
                row = sheet.createRow(rowIndex);  // Create a new row if it doesn't exist
            }
            Cell cell = row.getCell(columnIndex);
            if (cell == null) {
                cell = row.createCell(columnIndex);  // Create a new cell if it doesn't exist
            }
            cell.setCellValue(newValue);  // Set the new value to the cell
        }

        // Write the updated data back to the file
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            workbook.write(fos);
        } finally {
            workbook.close();  // Close the workbook after writing
        }
    }
}
