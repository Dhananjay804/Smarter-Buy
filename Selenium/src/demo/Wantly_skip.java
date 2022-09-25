package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Wantly_skip {
	public class Demo1 {
		 @Test(enabled=false)
		public void test1()
		{
			Reporter.log("1", true);
		}
		 @Test
		public void test2()
		{
			Reporter.log("2", true);
		} 
		}

}
