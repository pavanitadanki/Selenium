$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Hooks.feature");
formatter.feature({
  "line": 2,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.before({
  "duration": 10478720783,
  "status": "passed"
});
formatter.before({
  "duration": 56460,
  "status": "passed"
});
formatter.before({
  "duration": 49959,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I want to write a step with precondition",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I complete action",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I validate the outcomes",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksSteps.i_want_to_write_a_step_with_precondition()"
});
formatter.result({
  "duration": 174947013,
  "status": "passed"
});
formatter.match({
  "location": "HooksSteps.i_complete_action()"
});
formatter.result({
  "duration": 394501814,
  "status": "passed"
});
formatter.match({
  "location": "HooksSteps.i_validate_the_outcomes()"
});
formatter.result({
  "duration": 2568608074,
  "status": "passed"
});
formatter.after({
  "duration": 60909,
  "status": "passed"
});
formatter.after({
  "duration": 32850,
  "status": "passed"
});
formatter.after({
  "duration": 671650729,
  "status": "passed"
});
});