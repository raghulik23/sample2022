package org.seleniumproject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debug {
	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\eclipse-workspace\\seleniumproject\\driver\\chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    WebElement signupbtn = driver.findElement(By.xpath("//a[@id='u_0_0_qR']"));
    signupbtn.click();
    
    WebElement malebtn = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
    malebtn.click();
	}

}
