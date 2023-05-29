import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//invoke browser
		// chromedriver.exe -> chrome browser
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAI KUMAR\\Downloads\\Selenium WebDriver\\2. Install Java and Selenium\\chromedriver_win32\\chromedriver.exe");
//		
//		WebDriver driver1 = new ChromeDriver();
//		
//		driver1.get("https://www.cadvisionengineers.com");
//		System.out.println(driver1.getTitle());
//		System.out.println(driver1.getCurrentUrl());
//		driver1.close();
//		// driver1.quit();
		
	

//		
//		//invoke firefox browser
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SAI KUMAR\\Downloads\\Selenium WebDriver\\2. Install Java and Selenium\\geckodriver-v0.32.2-win64\\geckodriver.exe");
//		WebDriver driver2 = new FirefoxDriver();
//		
//		
//		driver2.get("https://www.rahulshettyacademy.com");
//		System.out.println(driver2.getTitle());
//		System.out.println(driver2.getCurrentUrl());
//		driver2.close();
//		// driver2.quit();
		
		
		// invoke Edge browser
		System.setProperty("webdriver.edge.driver", "C:\\Users\\SAI KUMAR\\Downloads\\Selenium WebDriver\\2. Install Java and Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver3 = new EdgeDriver();
		
		driver3.get("https://www.cadvisionengineers.com/");
		System.out.println(driver3.getTitle());
		System.out.println(driver3.getCurrentUrl());
		driver3.close();
		// driver3.quit();
//
		
	}

}
