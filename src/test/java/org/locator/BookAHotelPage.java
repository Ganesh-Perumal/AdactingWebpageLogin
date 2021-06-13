package org.locator;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotelPage extends BaseClass{
	
	public BookAHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "first_name")
	private WebElement txtFirstName;
	
	@FindBy(name="last_name")
	private WebElement txtLastName;
	
	@FindBy(name="address")
	private WebElement txtAddress;
	
	@FindBy(name="cc_num")
	private WebElement txtCreditCardNumber;
	
	@FindBy(name="cc_type")
	private WebElement selectCreditCardType;
	
	@FindBy(name="cc_exp_month")
	private WebElement selectCreditCardExpiryMonth;
	
	@FindBy(name="cc_exp_year")
	private WebElement selectCreditCardExpiryYear;
	
	@FindBy(name="cc_cvv")
	private WebElement txtCVV;
	
	@FindBy(name="book_now")
	private WebElement bookNowbtn;

	public WebElement getBookNowbtn() {
		return bookNowbtn;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCreditCardNumber() {
		return txtCreditCardNumber;
	}

	public WebElement getSelectCreditCardType() {
		return selectCreditCardType;
	}

	public WebElement getSelectCreditCardExpiryMonth() {
		return selectCreditCardExpiryMonth;
	}

	public WebElement getSelectCreditCardExpiryYear() {
		return selectCreditCardExpiryYear;
	}

	public WebElement getTxtCVV() {
		return txtCVV;
	}
	
	

}
