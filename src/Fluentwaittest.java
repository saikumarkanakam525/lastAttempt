import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwaittest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * // Waiting 30 seconds for an element to be present on the page, checking //
		 * for its presence once every 5 seconds. Wait<WebDriver> wait = new
		 * FluentWait<WebDriver>(driver) .withTimeout(Duration.ofSeconds(30L))
		 * .pollingEvery(Duration.ofSeconds(5L))
		 * .ignoring(NoSuchElementException.class);
		 * 
		 * WebElement foo = wait.until(new Function<WebDriver, WebElement>() { public
		 * WebElement apply(WebDriver driver) { return driver.findElement(By.id("foo"));
		 * } });
		 * 
		 */

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\SAI KUMAR\\\\Downloads\\\\Selenium WebDriver\\\\2. Install Java and Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("div[id='start'] button")).click();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {

				if (driver.findElement(By.cssSelector("div[id='finish'] h4")).isDisplayed()) {
					return driver.findElement(By.cssSelector("div[id='finish'] h4"));
				}
				else {
					return null;
				}
			}

		});
		System.out.println(driver.findElement(By.cssSelector("div[id='finish'] h4")).isDisplayed());
	}

}
