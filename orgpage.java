package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class orgpage {
	@FindBy(name="accountname")
	private WebElement accounttf;
		
	public WebElement getNametf() {
		return accounttf;
	}
     
	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement Organizationname;

	public WebElement getOrganizationname() {
		return Organizationname;
	}

	@FindBy(xpath = "(//input[@name='assigntype'])[2]")
	private WebElement assignedtotf;

	public WebElement getAssignedtotf() {
		return assignedtotf;
	}
	
	@FindBy(name= "assigned_group_id")
	private WebElement assignedtobtn;

	public WebElement getAssignedtobtn() {
		return assignedtobtn;
	}
	@FindBy(xpath ="(//input[@name='button'])[1]")
	private WebElement savebtn;

	public WebElement getSavebtn() {
		return savebtn;
	}
	@FindBy(xpath="(//td[@class='small'])[2]")
	private WebElement imagebtn;

	public WebElement getImagebtn() {
		return imagebtn;
	}
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutbtn;

	public WebElement getSignoutbtn() {
		return signoutbtn;
	}
	
	@FindBy(xpath ="(//img[@src='themes/softed/images/select.gif'])[1]")
	private WebElement orgplusbtn;
	

	public WebElement getContactplusbtn() {
		return orgplusbtn;
	}
	@FindBy(xpath ="//input[@class='txtBox']")
	private WebElement searchbtn;

	public WebElement getSearchbtn() {
		return searchbtn;
	}
	@FindBy(name="search")
	private WebElement searchingbtn;

	public WebElement getSearchingbtn() {
		return searchingbtn;
	}
	@FindBy(xpath ="//a[text()='roogger']")
	private WebElement orgtext;

	public WebElement getContacttext() {
		return orgtext;
	}
}
