$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("EliasNogueiraChallenges.feature");
formatter.feature({
  "line": 1,
  "name": "Elias Nogueira Challenges",
  "description": "",
  "id": "elias-nogueira-challenges",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Auto Fill Fields",
  "description": "",
  "id": "elias-nogueira-challenges;auto-fill-fields",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open the Challenge Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Fill the fields with valid value",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Clean the Page",
  "keyword": "Then "
});
formatter.match({
  "location": "SmokeTest.Open_the_Contact_Page()"
});
formatter.result({
  "duration": 6472601373,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.Fill_the_fields_with_valid_value()"
});
formatter.result({
  "duration": 381537758,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.Page_should_show_Message_Sent()"
});
formatter.result({
  "duration": 21504203506,
  "status": "passed"
});
});