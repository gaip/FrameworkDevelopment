package bootcamp.selenium.advance.file.excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {

	public void write() {
		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet sheet = workbook.createSheet("TestData");

		Map<String, List<String>> dataMap = new HashMap<String, List<String>>();

		List<String> l1 = new ArrayList<String>();
		l1.add("user");
		l1.add("password");
		l1.add("email");

		List<String> l2 = new ArrayList<String>();
		l2.add("testuser");
		l2.add("pass123");
		l2.add("test@gmail.com");

		dataMap.put("Row1", l1);
		dataMap.put("Row2", l2);

		int rowNum = 0;

		for (String s : dataMap.keySet()) {
			Row row = sheet.createRow(rowNum++);

			int cellNum = 0;
			for (String data : dataMap.get(s)) {
				Cell cell = row.createCell(cellNum++);
				cell.setCellValue(data);
			}
		}

		try {
			FileOutputStream fos = new FileOutputStream(new File("src/test/resources/testng/dataDump.xlsx"));
			workbook.write(fos);
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ExcelWriter writer = new ExcelWriter();
		writer.write();
	}
}
