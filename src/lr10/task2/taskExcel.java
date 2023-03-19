package lr10.task2;

import org.apache.poi.EmptyFileException;
import org.apache.poi.openxml4j.exceptions.NotOfficeXmlFileException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class taskExcel {
    public static void main(String[] args) throws IOException {
        String filePath = "src/lr10/task2/example.xlsx";
        FileInputStream inputStream = new FileInputStream(filePath);

        try {
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheet("Товары");
            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }

            workbook.close();
            inputStream.close();
        } catch (NotOfficeXmlFileException e) {
            System.out.println("Указан не Excel-файл. Укажите файл example.xlsx");
        } catch (EmptyFileException e){
            System.out.println("Указан пустой файл.");
        } catch (NullPointerException e){
            System.out.println("Не найдена указанная книга \"Товары\"");
        }
    }
}