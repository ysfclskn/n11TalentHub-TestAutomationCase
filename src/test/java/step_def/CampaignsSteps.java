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

    @Then("I goes to category and write campaign name and links to excel")
    public void iGoesToCategoryAndWriteCampaignNameAndLinksToExcel() throws IOException {
        campaignsPage.writeCategoryNameAndLinks();
    }
}
