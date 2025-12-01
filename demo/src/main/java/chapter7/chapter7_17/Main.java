package chapter7.chapter7_17;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {
    public static void main(String[] args) throws Exception {
        Workbook book = new XSSFWorkbook();
        Sheet sheet = book.createSheet("カート");
        Row row = sheet.createRow(0);
        row.createCell(0).setCellValue("ヒノキの棒");
        row.createCell(1).setCellValue(5);
        row.createCell(2).setCellValue(22);
        row.createCell(3).setCellFormula("B1*C1");

        try(OutputStream file = new FileOutputStream("workbook.xlsx")) {
            book.write(file);
        }

    }
}
