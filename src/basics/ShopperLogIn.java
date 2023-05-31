package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperLogIn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//upcasting the WebDriver to ChromeDriver 
WebDriver driver = new ChromeDriver();
// using get() to put URL on browser
driver.get("https://www.shoppersstack.com/user-signin");
//maximize the window
driver.manage().window().maximize();

driver.findElement(By.id("vertical-tab-0")).click();
//thread for wait browser to get execute next thread
//Thread.sleep(2000);
//find the email field 
WebElement email = driver.findElement(By.id("Email"));
//and enter the email
email.sendKeys("howdysachin@outlook.com");

//Thread.sleep(2000);
//find the password field and enter the password
driver.findElement(By.id("Password")).sendKeys("Sachin@123");

//Thread.sleep(2000);
//find the login button and click
driver.findElement(By.id("Login")).click();


	}

}
