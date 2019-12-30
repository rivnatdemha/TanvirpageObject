$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/LoginTest.feature");
formatter.feature({
  "name": "Login test for flight booking",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User can log in correct credential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@flightbooking_Login"
    }
  ]
});
formatter.step({
  "name": "User navigate to flightbooking site",
  "keyword": "When "
});
formatter.match({
  "location": "LoginTest.user_navigate_to_flightbooking_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter correct user name",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.user_enter_correct_user_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter correct password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.user_enter_correct_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
});