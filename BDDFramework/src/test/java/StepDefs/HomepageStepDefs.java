package StepDefs;

import static org.junit.Assert.assertTrue;

import java.util.List;

//import static org.junit.Assert.assertArrayEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import browserControls.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomepageStepDefs extends BaseClass {
	
	// Private variables (locators)
	private String searchDropdownBox="//select[@id='searchDropdownBox']";
	private String searchTextField="//input[@id='twotabsearchtextbox']";
	private String searchButton="//input[@value='Go']";
	
	@Given("I am on Amazon homepage")
	public void i_am_on_Amazon_homepage() throws InterruptedException {
		browser.get(baseUrl);
	//	Thread.sleep(3000);
	}

	
	@Then("I should see title {string}")
	public void i_should_see_title(String expectedTitle) {
		Assert.assertEquals(expectedTitle, browser.getTitle());
	}
	
	@Then("The page url should be {string}")
	public void the_page_url_should_be(String expectedUrl) {
		Assert.assertEquals(expectedUrl, browser.getCurrentUrl());
	}
	
	 @When("I click on {string} link")
	 public void i_click_on_link(String linkText) throws InterruptedException {
		 browser.findElement(By.linkText(linkText)).click();
	//	 Thread.sleep(3000);
	 }
	 
	 @Then("I should see {int} options available in search dropdown")
	 
	 // Compatibility issues using "Integer"
	 //  public void i_should_see_options_available_in_search_dropdown(Integer optionCount) {
	 
	 public void i_should_see_options_available_in_search_dropdown(int optionCount) {
	     // Write code here that turns the phrase above into concrete actions
		 WebElement dropdown = browser.findElement(By.xpath(searchDropdownBox));
		 List<WebElement> alloptions = dropdown.findElements(By.tagName("option"));
		 Assert.assertEquals(optionCount,  alloptions.size());
	 }
	 
	 @When("I select {string} from search dropdown")
	 public void i_select_from_search_dropdown(String selectOption) throws InterruptedException {
		 browser.findElement(By.xpath(searchDropdownBox)).sendKeys(selectOption);
	//	 Thread.sleep(5000);
	 }
		
	 @Then("I should see {string} option in search dropdown")
	 public void i_should_see_option_in_search_dropdown(String searchOption) {
		 WebElement dropdown = browser.findElement(By.xpath(searchDropdownBox));
		 List<WebElement> allOptions = dropdown.findElements(By.tagName("option"));
		 
		 // System.out.println("Options = " + allOptions.toString());
		 
		 boolean optionPresent = false;
		 
		 for (int i=0; i<allOptions.size(); i=i+1) {
			 System.out.println(allOptions.get(i).getText());
			 if (allOptions.get(i).getText().equals(searchOption)) {
				 optionPresent=true;
				 System.out.println("Option is present");

				 break;
			 } else {
				 optionPresent=false;
			 }
		 }
			
		 Assert.assertTrue(optionPresent);
	 }
	 
	 @When("I type {string} in search field")
	 public void i_type_in_search_field(String searchText) throws InterruptedException {
		 browser.findElement(By.xpath(searchTextField)).sendKeys(searchText);
	//	 Thread.sleep(5000);
	 }

	 @When("I click on search button")
	 public void i_click_on_search_button() throws InterruptedException {
		 browser.findElement(By.xpath(searchButton)).click();
	//	 Thread.sleep(7000);		 
	 }
	 
	 @Given("I wait for search field to be present")
	 public void i_wait_for_search_field_to_be_present() {
		 WebDriverWait wait = new WebDriverWait(browser, 10);
		 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
				 By.xpath(searchTextField)));
	 }
}
