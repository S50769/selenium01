package basics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class UsageOfToUrlUrl {
	
	 throws InterruptedException, MalformedURLException
	 {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://wwww.dassault-aviation.com/en/");
		URL mainUrl = new URL("https://wwww.dassault-aviation.com/en/");
		//build the group page URL 
		URL groupPageUrl = new URL(mainUrl,"group/");
		// build the defense page URL 
		URL defensePageUrl = new URL(mainUrl,"defense/");
		// buiild a civil page URL
		URL civilPageUrl = new URL(mainUrl,"civil/");
		// build the space page URL
		
		URL spacePageUrl = new URL(mainUrl,"space/");
		// passion page url
		URL passionPageUrl = new URL(mainUrl,"passion/");
		
		Thread.sleep(2000);
	}
}


