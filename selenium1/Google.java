package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Google {
	
	
	public static void main(String[] args) {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP-PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://www.gmail.com");
//WebElement next =driver.findElement(By.id(id))


//driver.findElement(By.name("q")).sendKeys("java");
//WebElement firstname =  driver.findElement(By.name("firstname"));


}}
