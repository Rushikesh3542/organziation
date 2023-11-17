package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class orgHomePage {
	 
	@FindBy(xpath="(//a[text()='Organizations'])[1]")
	private WebElement organizationbtn;
	
	
	public WebElement getorgbtn() {
		return organizationbtn;
	}
	@FindBy(xpath ="//img[@title='Create Organization...']")
	private WebElement Imagebtn;


	public WebElement getImagebtn() {
		return Imagebtn;
	}
}
