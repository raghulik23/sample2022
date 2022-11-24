package org.seleniumproject;

import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAHUL\\eclipse-workspace\\seleniumproject\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
		/*driver.get("https://www.swiggy.com/");
        driver.manage().window().maximize();
        WebElement locTxt = driver.findElement(By.id("location"));
        locTxt.sendKeys("ik");*/
        //emailTxt.sendKeys("raghul@gmail.com");
        WebElement emailTxt = driver.findElement(By.id("email"));
        emailTxt.sendKeys("raghul@gmail.com");
        WebElement passTxt = driver.findElement(By.name("pass"));
        passTxt.sendKeys("raghul");
        WebElement loginBtn = driver.findElement(By.name("login"));
        loginBtn.click();  
        
        
        
        
        
        
        

}
}
