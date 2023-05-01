package selenium1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gmail {

	@Test
	  public void gmail() throws IOException  {
		  
System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP-PC\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
WebDriver driver =new FirefoxDriver();

driver.manage().deleteAllCookies();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://www.gmail.com");

WebElement st1= driver.findElement(By.xpath("//h1[@id='headingText']"));
st1.getText();

Assert.assertEquals("Sign in", st1);
System.out.println("matchs");	

WebElement create=driver.findElement(By.xpath("//span[contains(text(),'Create account')]"));
create.click();



 
WebElement firstname=driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']"));
firstname.sendKeys("simple");
WebElement lastname=driver.findElement(By.xpath("//input[@id='lastName']"));
lastname.sendKeys("simple");

WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
username.sendKeys("mysimple5625");

WebElement pass=driver.findElement(By.xpath("//input[@name='Passwd']"));
pass.sendKeys("Life@123");
WebElement pass2=driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
pass2.sendKeys("Life@123");

WebElement linkk=driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
linkk.click();

File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(scrFile, new File("C:\\screenshot.png"));


	}



	
}

