package org.seleniumproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Screenshot {

	public static void main(String[] args) throws IOException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\eclipse-workspace\\seleniumproject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//TakesScreenshot tS = (TakesScreenshot)driver;
		//File ss = tS.getScreenshotAs(OutputType.FILE);
		//File dest = new File("C:\\Users\\RAHUL\\eclipse-workspace\\seleniumproject\\screenshott\\fb.png");
		//FileUtils.copyFile(ss, dest);
		
		
		driver.get("https://www.amazon.in/");
		WebElement iphonetxt = driver.findElement(By.xpath("//input[@type='text']"));
		iphonetxt.sendKeys("iphone");
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_ENTER);
	    WebElement iphonepage = driver.findElement(By.xpath("//div[@id='search']"));
	    TakesScreenshot tss = (TakesScreenshot)driver;
	    File sa = tss.getScreenshotAs(OutputType.FILE);
	    File dest2 = new File("C:\\Users\\RAHUL\\eclipse-workspace\\seleniumproject\\screenshott\\amazon.png");
	    FileUtils.copyFile(sa, dest2);
	    	
		
		
	}

}
