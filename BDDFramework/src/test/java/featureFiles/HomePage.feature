Feature: Verify home page
  As a user
  I should be able to navigate through the homepage 
  So that I can see what's on offer

Background:
  Given I am on Amazon homepage
  
Scenario: Verify homepage title
  Then I should see title "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more"
  
Scenario: Verify homepage url
  Then The page url should be "https://www.amazon.co.uk/"
 

Scenario: Verify links in the header
  When I click on "Today's Deals" link
  Then I should see title "Amazon UK Deals - Discover Our Daily Deals"


Scenario Outline: Verify links on the header
  When I click on "<linkText>" link
  Then I should see title "<pageTitle>"
  Examples:
    | linkText | pageTitle |
    | Today's Deals | Amazon UK Deals - Discover Our Daily Deals |
    

    
Scenario: Verify the number of options in search dropdown
Then I should see 46 options available in search dropdown
When I select "Clothing" from search dropdown

  
Scenario: Verify the options that are available in search dropdown
  Then I should see "Clothing" option in search dropdown
  And I should see "Books" option in search dropdown
  And I should see "Beauty" option in search dropdown

@Skip
Scenario: Verify search for T-shirts
  When I select "Clothing" from search dropdown
  And I type "T-shirts" in search field
  And I click on search button
  Then I should see the search results for "T-shirts"  


Scenario: Selenium Explicit Wait statement
  Given I wait for search field to be present
  
   
    
    
 
 