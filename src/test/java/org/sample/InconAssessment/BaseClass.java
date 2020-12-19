package org.sample.InconAssessment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

public static WebDriver driver;
	public static WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		return driver;	
	}
	
	public static void loadUrl(String url) {
		driver.get(url);
	}
	
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public static void insert(WebElement ele ,String value) {
	   ele.sendKeys(value);
	}
	
	public static void btnClick(WebElement ele ) {
		ele.click();
	}
	
	public static String title() {
		return driver.getTitle(); 
	}
	
	public static String currentUrl() {
		return driver.getCurrentUrl();
	}
	
	public static String textFromWebElement(WebElement element) {
		return element.getText();
	}
	public static void quitBrowser() {
		driver.quit();
	}
	
	public static  void selectValueFromDropDown(WebElement ele,String name) {
		Select s=new Select(ele);
		s.selectByVisibleText(name);
	}
	
	public static String  readValueFromExcel(int rowno,int colno) throws IOException {
	String name;
		File f=new File("C:\\Users\\venkatesh\\Documents\\TestData.xlsx");
	FileInputStream str=new FileInputStream(f);
	Workbook book=new XSSFWorkbook(str);
	Sheet s = book.getSheet("Sheet1");
	Row r = s.getRow(rowno);
	Cell c = r.getCell(colno);
	if(c.getCellType()==1) {
		name = c.getStringCellValue();
	}
	else {
	 if(DateUtil.isCellDateFormatted(c)) {
		 Date d = c.getDateCellValue();
		 SimpleDateFormat form=new SimpleDateFormat("mm-dd-yyyy");
		 name = form.format(d);
	 }
	 else {
		name=String.valueOf((long)c.getNumericCellValue());
	 }
	}
	return name;
	}

	public static void javaScriptInsert(WebElement element,String name) {
		JavascriptExecutor jk=(JavascriptExecutor)driver;
		jk.executeScript("arguments[0].setAttribute('value','"+name+"')", element);
	}
	
	public static void javaScriptClick(WebElement ele) {
		JavascriptExecutor jk=(JavascriptExecutor)driver;
		jk.executeScript("arguments[0].click()", ele);
	}
}
