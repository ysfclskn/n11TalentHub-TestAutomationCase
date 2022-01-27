package step_def;

import pages.CampaignsPage;
import pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class CampaignsSteps {
    HomePage homePage = new HomePage();
    CampaignsPage campaignsPage = new CampaignsPage();
    @When("I open {string} page")
    public void iOpenPage(String page) {
        homePage.openPage(page);

    }

    @Then("I goes to category")
    public void iGoesToCategory() {
        campaignsPage.getTabs();

    }



    @And("I write campaigns data to excel")
    public void iWriteCampaignsDataToExcelFor() throws IOException {
        campaignsPage.writeCategoryNameAndLinks();

    }
}
