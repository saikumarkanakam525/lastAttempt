import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAI KUMAR\\Downloads\\Selenium WebDriver\\2. Install Java and Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();								//To maximize the browser window
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");   //Waits until all the weblements are loaded
		driver.navigate().to("https://www.google.com/");                   //Won't wait until all the webelements are loaded //To navigate to another page
		driver.navigate().back();                                          //To navigate back to previous web page
		driver.navigate().forward();										//To navigate to next web page

	}

}
