package rediff;

import static util.TestBase.*;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

public class LoginTest {
  @Test
  public void f() {
	  clickBtn(By.linkText("Rediffmail"));
	  sleepFor(4);
	  enterText(By.name("login"), "Selenium");
	  enterText(By.name("passwd"), "Selenium");
	  clickBtn(By.name("proceed"));
  }
  @BeforeMethod
  public void beforeMethod() {
	  openBrowser("firefox");
	  openurl("https://www.rediff.com/");  
  }

  @AfterMethod
  public void afterMethod() {
	  quit();
  }

}
