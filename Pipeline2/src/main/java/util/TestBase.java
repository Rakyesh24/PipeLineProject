package util;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestBase extends ReadProperies  {
	

	static WebDriver driver;
	static WebElement ele;
	static Properties prop;
	
	public static void openBrowser(String browser) {
		driver = null;
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.manage().window().maximize();

	}

	public static void openurl(String url) {
		driver.get(url);
	}

	public static void enterText(By by, String text) {
		driver.findElement(by).sendKeys(text);

	}

	public static void enterKey(By by) {
		driver.findElement(by).sendKeys(Keys.ENTER);

	}

	public static void clickBtn(By by) {
		driver.findElement(by).click();

	}

	public static void selectRadio(By by, String text) {
		List<WebElement> ele = driver.findElements(by);
		for (WebElement e : ele) {
			if (e.getAttribute("value").equalsIgnoreCase(text)) {
				e.click();
				break;
			}
		}

	}

	public static void selectOneChkbx(By by, String text) {
		List<WebElement> ele = driver.findElements(by);
		for (WebElement e : ele) {
			if (e.getText().equalsIgnoreCase(text)) {
				e.click();
				break;
			}
		}
	}

	public static void selectAllChkbx(By by) {
		List<WebElement> ele = driver.findElements(by);
		for (WebElement e : ele) {
			if (!e.isSelected()) {
				e.click();
			}
		}
	}

	public static void selectDropdown(By by, String text) {
		WebElement ele = driver.findElement(by);
		Select sel = new Select(ele);
		sel.selectByValue(text);
	}

	public static void sleepFor(int t) {
		try {
			Thread.sleep(t * 1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void quit(){
		driver.quit();
	}

}
