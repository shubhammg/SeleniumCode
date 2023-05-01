package selenium1;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SoftAssert {
	
	
	@Test
	public void f6(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP-PC\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.gmail.com/");
		WebElement st1= driver.findElement(By.xpath("//h1[@id='headingText']"));
		st1.getText();
		
	Assert.assertEquals("Sign khjhjhjhjhin", st1);
	System.out.println("matchs");
	
	
	
	}

}
