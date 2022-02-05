$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CampaignList.feature");
formatter.feature({
  "name": "n11 Campaign Feature",
  "description": "",
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
formatter.scenario({
  "name": "Write n11 Campaign to Excel",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@main"
    }
  ]
});
formatter.step({
  "name": "I open \"Kampanyalar\" page",
  "keyword": "When "
});
formatter.match({
  "location": "step_def.CampaignsSteps.iOpenPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I goes to category",
  "keyword": "Then "
});
formatter.match({
  "location": "step_def.CampaignsSteps.iGoesToCategory()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I write campaigns data to excel",
  "keyword": "And "
});
formatter.match({
  "location": "step_def.CampaignsSteps.iWriteCampaignsDataToExcelFor()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});