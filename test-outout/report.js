$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/Features/SetUp.feature");
formatter.feature({
  "line": 1,
  "name": "Create a New campaign on Phrasee",
  "description": "In order to create a new campaign\nAs a valid user\nI should be able to login to app",
  "id": "create-a-new-campaign-on-phrasee",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "I login with valid credentials",
  "description": "",
  "id": "create-a-new-campaign-on-phrasee;i-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "user navigates to url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "title of login page is Login | Phrasee",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters username \"\u003cusername\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enters password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user clicks create a new campaign link",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user selects email tab",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user selects external automation project from dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user enters campaign name",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user enters subject line",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user enters audience size",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user enters avg open rate",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user clicks next button",
  "keyword": "Then "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "create-a-new-campaign-on-phrasee;i-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 22,
      "id": "create-a-new-campaign-on-phrasee;i-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "ravishankarste@gmail.com",
        "Ravishankar123#"
      ],
      "line": 23,
      "id": "create-a-new-campaign-on-phrasee;i-login-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 23,
  "name": "I login with valid credentials",
  "description": "",
  "id": "create-a-new-campaign-on-phrasee;i-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "user navigates to url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "title of login page is Login | Phrasee",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters username \"ravishankarste@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enters password \"Ravishankar123#\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user clicks create a new campaign link",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user selects email tab",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user selects external automation project from dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user enters campaign name",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user enters subject line",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user enters audience size",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user enters avg open rate",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user clicks next button",
  "keyword": "Then "
});
formatter.match({
  "location": "SetUp.user_navigates_to_url()"
});
formatter.result({
  "duration": 9790469875,
  "status": "passed"
});
formatter.match({
  "location": "SetUp.user_should_navigate_to_login_page()"
});
formatter.result({
  "duration": 4005792,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ravishankarste@gmail.com",
      "offset": 22
    }
  ],
  "location": "SetUp.user_enters_username(String)"
});
formatter.result({
  "duration": 1242481833,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ravishankar123#",
      "offset": 22
    }
  ],
  "location": "SetUp.user_enters_password(String)"
});
formatter.result({
  "duration": 187256042,
  "status": "passed"
});
formatter.match({
  "location": "SetUp.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 3641171750,
  "status": "passed"
});
formatter.match({
  "location": "SetUp.user_clicks_create_new_campaign_link()"
});
formatter.result({
  "duration": 354095291,
  "status": "passed"
});
formatter.match({
  "location": "SetUp.user_selects_email_tab()"
});
formatter.result({
  "duration": 171706167,
  "status": "passed"
});
formatter.match({
  "location": "SetUp.user_selects_external_automation_project_from_dropdown()"
});
formatter.result({
  "duration": 409276125,
  "status": "passed"
});
formatter.match({
  "location": "SetUp.user_enters_campaign_name()"
});
formatter.result({
  "duration": 989267250,
  "status": "passed"
});
formatter.match({
  "location": "SetUp.user_enters_subject_line()"
});
formatter.result({
  "duration": 506082625,
  "status": "passed"
});
formatter.match({
  "location": "SetUp.user_enters_audience_size()"
});
formatter.result({
  "duration": 362088000,
  "status": "passed"
});
formatter.match({
  "location": "SetUp.user_enters_avg_open_rate()"
});
formatter.result({
  "duration": 761193834,
  "status": "passed"
});
formatter.match({
  "location": "SetUp.user_clicks_next_button()"
});
formatter.result({
  "duration": 223561709,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Language Generation",
  "description": "",
  "id": "create-a-new-campaign-on-phrasee;language-generation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "user navigates to Language Generation tab",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user selects date to send email",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user selects campaign type",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "user clicks on Magic button",
  "keyword": "And "
});
formatter.match({
  "location": "SetUp.user_navigates_to_language_gen_tab()"
});
formatter.result({
  "duration": 94700167,
  "status": "passed"
});
formatter.match({
  "location": "SetUp.user_selects_data_to_send_email()"
});
formatter.result({
  "duration": 1543623792,
  "status": "passed"
});
formatter.match({
  "location": "SetUp.user_selects_campaign_type()"
});
formatter.result({
  "duration": 383783958,
  "status": "passed"
});
formatter.match({
  "location": "SetUp.user_clicks_on_magic_button()"
});
formatter.result({
  "duration": 133260667,
  "status": "passed"
});
});