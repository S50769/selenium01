package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.drive","C:\\Program Files\\Google\\Chrome\\Application.exc");
WebDriver driver = new ChromeDriver();

driver.get("https://www.gmail.com/");
driver.manage().window().maximize();
driver.findElement(By.name("identifier")).sendKeys("howdysachin7@gmail.com");
// find the next button
WebElement nextButton = driver.findElement(By.xpath("//button[text()='Next']"));
nextButton.click();
/*
String at = driver.getTitle();
String et = "gmail";
driver.close();

if(at.equalsIgnoreCase(et))
{ 	System.out.println("Test sucessfull");
}
else
{ System.out.println("test Faild");
	}
*/
}
}