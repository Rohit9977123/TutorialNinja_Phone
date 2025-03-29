package Alert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertOKCancelText {
	WebDriver driver;
	@BeforeMethod
	public void Setup()
	{
		driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void ALertWithOK()
	{
		driver.findElement(By.xpath("//*[@class='btn btn-danger']")).click();
		Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        if(alertText.equals("I am an alert box!"))
        {
        	System.out.println("Succes");
        }
        else
        {
        	System.out.println("Fail");
        }
        alert.accept();
		
	}
	@Test(priority=2)
	public void AlertWithCancelOK()
	{   
		


		driver.findElement(By.xpath("(//*[@class=\"analystic\"])[2]")).click();
		driver.findElement(By.xpath("//*[@class=\"btn btn-primary\"]")).click();
		
		Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        if(alertText.equals("Press a Button !"))
        {
        	System.out.println("Succes");
        }
        else
        {
        	System.out.println("Fail");
        }
        alert.accept();
        //alert.dismiss();
		
		
		
	}
	
	@Test(priority=3)
	public void AlertWithPromtK()
	{   
		


		driver.findElement(By.xpath("(//*[@class=\"analystic\"])[3]")).click();
		driver.findElement(By.xpath("//*[@class=\"btn btn-info\"]")).click();
       Alert promptAlert = driver.switchTo().alert();
       promptAlert.sendKeys("Rohit Chouhan");
       promptAlert.accept();

		
		
		
	}
	
	@AfterMethod
	public void teardown()
	{
	 driver.close();
	}
	}


