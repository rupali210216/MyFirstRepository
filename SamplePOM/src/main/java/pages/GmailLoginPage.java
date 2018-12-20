package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.BrowserCommands;

public class GmailLoginPage extends BasePage {

	@FindBy(id = "identifierId")
	WebElement userid;

	@FindBy(xpath = "//*[text()='Next']")
	WebElement uidnext;

	@FindBy(id = "//*[@name='password']")
	WebElement pwd;

	@FindBy(xpath = "//*[@id=\\\"passwordNext\\\"]/content/span")
	WebElement pwdnext;

	@FindBy(id = "//*[contains(@aria-label,'Google Account')]")
	WebElement signin;

	public GmailLoginPage typeUserID(String uid) {
		type(userid, uid);
		return this;
	}
	
	

	public GmailLoginPage typePassword(String pswd) {
		type(pwd, pswd);
		return this;
	}

	/*
	 * public GmailDashboard click() { click(signin); return new GmailDashboard(); }
	 */

	public GmailLoginPage clickUidNext() {
		click(uidnext);
		return this;
	}

	public GmailDashboard clickPwdNext() {
		click(pwdnext);
		return new GmailDashboard();
	}
}
