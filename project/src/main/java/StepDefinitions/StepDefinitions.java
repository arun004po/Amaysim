package StepDefinitions;

import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import PageObjects.SettingsPage;

public class StepDefinitions{
    public WebDriver driver;
    public SettingsPage page;
    public StepDefinitions()
    {
    	driver = Hooks.driver;
    	
    }
    
    @When("^I provide username as \"(.*?)\" and Password as \"(.*?)\" and login to the application$")
    public void i_provide_username_as_and_Password_as_and_login_to_the_application(String username, String password) throws Throwable {
        // login to the application
    	PageFactory.initElements(driver, SettingsPage.class);
    	page = new SettingsPage(driver);
        page.login(username, password);
    }

    @Then("^I confirm popup$")
    public void i_confirm_popup() throws Throwable {
        // confirm popup
        page.confirmPopUp();
    }

    @Then("^I go to Settings Page$")
    public void i_go_to_Settings_Page() throws Throwable {
        //Settings Page
    	page.settings();
    }

    @Then("^I click edit call forwarding option$")
    public void i_click_edit_call_forwarding_option() throws Throwable {
        page.callForwarding();
    }

    @Then("^I enter \"(.*?)\" as number to forward call to and save$")
    public void i_enter_as_number_to_forward_call_to_and_save(String mobileNumber) throws Throwable {
        page.editcallDivert(mobileNumber);
    }
    
}




