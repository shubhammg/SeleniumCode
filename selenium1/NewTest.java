 package selenium1;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f1() {
	  int a=1;
	  int b=2;
	 int  sum=a+b;
	  System.out.println(+sum);
  }
  @Test
  public void f2() {
	  int a=5;
	  int b=2;
	 int  sum=a+b;
	  System.out.println(+sum);}
  
	  @Test
	  public void f3() {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP-PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://www.facebook.com");
//driver.findElement(By.name("q")).sendKeys("java");
//below uses by name
//WebElement firstname =  driver.findElement(By.name("firstname"));


//below uses xpath
WebElement firstname =  driver.findElement(By.xpath("//input[@name='firstname']"));


firstname.sendKeys("shham");
//element.submit();
WebElement surname =  driver.findElement(By.name("lastname"));
surname.sendKeys("taon");
WebElement email =  driver.findElement(By.name("reg_email__"));
email.sendKeys("tandon@gmail.com");
WebElement pass = driver.findElement(By.name("reg_passwd__"));
pass.sendKeys("indi100");
WebElement sex =driver.findElement(By.name("sex"));
sex.click();

WebElement signup =driver.findElement(By.name("websubmit"));
signup.click();
//String  error=driver.findElement(By.name("reg_email_confirmation__")).getText();
//String ex_error ="Re-enter email address";
//Assert.assertEquals(error, ex_error);



//login.submit();
//WebElement s1 = driver.findElement(By.xpath("////*[@id="facebook"]/body"));
//WebElement s1 =  driver.findElement(By.id("userNavigationLabel"));
//s1.click();


//driver.close();
		  int a=5;
		  int b=2;
		 int  sum=a+b;
		  System.out.println(+sum);
	  
}
	  @Test
	  public void f4() {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP-PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://www.facebook.com");

//below is not working
WebElement logo =driver.findElement(By.xpath("//a[contains(text(),'Create a Page')]"));
//WebElement logo =driver.findElement(By.id("birthday-help"));
logo.click();

	  
	  
}}
