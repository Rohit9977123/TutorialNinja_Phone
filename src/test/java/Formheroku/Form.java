package Formheroku;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form {

	public static void main(String[] args) {

       WebDriver driver=new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://formy-project.herokuapp.com/form");
       
       driver.manage().window().maximize();
       
       //enter a first name 
       driver.findElement(By.xpath(("//input[@id='first-name']"))).sendKeys("Rohit");
       // enter a last name 
       driver.findElement(By.xpath("//*[@placeholder=\"Enter last name\"]")).sendKeys("Chouhan");
       // enetr your job titile
       driver.findElement(By.xpath("//input[@id=\"job-title\"]")).sendKeys("Software Tester");
       // click your Highest level of education
       driver.findElement(By.id("radio-button-2")).click();
      // select your gender
       driver.findElement(By.id("checkbox-1")).click();
       WebElement dropdown= driver.findElement(By.xpath("//*[@id=\"select-menu\"]"));
       Select sql=new Select(dropdown);
              sql.selectByIndex(1);
      // select you DOB
          driver.findElement(By.id("datepicker")).sendKeys("07/08/1997");
          driver.findElement(By.xpath("//*[@class=\"btn btn-lg btn-primary\"]")).click();
          String Text=driver.findElement(By.xpath("/html/body/div/div")).getText();
          if(Text.contains("The form was successfully submitted!"))
          {
        	  System.out.println("succes");
        	  
          }
          else
          {
        	  System.out.println("Fail");
          }
	}

}
