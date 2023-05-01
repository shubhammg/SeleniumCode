package selenium1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScreenShot {
@Test
	  public void tsetcases()  {
		  
System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP-PC\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
WebDriver driver =new FirefoxDriver();

driver.manage().deleteAllCookies();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://www.gmail.com");
//File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//try {
//	FileUtils.copyFile(src, new File("C:/selenium/error.png"));
//} catch (IOException e) {
	// TODO Auto-generated catch block
//	e.printStackTrace();=
}
	

}
