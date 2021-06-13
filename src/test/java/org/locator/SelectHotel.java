package org.locator;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {
	
	public SelectHotel() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(name="radiobutton_0")
	private WebElement radioBtn;
	
	@FindBy(name = "continue")
	private WebElement continueBtn;

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}
	
	

}
