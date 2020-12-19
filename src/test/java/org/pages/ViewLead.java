package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.InconAssessment.BaseClass;

public class ViewLead extends BaseClass{

	public ViewLead() {
		PageFactory.initElements(driver, this);	
		}
	
	@FindBy(xpath="//li[contains(text(),'Lead Saved Successfully')]")
	private WebElement leadText;

	public WebElement getLeadText() {
		return leadText;
	}
	
	
	
}
