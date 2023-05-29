import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SAI KUMAR\\\\Downloads\\\\Selenium WebDriver\\\\2. Install Java and Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");//Accessing https://rahulshettyacademy.com/angularpractice/
		driver.findElement(By.name("name")).sendKeys("Sai Kumar Kanakam"); //Input keys in Name field
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("saikumar.kanakam525@gmail.com"); //Input keys in Email field
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Selenium@123"); //Input keys in password field
		driver.findElement(By.id("exampleCheck1")).click(); //Checking checkbox
		WebElement StaticDropdown = driver.findElement(By.id("exampleFormControlSelect1")); //Creating WebElement to store static dropdown options
		Select Dropdown = new Select(StaticDropdown); 
		Dropdown.selectByVisibleText("Male"); //selecting Male from dropdown options
		driver.findElement(By.id("inlineRadio1")).click(); //Selecting "Student" radio button
		driver.findElement(By.name("bday")).sendKeys("03/21/2022"); //Input DOB
		driver.findElement(By.className("btn-success")).click(); //Clicking Submit
		Thread.sleep(3000L); //Wait for 3 seconds
		System.out.println(driver.findElement(By.cssSelector("div.alert-dismissible")).getText()); //printing success text
	}

}
