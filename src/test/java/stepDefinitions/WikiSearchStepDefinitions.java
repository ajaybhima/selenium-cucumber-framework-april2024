package stepDefinitions;

import com.careerit.wiki.utils.SeleniumTestUtils;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

import com.careerit.wiki.pages.ContentPage;
import com.careerit.wiki.pages.HomePage;
import com.careerit.wiki.utils.Test_Initializer;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WikiSearchStepDefinitions {
	
	Test_Initializer testInitializer = null;
    WebDriver driver = null;
    HomePage wikiHomePage = null;
    ContentPage wikiContentPage = null;
	
	
	@Given("User launches chrome browser with Wiki application url")
	public void user_launches_chrome_browser_with_wiki_application_url() {
		testInitializer = new Test_Initializer();
        driver = testInitializer.initiateWebDriver();
		SeleniumTestUtils.launchApplication(driver);

	}

	@When("User search for {string} with language as {string} in home page")
	public void user_search_for_with_language_as_in_home_page(String searchKey, String language) {
		wikiHomePage = new HomePage(driver);
		wikiHomePage.enterSearchKey(searchKey);
		wikiHomePage.selectLanguage(language);

	}

	@When("user clicks on Search icon in homepage")
	public void user_clicks_on_search_icon_in_homepage() {
		wikiHomePage.clickOnSearchIcon();
	}

	@Then("Wiki content page has been displayed")
	public void wiki_content_page_has_been_displayed() {
	    wikiContentPage = new ContentPage(driver);
		wikiContentPage.readHeaderText();
	}

	@Then("user validates header text {string} in Content page")
	public void user_validates_header_text_in_content_page(String expectedHeaderText) {
		wikiContentPage.validateHeaderText(expectedHeaderText);

	}

	@Then("user closes the browser")
	public void user_closes_the_browser() {
	   testInitializer.closeDriver(driver);
	}


	@And("user logs header text in Report Log")
	public void userLogsHeaderTextInReportLog() {

	}
}
