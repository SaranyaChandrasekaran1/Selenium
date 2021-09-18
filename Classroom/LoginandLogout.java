package pageObjectModel;

import org.testng.annotations.Test;

public class LoginandLogout extends projectSpecificMethods{
	@Test

	public void login() {
		new loginpage().enterusername().enterpassword().clickLoginButton().clickCrmsfa(). clickLeads().clickCreateLead().enterfirstName().enterlastName().entercompanyName().enterPhoneCountryCode().clickSubmitButton().verifyViewLead();
		}

}
