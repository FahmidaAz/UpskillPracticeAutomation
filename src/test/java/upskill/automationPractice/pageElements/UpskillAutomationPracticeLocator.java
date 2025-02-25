package upskill.automationPractice.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpskillAutomationPracticeLocator {
	//Mouse Hover locator
     @FindBy(xpath="//button[contains(text(),'Hover Over Me!')]")
     public WebElement btnMouseHover;
     
     @FindBy(xpath="//a[contains(text(),'Link 2')]")
     public WebElement link2;
     
     //Drop down locator
     @FindBy(xpath="//select[@aria-label='Default select ']")
     public WebElement dropDownOption;
     
     @FindBy(xpath="//option[contains(text(),'Option 2')]")
     public WebElement selectOption;
     
     //alert button handle
     @FindBy(xpath="//button[contains(text(),'Alert')]")
     public WebElement alertBtn;
     
     //edit textbox
     @FindBy(xpath="//input[@id='alertyourname']")
     public WebElement txtBxEdit;
     
     //radio button 
     @FindBy(xpath="//input[@id='flexRadioDefault2']")
     public WebElement radioBtn2;
     
     //checkbox input check
     @FindBy(xpath="//input[@id='flexCheckCheckedTwo'] ")
     public WebElement checkBox2;
     
     //Switch to another window locators
     @FindBy(xpath="//button[contains(text(),'Open Window')]")
     public WebElement windowBtn;
     
     //Handle propmt alert locator
     @FindBy(xpath="//button[contains(text(),'Confirm')]")
     public WebElement propmtAlertBtn;
}
