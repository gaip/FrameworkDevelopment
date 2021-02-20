package bootcamp.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComboBox {
	public static void main(String[] args) {
		WebDriver driver = LaunchBrowser.launch("http://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		
		WebElement textbox = driver.findElement(By.className("select2-search__field"));
		textbox.sendKeys("New Zealand");
		textbox.sendKeys(Keys.ENTER);
	}
}
