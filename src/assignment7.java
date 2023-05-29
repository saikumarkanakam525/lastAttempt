import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\SAI KUMAR\\\\Downloads\\\\Selenium WebDriver\\\\2. Install Java and Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.sumome-react-wysiwyg-component:nth-child(7)")));
		//driver.findElement(By.cssSelector("div.sumome-react-wysiwyg-component:nth-child(7)")).click();
		
		//driver.findElement(By.cssSelector("a[href='https://www.rahulshettyacademy.com/AutomationPractice']")).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("product")));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		System.out.println(driver.findElements(By.cssSelector("table[class='table-display'] tr")).size());
		
		System.out.println(driver.findElements(By.cssSelector("table[class='table-display'] th")).size());
		
		System.out.println(driver.findElement(By.cssSelector("table[class='table-display'] tr:nth-child(3)")).getText());

	}

}
