package SeleniumTeacherClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocator__id {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
//identify the login button
		WebElement loginButton = driver.findElement(By.id("loginbutton"));
		loginButton.click();
		driver.manage().window().minimize();
		driver.quit();
	}

}
