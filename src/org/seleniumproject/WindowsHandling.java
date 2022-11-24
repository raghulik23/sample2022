package org.seleniumproject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAHUL\\eclipse-workspace\\seleniumproject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//*****
		Actions a = new Actions(driver);
		//*****
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("furniture");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement furniture = driver.findElement(By.xpath("//span[contains(text(),'Beautiful Antique Wooden Fold-able Side Table/End')]"));
        a.moveToElement(furniture).perform();
        furniture.click();
        //To get one window handle
        String parentid = driver.getWindowHandle();
        //*****
        System.out.println("parent window id:" +parentid);
        //To get more 2window handles
        Set<String> allwindowid = driver.getWindowHandles();
        //*****
        System.out.println("all widowsid:" +allwindowid);
        for (String itr : allwindowid) {
        	if (itr != parentid) {
        		//*******************
        		driver.switchTo().window(itr);	
        		//*******************
			}	
		}
		WebElement producttitle = driver.findElement(By.id("productTitle"));
		String text = producttitle.getText();
	    System.out.println("producttitle:" + text);
	

	}

}
