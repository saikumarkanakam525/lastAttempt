/*Author: Sai Kumar Kanakam
 *Email: saikumar.kanakam525@gmail.com
 *This exercise is to 
 	*Check the first  Checkbox on https://rahulshettyacademy.com/AutomationPractice/ and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked
 	*And How to get the Count of number of check boxes present in the page
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxesExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAI KUMAR\\Downloads\\Selenium WebDriver\\2. Install Java and Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		//System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		//System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		//System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		//To count the number of check-boxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
	}

}
