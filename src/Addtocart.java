import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Addtocart {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SAI KUMAR\\Downloads\\Selenium WebDriver\\2. Install Java and Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //Implicit wait
		
		//Explicit wait
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot", "Carrot"};//array
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(5000L);
		addItems(driver, itemsNeeded);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		//Thread.sleep(5000L);
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		

	}
	
	public static void addItems(WebDriver driver, String[] itemsNeeded){
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
		//check whether the name you extracted is present in array or not
		
		int j=0;
		for (int i = 0; i < product.size(); i++) {
			//click to add to cart
			
			//Brocolli - 1 kg
			String[] name = product.get(i).getText().split("-");
			String formattedName = name[0].trim();
			//format it to actual vegetable name
			
			
			//Convert array into arraylist for easy search
			List<String> itemsNeededList = Arrays.asList(itemsNeeded);
			
			if (itemsNeededList.contains(formattedName)) {
				j++;
				//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(); finding "Add to cart" text
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				//3 times
				if (j==itemsNeeded.length) {
					break;
				}
			}
		}
	}

}
