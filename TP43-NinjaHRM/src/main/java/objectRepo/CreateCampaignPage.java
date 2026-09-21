package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignPage {

    //Declaration
    @FindBy(xpath = "//input[@name='campaignname']")
    private WebElement CampaignNameTextField;

    @FindBy (id="//input[@id='jscal_field_closingdate']")
    private WebElement ExpectedClosingDateTextField;

    @FindBy (xpath = "//input[@class='crmbutton small save']")
    private WebElement SaveButton;

    //initialization
    public CreateCampaignPage (WebDriver driver) {

        PageFactory.initElements(driver,this);
    }
    public WebElement getCampaignNameTextField() {
		return CampaignNameTextField;
	}
    public WebElement getExpectedClosingDateTextField() {
		return ExpectedClosingDateTextField;
	}
    public WebElement getSaveButton() {
		return SaveButton;
	}
	public void createCampaignWithMandatoryFields(String CAMPAIGNNAME) {
		CampaignNameTextField.sendKeys(CAMPAIGNNAME);
	}
	public WebElement getCreateCampaignButton() {
		// TODO Auto-generated method stub
		return null;
	}
	public WebElement getCampaignNameTextBox() {
		// TODO Auto-generated method stub
		return null;
	}
	public WebElement getAssignToRadioButton() {
		// TODO Auto-generated method stub
		return null;
	}
	public WebElement getClosingEndDate() {
		// TODO Auto-generated method stub
		return null;
	}
	public WebElement getSaveButtonTop() {
		// TODO Auto-generated method stub
		return null;
	}
 }
