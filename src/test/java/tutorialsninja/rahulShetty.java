package tutorialsninja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class rahulShetty {
    WebDriver driver;
    String browser = "edge";  // Change this to "firefox" or "edge" to test other browsers

    @BeforeMethod
    @Parameters("browser")
    public void setup(@Optional("chrome") String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            throw new IllegalArgumentException("Unsupported browser: " + browser);
        }

        driver.get("https://rahulshettyacademy.com/angularpractice/#");
        driver.manage().window().maximize();
    }

    @Test
    public void form() {
        driver.findElement(By.name("name")).sendKeys("Rohit Chouhan");
        driver.findElement(By.name("email")).sendKeys("rohitchouhankgn11@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("rohit@123");
        driver.findElement(By.id("exampleCheck1")).click();

        WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select slc = new Select(dropdown);
        slc.selectByIndex(0);

        driver.findElement(By.id("inlineRadio1")).click();
        driver.findElement(By.name("bday")).sendKeys("07081997");
        driver.findElement(By.cssSelector("[type=\"submit\"]")).click();

        String successMessage = driver.findElement(By.cssSelector("body > app-root > form-comp > div > div:nth-child(2) > div")).getText();

        if (successMessage.contains("The Form has been submitted successfully!")) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
