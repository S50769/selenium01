package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class SeleniumLocater {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.chrome.drive");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://m.facebook.com/login/?locale=en_GB");
// WebEliment and Locater
driver.findElement(By.id("m_login_email")).sendKeys("9893851251");
 Thread.sleep(2000);
driver.findElement(By.id("m_login_password")).sendKeys("Sa2121@#");
Thread.sleep(2000);
driver.findElement(By.name("login")).click();
// login.click();
Thread.sleep(2000);
driver.findElement(By.id("forgot-password-link")).click();
	}

}
