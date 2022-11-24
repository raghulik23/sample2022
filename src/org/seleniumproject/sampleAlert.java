package org.seleniumproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverService;

public class sampleAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\eclipse-workspace\\seleniumproject\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    //simplealert
	    driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	    Alert a = driver.switchTo().alert();
	    String info = a.getText();
	    System.out.println(info);
	    a.accept();
	    //promtalert
	    //driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
	    //driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	    //Alert a = driver.switchTo().alert();
	    //String info = a.getText();
	    //System.out.println(info);
	    //a.sendKeys("raghul");
	    //a.accept();
	   
	    
	    

	}

}
