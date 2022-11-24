package org.seleniumproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.parser.antlr.GraphqlParser.ArgumentsContext;


public class JavaScriptExe {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAHUL\\eclipse-workspace\\seleniumproject\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement passtxt = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('value','12345')",passtxt);
        WebElement click = driver.findElement(By.xpath("//button[@name='login']"));
        js.executeScript("arguments[0].click()", click);
        TakesScreenshot ts = (TakesScreenshot)driver;
        File ss = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\RAHUL\\eclipse-workspace\\seleniumproject\\screenshott\\jvsc.png");
        FileUtils.copyFile(ss, destination);
        
        
        
        
        
	}

}
