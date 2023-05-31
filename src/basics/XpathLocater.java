package basics;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocater {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com");
 driver.manage().window().maximize();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

WebElement searchField = driver.findElement(By.name("q"));
searchField.sendKeys("APPLE iPad (10th Gen) 64 GB ROM 10.9 inch with Wi-Fi Only (Silver)");

WebElement submitField = driver.findElement(By.className("L0Z3Pu"));
submitField.click();
WebElement productName = driver.findElement(By.xpath("//div[text()='APPLE iPad (10th Gen) 64 GB ROM 10.9 inch with Wi-Fi Only (Silver)'] div[@class='B_NuCI']"));
Thread.sleep(2000);
productName.click();

	}

}
