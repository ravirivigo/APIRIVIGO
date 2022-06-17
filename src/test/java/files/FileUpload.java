package files;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileUpload {
    public static void main(String[] args) throws IOException {

        String filePath = System.getProperty("user.dir");
        File file = new File(filePath + "/" + "src/files/cred.test.xlsx");
        System.out.println("file");
        String [][] logindata = null;
        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);
        Workbook workbook = null;
        workbook = new XSSFWorkbook(inputStream);
    }
}