package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.InconAssessment.BaseClass;

public class SearchLead extends BaseClass{

	public SearchLead() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='btn btn-primary hide-mobile introjs-l-9 introjs-l-83']")
	private WebElement addlead;

	public WebElement getAddlead() {
		return addlead;
	}
	
	
}
