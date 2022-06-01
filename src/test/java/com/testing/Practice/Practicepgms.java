package com.testing.Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practicepgms 
{
	 @Test
	 public void teststep1Test()
	 {
		String bro = System.getProperty("browser");
		Reporter.log(bro,true);
		 Reporter.log("test case1",true);
	 }
	 
}
