package com.careerit.wiki.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.careerit.wiki.utils.SeleniumTestUtils;
import com.careerit.wiki.utils.TestNG_Utils;
import org.testng.Assert;

public class ContentPage {
	
	public final String headerText="//h1[@id='firstHeading']";
	
	public WebDriver driver;
	
	public ContentPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String readHeaderText() {
		SeleniumTestUtils.waitForWebElement(driver, By.xpath(headerText));
		String headerTextValue= SeleniumTestUtils.readText(driver, By.xpath(headerText));
		TestNG_Utils.reportLog("Header Text = "+ headerTextValue);
		return headerTextValue;
	}

	public void validateHeaderText(String expectedHeaderText){
		SeleniumTestUtils.waitForWebElement(driver, By.xpath(headerText));
		String headerTextValue= SeleniumTestUtils.readText(driver, By.xpath(headerText));
		Assert.assertEquals(headerTextValue,expectedHeaderText,"Header Text validation failed");
	}

}
