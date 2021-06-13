package org.locator;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BaseClass{
	
	public SearchPage() {
	PageFactory.initElements(driver, this);
	}

	@FindBy(name="location")
	private WebElement location;
	
	@FindBy(name="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getCheckinDate() {
		return checkinDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultsPerRoom() {
		return AdultsPerRoom;
	}

	public WebElement getChildPerRoom() {
		return childPerRoom;
	}

	public WebElement getSearchBtnClick() {
		return searchBtnClick;
	}

	@FindBy(id="room_nos")
	private WebElement roomnos;
	
	@FindBy(id="datepick_in")
	private WebElement checkinDate;
	
	@FindBy(id="datepick_out")
	private WebElement checkOutDate;
	
	@FindBy(id="adult_room")
	private WebElement AdultsPerRoom;
	
	@FindBy(id="child_room")
	private WebElement childPerRoom;
	
	@FindBy(id="Submit")
	private WebElement searchBtnClick;
}
