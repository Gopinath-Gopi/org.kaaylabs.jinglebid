package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import base.Viewprofile_Page;

public class Viewprofile_Test extends TestBase {

	public static Viewprofile_Page Ppage;

	@BeforeMethod
	public void before() throws IOException {
		Ppage = new Viewprofile_Page();
	}

	@Test(priority=0)
	public void ProfileUpdate() {
		Ppage.profileupdate();
	}

	@Test(priority=1,enabled=false)
	public void PassChange() {
		Ppage.passwordchange();
	}

}
