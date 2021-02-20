package bootcamp.selenium.advance.file.excel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	private String testcase_file_path = "src/test/resources/testng/testCases.xlsx";
	private String sheetName = "InitialDraft";
	private String suiteToRun = "sanity";

	public List<TestcaseBO> read() {

		List<TestcaseBO> testcaseList = new ArrayList<TestcaseBO>();

		// create workbook
		XSSFWorkbook workbook = null;

		try {
			workbook = new XSSFWorkbook(testcase_file_path);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// get sheet
		XSSFSheet sheet = workbook.getSheet(sheetName);

		// get total rows in the sheet
		int totalRows = sheet.getPhysicalNumberOfRows();
		System.out.println("Total Rows in a sheet: " + totalRows);

		for (int i = 1; i < totalRows; i++) {

			// map to store each row data
			Map<String, String> rowMap = new HashMap<String, String>();

			int colNum = sheet.getRow(i).getLastCellNum();

			boolean isEndOfRow = false;

			for (int j = 0; j < colNum; j++) {
				String key = sheet.getRow(0).getCell(j).getStringCellValue();
				
				
				String value = null;
				try {
					// identify cell type to fetch the data
					CellType celltype = sheet.getRow(i).getCell(j).getCellType();

					switch (celltype) {
					case STRING:
						value = sheet.getRow(i).getCell(j).getStringCellValue();
						break;
					case NUMERIC:
						value = String.valueOf(sheet.getRow(i).getCell(j).getNumericCellValue());
						break;
					default:
						value = "";
					}
				} catch (NullPointerException npe) {
					value = "";
				}

				if (value.equals("END")) {
					isEndOfRow = true;
				} else
					rowMap.put(key, value);
			}

			// stop the reading mechanism
			if (isEndOfRow) {
				break;
			}
			// System.out.println(rowMap);

			// check if flag is marked as Y for the required suite
			if (rowMap.get(suiteToRun).equalsIgnoreCase("Y")) {
				TestcaseBO testcase = new TestcaseBO();
				testcase.setTestcaseName(rowMap.get("testcase_name"));
				testcase.setModuleName(rowMap.get("page_name"));
				testcaseList.add(testcase);
			}
		}
		
		try {
			workbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return testcaseList;
	}

	public static void main(String[] args) {
		ExcelReader er = new ExcelReader();
		er.read();
	}
}
