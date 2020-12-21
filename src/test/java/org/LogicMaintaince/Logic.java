package org.LogicMaintaince;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.pages.HomePage;
import org.pages.SearchLead;
import org.pages.SourceSerach;
import org.sample.InconAssessment.BaseClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Logic extends BaseClass {

	@Test
	public void homePage() throws IOException, InterruptedException {
		
		getDriver();
		loadUrl("https://www.liidaveqa.com/");
		maximizeWindow();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage h = new HomePage();
		btnClick(h.getBtnSignin());
		insert(h.getTxtUserName(), readValueFromExcel(1, 0));
		insert(h.getTxtpassword(), readValueFromExcel(1, 1));
		btnClick(h.getSignin());
		//Assert.assertTrue(currentUrl().contains("login"));
		btnClick(h.getSelect());
		String sale = textFromWebElement(h.getSalesTools());
		if (sale.equals(readValueFromExcel(1, 2))) {
			btnClick(h.getSalesTools());
				btnClick(h.getBuildaproposal());	
		}
		Thread.sleep(1000);
		btnClick(h.getSelectlead());
	}

	@Test
	public void search() {
		SearchLead l = new SearchLead();
		btnClick(l.getAddlead());
	}

	@Test
	public void source() throws IOException, InterruptedException {
		SourceSerach p = new SourceSerach();
		insert(p.getFirstname(), readValueFromExcel(1, 4));
		insert(p.getLastname(), readValueFromExcel(1, 5));
		insert(p.getPhonenumber(), readValueFromExcel(1, 6));
		insert(p.getEmail(), readValueFromExcel(1, 7));
		JavascriptExecutor jk=(JavascriptExecutor)driver;
		javaScriptInsert(p.getScheduledDate(), readValueFromExcel(1,8));
		btnClick(p.getAdddocument());
		Thread.sleep(2000);
		selectValueFromDropDown(p.getSelectDocumentType(), readValueFromExcel(1, 9));
		insert(p.getBtnSelect(), readValueFromExcel(1, 10));
		btnClick(p.getAddToLead());
		btnClick(p.getSaveLead());
		System.out.println(p.getTextSave());
	}
}
