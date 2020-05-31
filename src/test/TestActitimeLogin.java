package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generics.BaseTest;

public class TestActitimeLogin extends BaseTest
{
	@Test
	public void login()
	{
		Reporter.log("execution of login() has been started", true);
	}
}
