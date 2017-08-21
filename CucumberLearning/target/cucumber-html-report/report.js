$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/sample.feature");
formatter.feature({
  "line": 1,
  "name": "test",
  "description": "",
  "id": "test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "login to application",
  "description": "",
  "id": "test;login-to-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I login to application",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.loginToapplication()"
});
formatter.result({
  "duration": 734099588,
  "status": "passed"
});
});