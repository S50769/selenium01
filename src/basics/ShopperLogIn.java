package basics;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperLogIn {

	public static void main(String[] args) throws Throwable  {
		
		//upcasting the WebDriver to ChromeDriver 
WebDriver driver = new ChromeDriver();
// using get() to put URL on browser
driver.get("https://www.shoppersstack.com/user-signin");
//maximize the window
driver.manage().window().maximize();
//thread for wait browser to get execute next thread
Thread.sleep(2000);
//find the email field 
WebElement emailTextField = driver.findElement(By.cssSelector("input[name='Email']"));
//and enter the email
emailTextField.sendKeys("howdysachin@outlook.com");

//Thread.sleep(2000);
//find the password field and enter the password

WebElement PasswordTextField = driver.findElement(By.cssSelector("input[name='Password']"));
PasswordTextField.sendKeys("Sachin@123");

//Thread.sleep(2000);
//find the login button and click
driver.findElement(By.id("Login")).click();
driver.manage().window().minimize();

	}

}
