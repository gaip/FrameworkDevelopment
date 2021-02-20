package bootcamp.selenium.intermediate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import bootcamp.selenium.basic.LaunchBrowser;

public class Alerts {

	// 1. Informative (Simple)
	// 2. Confirmation
	// 3. Prompt

	public static void main(String[] args) {
		WebDriver driver = LaunchBrowser.launch("https://demoqa.com/alerts");
		
		
//
//		driver.findElement(By.id("alertButton")).click();
//		
//		Alert a = driver.switchTo().alert();
//		System.out.println(a.getText());
//		a.accept();
		
//		driver.findElement(By.id("confirmButton")).click();
//		driver.switchTo().alert().accept();
//		
		driver.findElement(By.id("promtButton")).click();
		Alert a = driver.switchTo().alert();
		a.sendKeys("hello");
		a.dismiss();
	}
}
