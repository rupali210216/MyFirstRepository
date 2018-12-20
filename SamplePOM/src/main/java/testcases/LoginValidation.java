package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;
import common.BrowserCommands;
import pages.GmailLoginPage;


@Listeners({ATUReportsListener.class,ConfigurationListener.class,MethodListener.class})
public class LoginValidation extends BrowserCommands{
	{
		System.setProperty("atu.reporter.config", "./config/atu.properties");
	}
	
	@BeforeClass
	public void prerequisites() {
		
		launchBrowser("chrome");
		launchURL("https://gmail.com");
	}
	
	@Test
	public void testLoginWithValidData() {
		new GmailLoginPage()
		.typeUserID("suganaarohi@gmail.com")
		.clickUidNext()
		.typePassword("123456")
		.clickPwdNext()
		
		;
		
		System.out.println("valid data");
	}
	
	//@Test
	public void testLoginWithInvalidData() {
		new GmailLoginPage()
		.typeUserID("hi@gmail.com")
		.clickUidNext()
		.typePassword("123456")
		.clickPwdNext()
		
		;
		
		System.out.println("Invalid data");
	}
	
}
