package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.InconAssessment.BaseClass;

public class HomePage extends BaseClass{

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Sign In']")
	private WebElement btnSignin;

	@FindBy(xpath = "//input[@id='j_username']")
	private WebElement txtUserName;

	@FindBy(xpath = "//input[@id='j_password']")
	private WebElement txtpassword;
	

	@FindBy(xpath = "//button[text()='Sign In']")
	private WebElement signin;

	@FindBy(xpath = "//i[@class='far fa-bars v2-hamburger-menu']")
	private WebElement select;

	@FindBy(xpath = "//a[text()='Sales Tools']")
	private WebElement salesTools;

	@FindBy(xpath = "//a[text()='Build a Proposal']")
	private WebElement buildaproposal;


	public WebElement getSelect() {
		return select;
	}


	public WebElement getSalesTools() {
		return salesTools;
	}


	public WebElement getBuildaproposal() {
		return buildaproposal;
	}


	public WebElement getBtnSignin() {
		return btnSignin;
	}


	public WebElement getTxtUserName() {
		return txtUserName;
	}


	public WebElement getTxtpassword() {
		return txtpassword;
	}


	public WebElement getSignin() {
		return signin;
	}
	

	@FindBy(xpath = "//a[text()='SELECT LEAD']")
	private WebElement selectlead;


	public WebElement getSelectlead() {
		return selectlead;
	}
	

}
