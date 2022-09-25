package test_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom_scripts.Pom1;

public class Login1 {
@Test
public void validLogin() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://localhost/login.do");
	Thread.sleep(2000);
	Pom1 p1=new Pom1(driver);
	p1.unTbox("testlead");
	Thread.sleep(2000);
	p1.pwdTbox("testlead");
	Thread.sleep(2000);
	p1.clickLogin();
	
}

}
