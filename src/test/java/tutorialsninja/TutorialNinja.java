package tutorialsninja;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TutorialNinja {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		// Initialize a new instance of ChromeDriver to launch the Chrome browser
		driver = new ChromeDriver();

		// Set an implicit wait of 10 seconds to handle dynamic elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to the TutorialsNinja demo website
		driver.get("https://tutorialsninja.com/demo/");

		// Maximize the browser window for better visibility
		driver.manage().window().maximize();
		
		


}
	@Test(priority = 1)
	public void login()
	{
		// Click on the "My Account" link to open the account options
		driver.findElement(By.linkText("My Account")).click();

		// Click on the "Login" option to navigate to the login page
		driver.findElement(By.linkText("Login")).click();

		// Enter the registered email in the email input field
		driver.findElement(By.id("input-email")).sendKeys("rohitchouhankgn11@gmail.com");

		// Enter the password in the password input field
		driver.findElement(By.id("input-password")).sendKeys("Rohit@DmauS6");

		// Click on the "Login" button using its CSS selector
		driver.findElement(By.cssSelector("[value='Login']")).click();

		// Retrieve the text of the link "Qafox.com" after logging in
		String text = driver.findElement(By.linkText("Qafox.com")).getText();

		// Validate if the retrieved text contains "Qafox.com"
		if (text.contains("Qafox.com")) {
		    System.out.println("Successfully logged in");
		} else {
		    System.out.println("Login failed");
		}
       
	}
	@Test(priority = 2)
	public void Search()
	
	{   
	
		// Enter the search term "Phone" into the search input field
		driver.findElement(By.name("search")).sendKeys("Phone");

		// Click on the search button using XPath locator
		driver.findElement(By.xpath("//*[@class='btn btn-default btn-lg']")).click();

		// Retrieve the text of the "iPhone" link from the search results
		String text = driver.findElement(By.linkText("iPhone")).getText();

		// Validate if the retrieved text contains "iPhone"
		if (text.contains("iPhone")) {
		    System.out.println("Search successful: iPhone found");
		} else {
		    System.out.println("Search failed: iPhone not found");
		}
	       
		}
	@Test(priority = 3)
	public void addTocart()
	{
		// Click on the "iPhone" product link to open the product details page
		driver.findElement(By.linkText("iPhone")).click();
		
		// Clear the default quantity input field to avoid incorrect entries
		driver.findElement(By.id("input-quantity")).clear();
		
		// Enter the desired quantity (2) into the input field
		
		driver.findElement(By.id("input-quantity")).sendKeys("2");
		
		// Click on the "Add to Cart" button (uncomment if needed)
		driver.findElement(By.xpath("//*[@class=\"btn btn-primary btn-lg btn-block\"]")).click();
		
		
		
		
	}
	
	@Test(priority = 4)
	public void checkout()
	{
		// Click on the "Checkout" link to proceed with the checkout process
		driver.findElement(By.linkText("Checkout")).click();
	}
		
		
	
	


@AfterMethod
public void Teardown()
{
	// Close the current browser window
	driver.close();
	
}
}
