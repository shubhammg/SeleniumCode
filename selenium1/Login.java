package selenium1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login {

	@Test
	  public void f3() throws IOException, Exception {
		  
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP-PC\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");

		  
		  WebDriver driver =new FirefoxDriver();   




driver.manage().deleteAllCookies();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://www.facebook.com");

WebElement username =driver.findElement(By.xpath("//input[@class='inputtext']"));
username.sendKeys("tandonshubham70@gmail.com");
WebElement pass =driver.findElement(By.xpath("//input[@type='password']"));
pass.sendKeys("indian100");
WebElement login =driver.findElement(By.xpath("//label[@class='uiButton uiButtonConfirm']"));
login.click();
Thread.sleep(3000);

//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(scrFile, new File("C:\\screhot.png"));


WebElement nav= driver.findElement(By.xpath("//div[@id='userNavigationLabel']"));
nav.click();




	

	}}
