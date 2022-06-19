package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page extends TestBase {

	@FindBy(xpath = "//span[contains(text(),'OR Email/Password Login?')]")
	public static WebElement emailpasslogin;
	
	@FindBy(xpath = "//input[@id='email']")
	public static WebElement uname;

	@FindBy(xpath = "//input[@id='password']")
	public static WebElement pwd;

	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-round login-btn']")
	public static WebElement logbtn;

	public Login_Page() {
		PageFactory.initElements(driver, this);
	}

	public void logincheck(String uname1, String pwd2) {
		emailpasslogin.click();
		uname.sendKeys(uname1);
		pwd.sendKeys(pwd2);
		logbtn.click();
	}
}
