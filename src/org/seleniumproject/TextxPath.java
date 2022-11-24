package org.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.api.trace.Span;

public class TextxPath {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\eclipse-workspace\\seleniumproject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	// finding xpath using text
	//driver.get("http://www.greenstechnologys.com/");
	//WebElement bigdatabtn = driver.findElement(By.xpath("//a[text()='Master Program']"));
	//bigdatabtn.click();
	//1.gettext-usingcontainstextxpath-and-split
	//driver.get("https://www.facebook.com/");
	//WebElement fbtxt = driver.findElement(By.xpath("//div[contains(text(),'celebrity')]"));
	//String txt = fbtxt.getText();
	//System.out.println(txt);
	//String[] spltxt = txt.split(" ");
	//for (int i = 0; i < spltxt.length; i++) {	
	//}
	//System.out.println(spltxt[4]);
	//2.getattribute
    driver.get("https://www.facebook.com/");
    WebElement mailTxt = driver.findElement(By.name("email"));
    mailTxt.sendKeys("raghul@gmail.com");
    String enteredTxt = mailTxt.getAttribute("value");
    System.out.println(enteredTxt);
    
    

	}

}
