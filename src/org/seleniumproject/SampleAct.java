package org.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleAct {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\eclipse-workspace\\seleniumproject\\driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    //driver.get("http://www.greenstechnologys.com/");
    //WebElement courses = driver.findElement(By.xpath("//a[text()='COURSES']"));
    Actions a = new Actions(driver);
    //a.moveToElement(courses).perform();
    //WebElement oracle = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
    //a.moveToElement(oracle).perform();
    //WebElement sql = driver.findElement(By.xpath("//span[text()='SQL Certification']"));
    //sql.click();
    driver.get("https://www.flipkart.com/");
    WebElement homeandfurn = driver.findElement(By.xpath("//div[@text()='Home & Furniture']"));
    a.moveToElement(homeandfurn).perform();
    homeandfurn.click();    
    
    
    
    
	}

}
