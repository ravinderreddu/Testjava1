$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "loginFeature",
  "description": "This feature deals with the login functionality of the applcation",
  "id": "loginfeature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login with correct username and password\u0027",
  "description": "",
  "id": "loginfeature;login-with-correct-username-and-password\u0027",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "navigate to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "enter the username  as admin and password as admin",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "should see the user form page",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginsteps.navigate_to_the_login_page()"
});
formatter.result({
  "duration": 80828500,
  "status": "passed"
});
formatter.match({
  "location": "Loginsteps.enter_the_username_as_admin_and_password_as_admin()"
});
formatter.result({
  "duration": 41100,
  "status": "passed"
});
formatter.match({
  "location": "Loginsteps.click_login_button()"
});
formatter.result({
  "duration": 34901,
  "status": "passed"
});
formatter.match({
  "location": "Loginsteps.should_see_the_user_form_page()"
});
formatter.result({
  "duration": 20500,
  "status": "passed"
});
});