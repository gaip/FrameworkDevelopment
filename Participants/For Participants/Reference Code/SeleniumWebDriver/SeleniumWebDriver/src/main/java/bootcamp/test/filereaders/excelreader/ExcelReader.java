package bootcamp.test.filereaders.excelreader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	// testcase file path
	private String testcaseFilePath = "src/test/resources/test/testCases.xlsx";
	private String suiteName = "sanity";

	public void read() {

		XSSFWorkbook workbook = null;
		List<TestcaseBO> testcaseList = new ArrayList<TestcaseBO>();

		// get entire workbook
 
		try {
			workbook = new XSSFWorkbook(testcaseFilePath);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// capture sheet
		XSSFSheet sheet = workbook.getSheet("InitialDraft");

		// find total rows
		int totalRows = sheet.getPhysicalNumberOfRows();

		for (int i = 0; i < totalRows; i++) {

			// map to store all values present in the excel
			Map<String, String> testcaseMap = new HashMap<String, String>();

			// get columns present in that row
			int colNum = sheet.getRow(i).getLastCellNum();

			// check if end of row reached
			boolean isEndOfRow = false;

			// iterate on all the cells
			for (int j = 0; j < colNum; j++) {

				// capture key and value
				String key = sheet.getRow(0).getCell(j).getStringCellValue().toLowerCase();

				// store value
				String value = null;
				try {

					CellType cellType = sheet.getRow(i + 1).getCell(j).getCellType();

					switch (cellType) {
					case STRING:
						value = sheet.getRow(i + 1).getCell(j).getStringCellValue();
						break;
					case NUMERIC:
						value = String.valueOf(sheet.getRow(i + 1).getCell(j).getNumericCellValue());
						break;
					default:
						value = "";
						break;
					}
				} catch (NullPointerException e) {
					value = "";
				}

				// check if END of row reached
				if (value.equals("END"))
					isEndOfRow = true;
				else
					// add data to map
					testcaseMap.put(key, value);
			}

			// stop reading file if end of row reached
			if (isEndOfRow)
				break;

			// add values in BO
			if (testcaseMap.get(suiteName).equalsIgnoreCase("Y")) {
				TestcaseBO testcase = new TestcaseBO();
				testcase.setName(testcaseMap.get("testcase_name"));
				testcase.setPageName(testcaseMap.get("page_name"));

				// add testcase data to the list
				testcaseList.add(testcase);
			}
		}

		// close workbook
		try {
			workbook.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		// print all cases to be executed
		System.out.println(testcaseList);
	}

	public static void main(String[] args) {
		ExcelReader er = new ExcelReader();
		er.read();
	}

}
