package bootcamp.test.tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import bootcamp.selenium.basic.LaunchBrowser;

public class StaticTable {
	public static void main(String[] args) {
		WebDriver driver = LaunchBrowser.launch("http://the-internet.herokuapp.com/tables");

		List<WebElement> headerList = driver.findElements(By.cssSelector("#table1 .header span"));
		List<WebElement> rowList = driver.findElements(By.cssSelector("#table1 tbody tr"));

		for (int i = 0; i < rowList.size(); i++) {
			WebElement row = rowList.get(i);
			List<WebElement> dataList = row.findElements(By.tagName("td"));

			if (headerList.size() == dataList.size()) {
				for (int j = 0; j < headerList.size(); j++) {
					System.out.println("HeaderName: " + headerList.get(j).getText());
					System.out.println("Data: " + dataList.get(j).getText());
				}
			} else
				System.out.println("Mismatch in header and data count");
		}
		driver.quit();
	}
}
