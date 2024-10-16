package EncryptionUtil;
import java.io.IOException;

public class ExcelData {

        public static void main(String[] args) {


            try {
                // Load the Excel file
                String filePath = "src/main/resources/user_credentials.xlsx";
                ExcelUtil.loadExcel(filePath);

                // Read the username and password from the Excel file
                String username = ExcelUtil.getCellData("Sheet1", 1, 0); // Row 1, Column 0
                String password = ExcelUtil.getCellData("Sheet1", 1, 1); // Row 1, Column 1

                System.out.println(username);
                System.out.println(password);
            } catch (IOException e) {
                e.printStackTrace();
            }
                try {
                    // Close the workbook
                    ExcelUtil.closeWorkbook();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
