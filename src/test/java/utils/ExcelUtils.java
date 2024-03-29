package utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ExcelUtils {
    public static void writeToExcel(String sheetName, List CellValue,int row, int col) throws IOException {
        String excelPath ="src\\test\\java\\resources\\n11CampaignsList.xlsx";
        File file = new File(excelPath);
        FileOutputStream outputStream = new FileOutputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet();
        int colIndex = col;
        for(int i = 0; i < row; i++) {
            sheet.createRow(i).createCell(colIndex).setCellValue(CellValue.get(i).toString());
        }

        wb.write(outputStream);
        outputStream.close();
        wb.close();

    }
}
