package com.careerit.wiki.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.careerit.wiki.utils.SeleniumTestUtils;
import com.careerit.wiki.utils.TestNG_Utils;

public class HomePage {
	
	//Web Elements of Page
	
	public final String searchBox="//input[@name='search']";
	public final String langDropdown="//select[@name='language']";
	public final String searchIcon="//button[@class='pure-button pure-button-primary-progressive']";
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void enterSearchKey(String searchKey) {
		SeleniumTestUtils.waitForWebElement(driver, By.xpath(searchBox));
		SeleniumTestUtils.enterTextIntoTexBox(driver, By.xpath(searchBox), searchKey);
		TestNG_Utils.reportLog("Enter Search Key into Searchbox = "+searchKey);
	}
	
	public void selectLanguage(String language) {
		SeleniumTestUtils.waitForWebElement(driver, By.xpath(langDropdown));
		SeleniumTestUtils.selectDropdownByValue(driver, By.xpath(langDropdown),language);
		TestNG_Utils.reportLog("Select Language = "+language);
	}
	
	public void clickOnSearchIcon() {
		SeleniumTestUtils.waitForWebElement(driver, By.xpath(searchIcon));
		SeleniumTestUtils.clickOnElement(driver, By.xpath(searchIcon));
		TestNG_Utils.reportLog("Click on Search Icon");
	}

}
