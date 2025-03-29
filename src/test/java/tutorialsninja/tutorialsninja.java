package tutorialsninja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tutorialsninja {
	WebDriver driver;
@BeforeMethod
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://tutorialsninja.com/demo/");
	driver.manage().window().maximize();
}

@Test
public void register() throws InterruptedException
{
	driver.findElement(By.partialLinkText("My Account")).click();
	driver.findElement(By.partialLinkText("Register")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.name("input-firstname")).sendKeys("Sanjay");
	driver.findElement(By.name("input-lastname")).sendKeys("Chouhan");

	driver.findElement(By.name("email")).sendKeys("Sanjaychouhankgn11@gmail.com");
	driver.findElement(By.name("telephone")).sendKeys("7582861187");
	
	
	driver.findElement(By.name("password")).sendKeys("Sanjay@123");
	driver.findElement(By.name("confirm")).sendKeys("Sanjay@123");
	
	driver.findElement(By.name("newsletter")).click();
	driver.findElement(By.name("agree")).click();
	driver.findElement(By.cssSelector("[value=\'Continue\']")).click();
	
}
}