$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/sample.feature");
formatter.feature({
  "line": 1,
  "name": "test",
  "description": "",
  "id": "test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 23666805911,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "login to application",
  "description": "",
  "id": "test;login-to-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I register with below info in the application",
  "rows": [
    {
      "cells": [
        "FirstName",
        "Email",
        "Website",
        "Experience",
        "Expertise",
        "Education",
        "Comments"
      ],
      "line": 6
    },
    {
      "cells": [
        "Abhi",
        "abigmail@gmail.com",
        "www.globalsqa.com",
        "5-7",
        "Automation Testing;Functional Testing",
        "Graduate",
        "HI How Are you"
      ],
      "line": 7
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I Select \"ARG\" value from the drop down",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.registerUser(UserDetails\u003e)"
});
formatter.result({
  "duration": 27079586148,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ARG",
      "offset": 10
    }
  ],
  "location": "DropDownPageSteps.selectCountry(String)"
});
formatter.result({
  "duration": 7169548367,
  "status": "passed"
});
formatter.after({
  "duration": 37462,
  "status": "passed"
});
});