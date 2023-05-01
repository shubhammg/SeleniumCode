package selenium1;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Ultimatix {
	@Test
	public void f5(){
	
	
System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP-PC\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
WebDriver driver =new FirefoxDriver();

driver.manage().deleteAllCookies();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

driver.get("https://www.facebook.com/");




}
}
