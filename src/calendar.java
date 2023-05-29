import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\SAI KUMAR\\\\Downloads\\\\Selenium WebDriver\\\\2. Install Java and Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/");
		//September 22
		
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		
		while(!driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText().contains("September")) {
			driver.findElement(By.cssSelector("span[class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		}

		List<WebElement> dates = driver.findElements(By.cssSelector("div[class='dateInnerCell'] p:nth-child(1)"));
		 
		int count = dates.size();
		for(int i=0;i<count;i++) {
			String text=driver.findElements(By.cssSelector("div[class='dateInnerCell'] p:nth-child(1)")).get(i).getText();
			if (text.equalsIgnoreCase("22")) {
				driver.findElements(By.cssSelector("div[class='dateInnerCell'] p:nth-child(1)")).get(i).click();
				break;
			}
				
		}
		

	}

}
