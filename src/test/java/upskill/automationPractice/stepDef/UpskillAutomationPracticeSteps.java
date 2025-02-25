package upskill.automationPractice.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.automationPractice.pageActions.UpskillAutomationPracticeAction;

public class UpskillAutomationPracticeSteps {
	UpskillAutomationPracticeAction UpskillAutomationPracticeActionObj = new UpskillAutomationPracticeAction();

	// Mouse Hover
	@Given("^Open UpSkill Automation Practice page$")
	public void open_UpSkill_Automation_Practice_page() throws Throwable {

	}

	@When("^Switch to Practice iFrame$")
	public void switch_to_Practice_iFrame() throws Throwable {
		UpskillAutomationPracticeActionObj.switchToIframe();
	}

	@When("^Mouse Hover to Hover Over Me$")
	public void mouse_Hover_to_Hover_Over_Me() throws Throwable {
		UpskillAutomationPracticeActionObj.mouseHoverBtn();
	}

	@Then("^Click on Link$")
	public void click_on_Link() throws Throwable {
		UpskillAutomationPracticeActionObj.clickOnLink();
	}

	// Drop down
	@When("^Select Option from dropdown$")
	public void select_Option_from_dropdown() throws Throwable {
		UpskillAutomationPracticeActionObj.clickDropdown();
	}

	@Then("^Verify Option selected$")
	public void verify_Option_selected() throws Throwable {
		UpskillAutomationPracticeActionObj.verifyOption();
	}

	// Alert
	@When("^Click on Alert$")
	public void click_on_Alert() throws Throwable {
		UpskillAutomationPracticeActionObj.handleAlert();
	}

	@Then("^Click on OK$")
	public void click_on_OK() throws Throwable {
		UpskillAutomationPracticeActionObj.acceptAlert();
	}

	// edit text box and send user name
	@Then("^User should able to write on Textbox$")
	public void user_should_able_to_write_on_Textbox() throws Throwable {
		UpskillAutomationPracticeActionObj.sendName();
	}

	// radio button steps
	@Then("^Click on Radio (\\d+)$")
	public void click_on_Radio(int arg1) throws Throwable {
		UpskillAutomationPracticeActionObj.clickRadioBtn();
	}

	// checkbox input snippets
	@Then("^Click on Checkbox (\\d+)$")
	public void click_on_Checkbox(int arg1) throws Throwable {
		UpskillAutomationPracticeActionObj.clickCheckBx();
	}

	// switch to another window snippets
	@When("^Click on Open Window$")
	public void click_on_Open_Window() throws Throwable {
		UpskillAutomationPracticeActionObj.clickOpenWindowBtn();
	}

	@Then("^Switch to new Window$")
	public void switch_to_new_Window() throws Throwable {
		UpskillAutomationPracticeActionObj.switchToNewWindow();
	}

	// handle prompt alert

	@When("^Click on Confirm$")
	public void click_on_Confirm() throws Throwable {
		UpskillAutomationPracticeActionObj.clickConfirmButton();
	}

	@Then("^Verify Great$")
	public void verify_Great() throws Throwable {
		UpskillAutomationPracticeActionObj.verifyGreat();
	}

}
