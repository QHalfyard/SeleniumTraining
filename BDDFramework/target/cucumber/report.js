$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featureFiles/XmasShop.feature");
formatter.feature({
  "name": "Verify Christmas Shop page",
  "description": "  As a user\n  I should be able to navigate through the Christmas Shop page \n  So that I can see what\u0027s on offer",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on Amazon Christmas Shop page",
  "keyword": "Given "
});
formatter.match({
  "location": "XmasShopStepDefs.i_am_on_Amazon_Christmas_Shop_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Christmas Shop title",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@DoThis"
    }
  ]
});
formatter.step({
  "name": "I should see banner \"The Christmas Shop\"",
  "keyword": "Then "
});
formatter.match({
  "location": "XmasShopStepDefs.i_should_see_banner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});