package bootcamp.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import bootcamp.selenium.basic.LaunchBrowser;

public class IFrame {

	public static void main(String[] args) {
		WebDriver driver = LaunchBrowser.launch("https://demoqa.com/frames");

		WebElement textContent = driver.findElement(By.cssSelector("#framesWrapper div"));
		System.out.println(textContent.getText());

		WebElement frame = driver.findElement(By.id("frame1"));
		driver = driver.switchTo().frame(frame);

		WebElement sampleText = driver.findElement(By.id("sampleHeading"));
		System.out.println(sampleText.getText());

		driver.switchTo().defaultContent();

		WebElement textContent1 = driver.findElement(By.cssSelector("#framesWrapper div"));
		System.out.println(textContent1.getText());
	}

}
