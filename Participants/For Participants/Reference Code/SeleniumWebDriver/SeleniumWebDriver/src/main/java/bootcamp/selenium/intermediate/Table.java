package bootcamp.selenium.intermediate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import bootcamp.selenium.basic.LaunchBrowser;

public class Table {
	public static void main(String[] args) {
		WebDriver driver = LaunchBrowser.launch("http://the-internet.herokuapp.com/tables");

		List<WebElement> headerList = driver.findElements(By.cssSelector("#table1 .header"));
		List<WebElement> rowList = driver.findElements(By.cssSelector("#table1 tbody tr"));

		// iterate on row
		for (int i = 0; i < rowList.size(); i++) {
			WebElement row = rowList.get(i);

			// get data present in the row
			List<WebElement> dataList = row.findElements(By.tagName("td"));

			// verify if data size is same as header size
			if (headerList.size() == dataList.size()) {

				// print each and every data present in the row
				for (int j = 0; j < headerList.size(); j++) {
					System.out.println(headerList.get(j).getText() + " : " + dataList.get(j).getText());
				}
			} else
				System.out.println("Header count is not matching with data count");
		}
		driver.quit();

		// From Hasan
		// Get number of rows In table.
		WebElement table = driver.findElement(By.id("table1"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		// Print data from each row (Data from each td tag)
		for (WebElement row : rows) {
			List<WebElement> cols = row.findElements(By.tagName("td"));
			for (WebElement col : cols) {
				System.out.print(col.getText() + "\t");
			}
			System.out.println();
		}
		driver.quit();
	}
}
