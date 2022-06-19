package base;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Viewprofile_Page extends TestBase {

	@FindBy(xpath = "//p[contains(text(),'View Profile')]")
	public static WebElement viewprofile;
	@FindBy(xpath = "//input[@id='User_Name']")
	public static WebElement username;
	@FindBy(xpath = "//input[@id='Email_ID']")
	public static WebElement emailid;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary save-btn']")
	public static WebElement lgbtn;

	@FindBy(xpath = "(//button[@class='ant-btn ant-btn-primary fs-12 h-30p mt-20p'])[2]")
	public static WebElement chngpwd;
	@FindBy(xpath = "//input[@id='newPassword']")
	public static WebElement newpwd;
	@FindBy(xpath = "//input[@id='confirmPassword']")
	public static WebElement confirmpwd;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-round uppercase fs-11']")
	public static WebElement updbtn;

	public Viewprofile_Page() {
		PageFactory.initElements(driver, this);
	}

	public void profileupdate() {
		viewprofile.click();
		username.sendKeys(Keys.BACK_SPACE);
		username.sendKeys("h");
		emailid.sendKeys(Keys.BACK_SPACE);
		emailid.sendKeys("m");
		lgbtn.click();
	}

	public void passwordchange() {
		chngpwd.click();
		newpwd.sendKeys("Gopinath@123");
		confirmpwd.sendKeys("Gopinath@123");
		updbtn.click();
	}

}
