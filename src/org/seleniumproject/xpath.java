package org.seleniumproject;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\eclipse-workspace\\seleniumproject\\driver\\chromedriver.exe");
		
	    ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	    //driver.get("https://www.amazon.in/");
		driver.get(" https://www.swiggy.com/");
	    //WebElement searchtxt = driver.findElement(By.xpath("//input[@aria-label='Search']"));
	    //searchtxt.sendKeys("watches for men");
		WebElement signupbtn = driver.findElement(By.xpath("//a[@class='r2iyh']"));
		signupbtn.click();
	    driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9445625009");
	    driver.findElement(By.xpath("//input[@id='name']")).sendKeys("raghul");
	    driver.findElement(By.xpath("//input[@class='_381fS']")).sendKeys("raghuloff@gmail.com");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("raghul123");
	    WebElement continuebtn = driver.findElement(By.xpath("//a[@class='a-ayg']"));
	    continuebtn.click();
	    
		
	}

}
