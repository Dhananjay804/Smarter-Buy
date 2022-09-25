package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

public class Generic_Test1 {
public WebDriver driver;
@BeforeMethod
public void openAppln()
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://localhost/login.do");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@AfterClass
public void closeAppln() throws InterruptedException
{
	Thread.sleep(4000);
	driver.close();
}
}
