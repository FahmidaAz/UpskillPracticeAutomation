package upskill.automationPractice.pageActions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import upskill.automationPractice.pageElements.UpskillAutomationPracticeLocator;
import upskill.utilities.SetupDrivers;

public class UpskillAutomationPracticeAction {
	UpskillAutomationPracticeLocator UpskillAutomationPracticeLocatorObj;

	public UpskillAutomationPracticeAction() {
		UpskillAutomationPracticeLocatorObj = new UpskillAutomationPracticeLocator();
		PageFactory.initElements(SetupDrivers.driver, UpskillAutomationPracticeLocatorObj);
	}

	public void switchToIframe() throws InterruptedException {
		Thread.sleep(3000);
		SetupDrivers.driver.switchTo().frame("htmlComp-iframe");
		Thread.sleep(3000);
	}

	public void mouseHoverBtn() throws InterruptedException {
		Actions action = new Actions(SetupDrivers.driver);
		action.moveToElement(UpskillAutomationPracticeLocatorObj.btnMouseHover);
		Thread.sleep(3000);
		action.perform();
	}

	public void clickOnLink() throws InterruptedException {
		Thread.sleep(3000);
		UpskillAutomationPracticeLocatorObj.link2.click();
	}

	// Select from dropdown
	public void clickDropdown() throws InterruptedException {
		Thread.sleep(3000);
		Select dropDown = new Select(UpskillAutomationPracticeLocatorObj.dropDownOption);
		dropDown.selectByVisibleText("Option 2");
		Thread.sleep(3000);
	}

	public void verifyOption() {
		UpskillAutomationPracticeLocatorObj.selectOption.isDisplayed();

	}

	// switch to alert and click ok
	public void handleAlert() throws InterruptedException {
		Thread.sleep(3000);
		UpskillAutomationPracticeLocatorObj.alertBtn.click();
		Thread.sleep(3000);
	}

	public void acceptAlert() throws InterruptedException {
		
		SetupDrivers.driver.switchTo().alert().accept();

	}
	//send user name as key
	public void sendName() throws InterruptedException{
		UpskillAutomationPracticeLocatorObj.txtBxEdit.sendKeys("Fahmida");
		Thread.sleep(3000);
	}
	//click on radio button
	public void clickRadioBtn() throws InterruptedException{
		UpskillAutomationPracticeLocatorObj.radioBtn2.click();
		Thread.sleep(3000);
	}
	//click on checkbox
	public void clickCheckBx() throws InterruptedException{
		UpskillAutomationPracticeLocatorObj.checkBox2.click();
		Thread.sleep(3000);
	}
	//switch to different window
	public void clickOpenWindowBtn() throws InterruptedException{
		UpskillAutomationPracticeLocatorObj.windowBtn.click();
		Thread.sleep(3000);
	}
	public void switchToNewWindow(){
		SetupDrivers.driver.switchTo().window("popup").getWindowHandle();
	}
	
	// handle confirm alert 
	public void clickConfirmButton(){
		UpskillAutomationPracticeLocatorObj.propmtAlertBtn.click();
	}
	public void verifyGreat() throws InterruptedException{
		SetupDrivers.driver.switchTo().alert().accept();
		Thread.sleep(2000);
		Alert alert = SetupDrivers.driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		Assert.assertTrue(alert.getText().equals("Great!"));
			
	}

}
