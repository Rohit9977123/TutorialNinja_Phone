package Formheroku;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserStack {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bstackdemo.com/");
		driver.manage().window().maximize();
	}
	@Test(enabled = false)
	public void login()
	{
		
		driver.findElement(By.xpath("//*[@id=\"signin\"]")).click();
		WebElement dropdown=driver.findElement(By.linkText("Select Username"));
		Select sql= new Select(dropdown);
		      sql.selectByIndex(1);
		      
		WebElement dropdown1=driver.findElement(By.linkText("Select Password"));
			Select sql1= new Select(dropdown1);
				      sql.selectByIndex(1);      
       driver.findElement(By.xpath("//*[@id=\"login-btn\"]")).click();
		      
		
	}
	@Test
	public void addTOcart()
	{
		driver.findElement(By.xpath("(//*[@class=\"shelf-item__buy-btn\"])[1]")).click();
		driver.findElement(By.xpath("//*[@class=\"buy-btn\"]")).click();

		
		driver.findElement(By.xpath("//*[@id=\"firstNameInput\"]")).sendKeys("Rohit");
		//
		driver.findElement(By.xpath("//*[@id=\"lastNameInput\"]")).sendKeys("Chouhan");
		
		driver.findElement(By.xpath("//*[@id=\"addressLine1Input\"]")).sendKeys("Indore");
		
		driver.findElement(By.xpath("//*[@id=\"provinceInput\"]")).sendKeys("MP");
		
		driver.findElement(By.xpath("//*[@id=\"postCodeInput\"]")).sendKeys("450551");
         driver.findElement(By.xpath("//*[@class=\"button button--primary optimizedCheckout-buttonPrimary\"]")).click();
		
		String order = driver.findElement(By.xpath("//*[@class=\"form-legend optimizedCheckout-headingSecondary\"]")).getText();
		
		if (order.contains("Your Order has been successfully placed.")) {
			System.out.println("Successfully");
			
		}
		else 
		{
			System.out.println("Unsuccessfully");
		}
	}


		@AfterMethod
		public void Teadown()
		{
			driver.close();
		}
		
			
	
	
	

}
