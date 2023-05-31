package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class launchEmptyChromeBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		Thread.sleep(3000);
		driver.quit();
	}
}
