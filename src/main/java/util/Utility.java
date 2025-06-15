
package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility {

	public static String readProperty(String key) {
		File file = new File("src/test/resources/master.properties");
		Properties properties = null;

		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			properties = new Properties();
			properties.load(fileInputStream);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties.getProperty(key);
	}

	public static Map<Integer, List<Object>> readExcelFile(String sheetName) {
		File file = new File("src/test/resources/registration.xlsx");

		HashMap<Integer, List<Object>> userData = new HashMap<Integer, List<Object>>();
		List<Object> rowData = new ArrayList<Object>();

		FileInputStream fileInputStream;
		XSSFWorkbook xssfWorkbook = null;

		try {
			fileInputStream = new FileInputStream(file);
			xssfWorkbook = new XSSFWorkbook(fileInputStream);
			XSSFSheet xssfSheet = xssfWorkbook.getSheet(sheetName);
			int lastRow = xssfSheet.getLastRowNum();

			for (int i = 0; i <= lastRow; i++) {
				XSSFRow xssfRow = xssfSheet.getRow(i);
				int lastCellNumber = xssfRow.getLastCellNum();

				rowData.clear();
				for (int j = 0; j < lastCellNumber; j++) {
					XSSFCell xssfCell = xssfRow.getCell(j);

					if (xssfCell.getCellType() == Cell.CELL_TYPE_STRING) {
						rowData.add(xssfCell.getStringCellValue());
					}
					if (xssfCell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
						rowData.add(xssfCell.getNumericCellValue());
					}
					if (xssfCell.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
						rowData.add(xssfCell.getBooleanCellValue());
					}
					if (xssfCell.getCellType() == Cell.CELL_TYPE_BLANK) {
						rowData.add(xssfCell.getRawValue());
					}

				}
				userData.put(i, rowData);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return userData;
	}

	public static void selectDropDownValue(WebElement dropDown, String SelectDropDownOption) {

		Select select = new Select(dropDown);
		select.selectByVisibleText(SelectDropDownOption);
	}
}
