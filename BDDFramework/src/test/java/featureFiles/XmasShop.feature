Feature: Verify Christmas Shop page
  As a user
  I should be able to navigate through the Christmas Shop page 
  So that I can see what's on offer

Background:
  Given I am on Amazon Christmas Shop page
  
@DoThis
Scenario: Verify Christmas Shop title
  Then I should see banner "The Christmas Shop"
  
    
Scenario: Verify Christmas Shop url
  Then The page url should be "https://www.amazon.co.uk/gcx/-/gfhz/ref=nav_dk_cs_christmas_18?categoryId=adult-neutral&isPrime=false&priceFrom&priceTo&scrollState=eyJpdGVtSW5kZXgiOjAsInNjcm9sbE9mZnNldCI6NTc5LjQzMzM0OTYwOTM3NX0%3D&showBubbles=true"
 

Scenario: Verify links below the banner
  When I click on "Advent Calendars" link
  Then I should see banner "Advent Calendars"

  