package StepDefs;

import browserControls.BaseClass;  //Why?

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class XmasShopStepDefs extends BaseClass {
	
	public static String XmasShopUrl = "https://www.amazon.co.uk/gcx/-/gfhz/ref=nav_dk_cs_christmas_18?categoryId=adult-neutral&isPrime=false&priceFrom&priceTo&scrollState=eyJpdGVtSW5kZXgiOjAsInNjcm9sbE9mZnNldCI6NTc5LjQzMzM0OTYwOTM3NX0%3D&showBubbles=true";  

	@Given("I am on Amazon Christmas Shop page")
	public void i_am_on_Amazon_Christmas_Shop_page() throws InterruptedException {
		browser.get(XmasShopUrl);
		Thread.sleep(3000);
	}
	
	@Then("I should see banner {string}")
	public void i_should_see_banner(String TheXmasShopBanner) throws InterruptedException {
		System.out.println("Should see Xmas banner");
		Thread.sleep(3000);
	}
	
}
