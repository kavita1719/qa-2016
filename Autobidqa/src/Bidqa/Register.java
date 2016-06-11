package Bidqa;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;


public class Register {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
String URL = "http://bidqa.com";
//open the new window
driver.get(URL);
driver.manage().window().maximize();
String expectedTitle = "BIDQA";
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
String actualTitle = driver.getTitle();
if(expectedTitle.equals(actualTitle))
{System.out.println("Correcct Page");}
else
{System.out.println("Incorrect Page");}
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//Thread.sleep(20000);
driver.findElement(By.className("register-awsome")).click();

driver.findElement(By.id("user_login")).click();
driver.findElement(By.id("user_login")).sendKeys("lariosa");
driver.findElement(By.id("user_email")).click();
driver.findElement(By.id("user_email")).sendKeys("lariosa@gmail.com");
driver.findElement(By.xpath("//input[@id='user_tp'][2]")).click();
System.out.println("so far good");
//Thread.sleep(30000);
driver.findElement(By.id("submits")).click();
driver.findElement(By.linkText("Login")).click();
System.out.println("done");
//driver.close();

	}	
	}

	
	

