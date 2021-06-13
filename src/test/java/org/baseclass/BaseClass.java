package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public void LaunchBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}

	public void LaunchUrl(String URL) {
		driver.get(URL);
	}

	public WebElement FindElementByID(String id) {
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;

	}

	public WebElement findElementByXpath(String Xpath) {
		WebElement findElement = driver.findElement(By.xpath(Xpath));
		return findElement;

	}

	public void sendKey(WebElement webelement, String Value) {
		webelement.sendKeys(Value);
	}

	public void btnClick(WebElement webelement) {
		webelement.click();

	}

	public String FileRead(int row, int cell) throws IOException {
		File file = new File(
				"E:\\Selenium-Java\\Programs Exection code\\AdactingWebpageLogin\\Excel\\AdactInHotelBookingDetails.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		org.apache.poi.ss.usermodel.Sheet sheet2 = workbook.getSheet("Sheet1");
		Row row2 = sheet2.getRow(row);
		Cell cell2 = row2.getCell(cell);
		int cellType = cell2.getCellType();
		String value = "";
		if (cellType == 1) {
			value = cell2.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(cell2)) {
			Date dateCellValue = cell2.getDateCellValue();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			value = dateFormat.format(dateCellValue);
		} else {
			double numericCellValue = cell2.getNumericCellValue();
			long l = (long) numericCellValue;
			value = String.valueOf(l);
		}
		return value;

	}

	

	public void selectDropDown(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	

}
