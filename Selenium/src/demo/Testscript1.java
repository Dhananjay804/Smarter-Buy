package demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testscript1 extends Generic_Test1 {
@Test
public void validlogin()
{
	driver.findElement(By.id("username")).sendKeys("testlead");
	driver.findElement(By.name("pwd")).sendKeys("testlead");
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	String title = driver.getTitle();
	System.out.println(title);
}
}
