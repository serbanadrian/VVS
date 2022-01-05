package Selenium;
import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class SeleniumTests {

public static void main(String[] args) {
// TODO Auto-generated method stub

//setting the driver executable
System.setProperty("webdriver.chrome.driver", "C:\\Users\\adria\\Desktop\\chromedriver_win32\\chromedriver.exe");

//Initiating your chromedriver
WebDriver driver=new ChromeDriver();

//Applied wait time
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//maximize window
driver.manage().window().maximize();
//open browser with desried URL
driver.get("file:///C:/Users/adria/Desktop/Valeu/VVS-main/VVS-main/webserver/webserver/src/webserver/html/index.html");
if(driver.getPageSource().contains("Salut!"))
{
	System.out.println("Textul este vizibil");
}
else
{
	System.out.println("Textul nu este vizibil");
}
if(driver.getPageSource().contains("A little brown fox jumps over the lazy dog."))
{
	System.out.println("Textul este vizibil");
}
else
{
	System.out.println("Textul nu este vizibil");
}
if(driver.getPageSource().contains("masina"))
{
	System.out.println("Textul este vizibil");
}
else
{
	System.out.println("Textul nu este vizibil");
}

//closing the browser
//driver.close();

}

}