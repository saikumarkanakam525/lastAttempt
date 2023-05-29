import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\SAI KUMAR\\\\Downloads\\\\Selenium WebDriver\\\\2. Install Java and Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qaclickacademy.com/practice.php");//accessing webpage
		driver.findElement(By.id("checkBoxOption3")).click();//clicking option3 checkmark
		String optionSelected = driver.findElement(By.cssSelector("label[for='honda']")).getText();//grabbing option3 text and storing in string variable
		WebElement staticDropDown = driver.findElement(By.id("dropdown-class-example"));
		Select dropDown = new Select(staticDropDown);
		dropDown.selectByVisibleText(optionSelected);//checking for option3 from dropdown
		driver.findElement(By.id("name")).sendKeys(optionSelected);//inputing option3 into text box
		driver.findElement(By.id("alertbtn")).click();//clicking on Alert
		System.out.println(driver.switchTo().alert().getText().contains(optionSelected));//checking for option3 in alert text and printing boolean as output
		

	}

}
