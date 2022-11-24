package org.seleniumproject;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.util.Iterator;

import org.checkerframework.checker.units.qual.radians;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot {

	public static void main(String[] args) throws AWTException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\eclipse-workspace\\seleniumproject\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    WebElement mailtxt = driver.findElement(By.id("email"));
    mailtxt.sendKeys("raghul@gmail.com");
    Actions e = new Actions(driver);
    java.awt.Robot r = new java.awt.Robot();
    e.doubleClick(mailtxt).perform();
    //e.contextClick().perform();
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_A);
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.keyRelease(KeyEvent.VK_A);
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_X);
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.keyRelease(KeyEvent.VK_X);
    
    //for (int i = 0; i <2; i++) {
     //r.keyPress(KeyEvent.VK_DOWN);
     //r.keyPress(KeyEvent.VK_DOWN);
    		
	//}
    //r.keyPress(KeyEvent.VK_ENTER);
    //r.keyRelease(KeyEvent.VK_ENTER);
    r.keyPress(KeyEvent.VK_TAB);
    r.keyRelease(KeyEvent.VK_TAB);
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_V);
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.keyRelease(KeyEvent.VK_V);
    
    
    
   
    
    
    
    
    
    
    
    
    
	}

}
