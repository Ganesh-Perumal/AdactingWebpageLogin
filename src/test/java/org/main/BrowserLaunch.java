package org.main;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.locator.BookAHotelPage;
import org.locator.LoginPage;
import org.locator.SearchPage;
import org.locator.SelectHotel;
import org.openqa.selenium.WebElement;

public class BrowserLaunch extends BaseClass {

	public static BaseClass baseClass;

	@BeforeClass
	public static void launchBrow() {
		baseClass = new BaseClass();
		baseClass.LaunchBrowser();

	}

	@Test
	public void tc0() {
		baseClass.LaunchUrl("http://adactinhotelapp.com/");

	}

	public static LoginPage page;

	@Test
	public void tc1() throws IOException {
		page = new LoginPage();
		String fileRead3 = baseClass.FileRead(1, 1);
		WebElement txtPassword2 = page.getTxtPassword();
		baseClass.sendKey(txtPassword2, fileRead3);

		WebElement txtUserName = page.getTxtUserName();
		String fileRead = baseClass.FileRead(0, 1);
		baseClass.sendKey(txtUserName, fileRead);
		WebElement loginBtn = page.getLoginBtn();
		baseClass.btnClick(loginBtn);

	}

	public static SearchPage search;

	@Test
	public void tc2() throws IOException {

		search = new SearchPage();
		WebElement location = search.getLocation();
		String fileRead = baseClass.FileRead(2, 1);
		baseClass.selectDropDown(location, fileRead);
	}

	@Test
	public void tc3() throws IOException {
		WebElement hotels2 = search.getHotels();
		String fileRead = baseClass.FileRead(3, 1);
		baseClass.selectDropDown(hotels2, fileRead);
	}

	@Test
	public void tc4() throws IOException {
		WebElement roomtype2 = search.getRoomtype();
		String fileRead = baseClass.FileRead(4, 1);
		baseClass.selectDropDown(roomtype2, fileRead);
	}

	@Test
	public void tc5() throws IOException {
		WebElement roomnos = search.getRoomnos();
		String fileRead = baseClass.FileRead(5, 1);
		baseClass.selectDropDown(roomnos, fileRead);

	}

	@Test
	public void tc6() throws IOException {
		WebElement checkinDate = search.getCheckinDate();
		String fileRead = baseClass.FileRead(6, 1);
		checkinDate.clear();
		baseClass.sendKey(checkinDate, fileRead);
	}

	@Test
	public void tc7() throws IOException {
		WebElement checkOutDate = search.getCheckOutDate();
		String fileRead = baseClass.FileRead(7, 1);
		checkOutDate.clear();
		// System.out.println(fileRead);
		baseClass.sendKey(checkOutDate, fileRead);
	}

	@Test
	public void tc8() throws IOException {
		WebElement adultsPerRoom = search.getAdultsPerRoom();
		String fileRead = baseClass.FileRead(8, 1);
		baseClass.selectDropDown(adultsPerRoom, fileRead);
	}

	@Test
	public void tc9() throws IOException {
		WebElement childPerRoom = search.getChildPerRoom();
		String fileRead = baseClass.FileRead(9, 1);
		baseClass.selectDropDown(childPerRoom, fileRead);

	}

	@Test
	public void tc10() {
		WebElement searchBtnClick = search.getSearchBtnClick();
		baseClass.btnClick(searchBtnClick);

	}

	public static SelectHotel selectHotel;

	@Test
	public void tc11() {
		selectHotel = new SelectHotel();
		WebElement radioBtn = selectHotel.getRadioBtn();
		baseClass.btnClick(radioBtn);

	}

	@Test
	public void tc12() {
		WebElement continueBtn = selectHotel.getContinueBtn();
		baseClass.btnClick(continueBtn);

	}

	public static BookAHotelPage bookHotel;

	@Test
	public void tc13() throws IOException, InterruptedException {
		Thread.sleep(3000);
		bookHotel = new BookAHotelPage();
		WebElement txtFirstName = bookHotel.getTxtFirstName();
		String fileRead = baseClass.FileRead(10, 1);
		baseClass.sendKey(txtFirstName, fileRead);

	}

	@Test
	public void tc14() throws IOException {
		WebElement txtLastName = bookHotel.getTxtLastName();
		String fileRead = baseClass.FileRead(11, 1);
		baseClass.sendKey(txtLastName, fileRead);

	}

	@Test
	public void tc15() throws IOException {
		WebElement txtAddress = bookHotel.getTxtAddress();
		String fileRead = baseClass.FileRead(12, 1);
		baseClass.sendKey(txtAddress, fileRead);

	}

	@Test
	public void tc16() throws IOException {
		WebElement txtCreditCardNumber = bookHotel.getTxtCreditCardNumber();
		String fileRead = baseClass.FileRead(13, 1);
		baseClass.sendKey(txtCreditCardNumber, fileRead);

	}

	@Test
	public void tc17() throws IOException {
		WebElement selectCreditCardType = bookHotel.getSelectCreditCardType();
		String fileRead = baseClass.FileRead(14, 1);
		baseClass.selectDropDown(selectCreditCardType, fileRead);

	}

	@Test
	public void tc18() throws IOException {
		WebElement selectCreditCardExpiryMonth = bookHotel.getSelectCreditCardExpiryMonth();
		String fileRead = baseClass.FileRead(15, 1);
		baseClass.selectDropDown(selectCreditCardExpiryMonth, fileRead);

	}

	@Test
	public void tc19() throws IOException {
		WebElement selectCreditCardExpiryYear = bookHotel.getSelectCreditCardExpiryYear();
		String fileRead = baseClass.FileRead(16, 1);
		baseClass.selectDropDown(selectCreditCardExpiryYear, fileRead);
	}

	@Test
	public void tc20() throws IOException {
		WebElement txtCVV = bookHotel.getTxtCVV();
		String fileRead = baseClass.FileRead(17, 1);
		baseClass.sendKey(txtCVV, fileRead);
	}
	
	@Test
	public void tc21() {
		WebElement bookNowbtn = bookHotel.getBookNowbtn();
		baseClass.btnClick(bookNowbtn);

	}
}