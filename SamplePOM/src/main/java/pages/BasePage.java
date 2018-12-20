package pages;

import org.openqa.selenium.support.PageFactory;

import common.BrowserCommands;

public class BasePage extends BrowserCommands{
	public BasePage() {		
	 	BrowserCommands.driver=driver;
		PageFactory.initElements(driver, this);
		}
}
