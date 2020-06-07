package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class LoginTest {
	WebDriver driver;
  
	@Test(enabled=false)
	public void rediffchrome() {
	  driver=new ChromeDriver();
	  driver.get("https://www.rediff.com/");
	  driver.findElement(By.linkText("Rediffmail")).click();
	  driver.findElement(By.name("login")).sendKeys("Selenium");
	  driver.findElement(By.name("passwd")).sendKeys("Selenium321");
	  driver.findElement(By.name("proceed")).click();
	  
  }
  
  @Test
  public void redifffirefox() {
	  driver=new FirefoxDriver();
	  driver.get("https://www.rediff.com/");
	  driver.findElement(By.linkText("Rediffmail")).click();
	  driver.findElement(By.name("login")).sendKeys("Selenium");
	  driver.findElement(By.name("passwd")).sendKeys("Selenium321");
	  driver.findElement(By.name("proceed")).click();
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", 
				"C:\\Program Files (x86)\\driver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Program Files (x86)\\driver\\geckodriver.exe");
		 
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
