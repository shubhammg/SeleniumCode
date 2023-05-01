package selenium1;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Xpath {
	
	@Test
	  public void f3() {
		  
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP-PC\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
WebDriver driver =new FirefoxDriver();

driver.manage().deleteAllCookies();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://www.facebook.com");

//driver.findElement(By.xpath(".//input[@type='text'and @name='lastname']")).sendKeys("user");;
driver.findElement(By.xpath(".//input[@id='u_0_l']")).sendKeys("user");;
//WebElement ui = driver.findElement(By.id("u_0_j"));
//WebElement surname =  driver.findElement(By.name("lastname"));
//ui.sendKeys("how");

//WebElement fr=driver.findElement(By.xpath("//a[contains(text(),'Create a Page')]"));
//fr.click();
WebElement ty =driver.findElement(By.linkText("Create a Page"));
ty.click();
}
}