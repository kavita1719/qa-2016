package LaunchHive;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiveSchool {
	//static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 WebDriver driver = new ChromeDriver(); 
System.setProperty("WebDriver.Chrome.driver","C:\\seleniumserver\\chromedriver\\chromedriver.exe");
File filepath = new File("C:\\seleniumserver\\student_qa_v1.3.19.crx");
ChromeOptions options = new ChromeOptions();
options.addExtensions(filepath);
DesiredCapabilities capabilities = new DesiredCapabilities();
capabilities.setCapability(ChromeOptions.CAPABILITY, options);
driver = new ChromeDriver(capabilities);
driver.get("https://qa.hiveschool.aerohive.com/apps/student/");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.linkText("Sign in with Google")).click();
//Enter the email 
driver.findElement(By.id("Email")).sendKeys("rose16915@gmail.com");
driver.findElement(By.id("next")).click();
//Enter the password
driver.findElement(By.id("Passwd")).sendKeys("16915rose");
driver.findElement(By.id("signIn")).click();
/*WebDriverWait wait = new WebDriverWait(driver, 20);
WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='submit_approve_access']")));*/
Thread.sleep(3000);
//driver.findElement(By.linkText("Allow")).click();
driver.findElement(By.id("submit_approve_access")).click();
//driver.findElement(By.xpath("//button[@id='submit_approve_access']")).click();
	}

}
