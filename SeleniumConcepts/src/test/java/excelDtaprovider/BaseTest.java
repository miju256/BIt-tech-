package excelDtaprovider;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class BaseTest {

	@DataProvider(name = "exceldata")
	public Object[][] ExceRead() {

		try {
			System.out.println("Inside the try block");

			XSSFWorkbook workbook = new XSSFWorkbook("/Users/mdgulamkibria/Desktop" + "/bit tech/SeleniumConcepts/src"
					+ "/test/java/TestDAta/logintestdata.xlsx");

			XSSFSheet ci = workbook.getSheetAt(0);
			int rowlen = ci.getLastRowNum();
			int collan = ci.getRow(0).getLastCellNum();
			Object[][] data = new Object[rowlen][collan];

			for (Row row : ci) {
				Object temp = null;
				if (row.getRowNum() == 0)
					continue;
				for (Cell cell : row) {
					if (cell.getCellType() == CellType.NUMERIC) {
						temp = cell.getNumericCellValue();

					} else if (cell.getCellType() == CellType.STRING) {
						temp = cell.getStringCellValue();

					}

					data[row.getRowNum() - 1][cell.getColumnIndex()] = temp;
				}
			}
			System.out.println(data[0][1]);

			workbook.close();
			return data;

		} catch (IOException e) {

			e.printStackTrace();
		}
		return null;

	}

}
