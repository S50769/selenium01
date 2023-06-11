package basics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.Throw;

import org.openqa.selenium.By;

public class UsageOfToUrlUrl {
	public static void main(String[]a) throws MalformedURLException {
		Throw InterruptedException, MalformedURLException;
	
	 {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.dassault-aviation.com/en/");
		URL mainUrl = new URL("https://www.dassault-aviation.com/en/");
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
		
		
		driver.quit();
	 }
	}}