import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\SAI KUMAR\\\\Downloads\\\\Selenium WebDriver\\\\2. Install Java and Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qaclickacademy.com/practice.php");
		//1. Give me the count of links in a page
		System.out.println(driver.findElements(By.tagName("a")).size());
		//2. Count of footer section
		WebElement footerDriver = driver.findElement(By.id("gf-BIG")); //limiting webDriver scope
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//3. count number of links in first column of footer section
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		//4. Check whether links in column1 are opening any page
		for (int i=1; i<columnDriver.findElements(By.tagName("a")).size(); i++) {
			String clickOnLinkOpenInNewTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkOpenInNewTab);
			Thread.sleep(5000L);
		}
		
		Set <String> window= driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}
	}

}
