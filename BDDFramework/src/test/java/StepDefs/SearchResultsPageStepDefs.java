package StepDefs;

import org.junit.Assert;
import org.openqa.selenium.By;

import browserControls.BaseClass;
import cucumber.api.java.en.Then;
//import junit.framework.Assert;

public class SearchResultsPageStepDefs extends BaseClass {
	
	// Private variables (Locators)
	private String searchResultTextField = "//a[@id='bcKwText']";
	
	@Then("I should see the search results for {string}")
	public void i_should_see_the_search_results_for(String searchText) {
		String text = browser.findElement(By.xpath(searchResultTextField)).getText();
		Assert.assertTrue(text.contains(searchText));
	}

}
