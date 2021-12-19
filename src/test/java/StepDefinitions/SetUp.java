package StepDefinitions;

import TestBase.BaseClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SetUp extends BaseClass {
    @Given("^user navigates to url$")
    // Navigate to 'https://app-qa.phrasee.co'
    public void user_navigates_to_url()  {
        initialization();
    }

    @When("^title of login page is Login | Phrasee$")
    // Verify user is on login page
    public void user_should_navigate_to_login_page() {
        Assert.assertEquals(HomePage.getPageTitle(),"Login | Phrasee", "The Expected page title does not match the actual. ");
    }

    @Then("^user enters username \"([^\"]*)\"$")
    public void user_enters_username(String username) {
        HomePage.enterUserName(username);
    }

    @And("^user enters password \"([^\"]*)\"$")
    public void user_enters_password(String password) {
        HomePage.enterPassword(password);
    }

    @And("^user clicks on login button$")
    public void user_clicks_on_login_button() throws InterruptedException {
        HomePage.clickOnLoginButton();
        scriptWait(3000);
    }

    @Then("^user clicks create a new campaign link$")
    public void user_clicks_create_new_campaign_link() {
        HomePage.clickOnCampaignLink();
        // Verify user is on Campaign Creation page
        Assert.assertEquals(HomePage.getPageTitle(),"Campaign Creation | Phrasee", "The Expected page title does not match the actual. ");
    }

    @Then("^user selects email tab$")
    public void user_selects_email_tab() {
        HomePage.clickOnEmailTab();
    }

    @Then("^user selects external automation project from dropdown$")
    public void user_selects_external_automation_project_from_dropdown() {
        HomePage.clickOptionFromDropdown("External automation project");
    }

    @Then("^user enters subject line$")
    public void user_enters_subject_line() {
        HomePage.enterTextToSubjectLineField();
    }

    @Then("^user enters campaign name")
    public void user_enters_campaign_name() {
        HomePage.clickOnCampaignLink();
        HomePage.enterTextToCampaignNameField();
    }

    @Then("^user enters audience size")
    public void user_enters_audience_size() {
        HomePage.enterTextToAudienceSizeField();
    }

    @Then("^user enters avg open rate")
    public void user_enters_avg_open_rate() { HomePage.enterTextToAvgOpenRateField(); }

    @Then("^user clicks next button")
    public void user_clicks_next_button() {
        HomePage.clickOnNextBtn();
    }

    @When("^user navigates to Language Generation tab")
    public void user_navigates_to_language_gen_tab() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement ele = driver.findElement(By.xpath("//li[contains(text(), 'Generation')]"));
        wait.until(ExpectedConditions.elementToBeClickable(ele));
        String actualText = ele.getText();
        Assert.assertEquals(actualText,"Language Generation", "The Expected side-nav tab title does not match the actual. ");
    }

    @Then("^user selects date to send email")
    public void user_selects_data_to_send_email() { HomePage.selectEmailDate(); }

    @Then("^user selects campaign type")
    public void user_selects_campaign_type() {
        HomePage.clickOptionFromDropdown("Discount");
        HomePage.discount.sendKeys("10");
    }

    @And("^user clicks on Magic button")
    public void user_clicks_on_magic_button() {
        HomePage.clickOnmagicBtn();
    }
}
