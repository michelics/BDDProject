$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SentContact.feature");
formatter.feature({
  "line": 1,
  "name": "Send Contact",
  "description": "",
  "id": "send-contact",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Send Contact to Dbserver Page",
  "description": "",
  "id": "send-contact;send-contact-to-dbserver-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open the Contact Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Fill the fields with valid value",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Page should show Message Sent",
  "keyword": "Then "
});
formatter.match({
  "location": "SmokeTest.Open_the_Contact_Page()"
});
formatter.result({
  "duration": 6569609311,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.Fill_the_fields_with_valid_value()"
});
formatter.result({
  "duration": 393175518,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.Page_should_show_Message_Sent()"
});
formatter.result({
  "duration": 856393412,
  "status": "passed"
});
});