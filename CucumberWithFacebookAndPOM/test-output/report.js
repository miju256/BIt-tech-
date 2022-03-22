$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/mdgulamkibria/Desktop/bit tech/CucumberWithFacebookAndPOM/loginfacebook.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook login feature",
  "description": "",
  "id": "facebook-login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Log into facebook with correct credintial",
  "description": "",
  "id": "facebook-login-feature;log-into-facebook-with-correct-credintial",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user opens browser",
  "rows": [
    {
      "cells": [
        "chrome",
        "firefox"
      ],
      "line": 6
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "when user already in facebook page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user provides his \u003c\"email\"\u003e id",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user gives his \u003c\"password\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on log in button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user already in facebook userpage",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "facebook-login-feature;log-into-facebook-with-correct-credintial;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 14,
      "id": "facebook-login-feature;log-into-facebook-with-correct-credintial;;1"
    },
    {
      "cells": [
        "something@gmail.com",
        "miju124"
      ],
      "line": 15,
      "id": "facebook-login-feature;log-into-facebook-with-correct-credintial;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Log into facebook with correct credintial",
  "description": "",
  "id": "facebook-login-feature;log-into-facebook-with-correct-credintial;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user opens browser",
  "rows": [
    {
      "cells": [
        "chrome",
        "firefox"
      ],
      "line": 6
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "when user already in facebook page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user provides his \u003c\"email\"\u003e id",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user gives his \u003c\"password\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on log in button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user already in facebook userpage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_opens_browser(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.when_user_already_in_facebook_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "email",
      "offset": 20
    }
  ],
  "location": "StepDefinition.user_provides_his_email_id(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 17
    }
  ],
  "location": "StepDefinition.user_gives_his_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_log_in_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_already_in_facebook_homepage()"
});
formatter.result({
  "status": "skipped"
});
});