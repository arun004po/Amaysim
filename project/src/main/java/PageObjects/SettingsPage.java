package PageObjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SettingsPage extends BaseClass {
	
	public SettingsPage(WebDriver driver)
	{
			super(driver);
	}
	
	
    // Sign on button
	@FindBy(how=How.XPATH, using = "//*[@id='block-useraccountmenu']/ul/li[2]/a/span")
	public static WebElement LoginLink;
	
	@FindBy(how=How.ID, using = "username")
	public static WebElement TxtBoxUserName;
	
	@FindBy(how=How.ID, using = "password")
	public static WebElement TxtBoxPassword;
	
	@FindBy(how=How.NAME, using = "button")
	public static WebElement btnLogin;
	
	@FindBy(how=How.XPATH, using = "//*[@id='welcome_popup']/a")
	public static WebElement ActivateSimPopUp;
		
	@FindBy(how=How.LINK_TEXT, using = "Settings")
	public static WebElement LinkSettings;
	
	@FindBy(how=How.ID, using = "edit_settings_call_forwarding")
	public static WebElement EditCallForwarding;
	
	@FindBy(how=How.XPATH, using = "//*[@id='body-content']/div[15]/div/div/div/div[1]/a")
	public static WebElement ConfirmPopUp;
	
	@FindBy(how=How.ID, using = "my_amaysim2_setting_call_divert_number")
	public static WebElement TxtBoxCallDivert;
	
	@FindBy(how=How.NAME, using = "commit")
	public static WebElement BtnSave;
	
	@FindBy(how=How.XPATH, using = "//*[@id='body-content']/div[15]/a")
	public static WebElement SuccesPopUp;
	
	
// login to the application
 public void login(String username, String Password)
 {   LoginLink.click();
	 TxtBoxUserName.sendKeys(username);
	 TxtBoxPassword.sendKeys(Password);
	 btnLogin.click();
 }
 
 public void confirmPopUp()
 {
	 ActivateSimPopUp.click();
 }
 
 public void settings()
 {
	 LinkSettings.click();
 }
 
 public void callForwarding()
 
 {
	 EditCallForwarding.click();
	 ConfirmPopUp.click();
	 
 }
 
 public void editcallDivert(String mobileNumber)
 {
  TxtBoxCallDivert.sendKeys(mobileNumber);
  BtnSave.click();
  SuccesPopUp.click();
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
	
	
	
	
	
	
	
	

}
