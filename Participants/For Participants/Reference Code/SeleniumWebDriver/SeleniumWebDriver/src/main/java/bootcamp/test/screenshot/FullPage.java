package bootcamp.test.screenshot;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;

import bootcamp.selenium.basic.LaunchBrowser;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullPage {
	public static void main(String[] args) {
		WebDriver driver = LaunchBrowser.launch("http://bit.ly/seljavabcamp");

//		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
//				.takeScreenshot(driver);

		Screenshot screenshot = new AShot()
				.shootingStrategy(ShootingStrategies.viewportPasting(ShootingStrategies.scaling(1.75f), 1000))
				.takeScreenshot(driver);
// where 1.75f is device pixel ratio (you can run window.devicePixelRatio; in browser console to find it). If it's still not capturing full screen, change it to 2f

		try {
			ImageIO.write(screenshot.getImage(), "PNG", new File(
					"/Users/kunalashar/automation_bootcamp/SeleniumWebDriver/src/main/resources/fullpage.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
