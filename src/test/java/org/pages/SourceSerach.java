package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.InconAssessment.BaseClass;

public class SourceSerach extends BaseClass {

	public SourceSerach() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='firstName']")
	private WebElement Firstname;

	@FindBy(xpath = "//input[@id='lastName']")
	private WebElement lastname;

	@FindBy(xpath = "//input[@id='phNo']")
	private WebElement phonenumber;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;

	@FindBy(xpath = "//p[text()='Add Document']")
	private WebElement adddocument;
	
	public WebElement getSelectDocumentType() {
		return selectDocumentType;
	}

	@FindBy(xpath = "(//select[@class='styled-select documents'])[2]")
	private WebElement selectDocumentType;

	@FindBy(xpath = "//input[@id='multipleFileSelect-1']")
	private WebElement btnSelect;

	@FindBy(xpath = "//span[text()='SAVE LEAD']")
	private WebElement saveLead;

	@FindBy(name = "schedulingRequestDate")
	private WebElement scheduledDate;

	public WebElement getScheduledDate() {
		return scheduledDate;
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getPhonenumber() {
		return phonenumber;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getAdddocument() {
		return adddocument;
	}

	public WebElement getBtnSelect() {
		return btnSelect;
	}

	public WebElement getSaveLead() {
		return saveLead;
	}

	@FindBy(xpath="//span[text()='Add To Lead']")
	private WebElement addToLead;

	
	
	@FindBy(xpath="//li[contains(text(),'Lead Saved Successfully')]")
	private WebElement textSave;

	public WebElement getAddToLead() {
		return addToLead;
	}

	public WebElement getTextSave() {
		return textSave;
	}
	
	
}
