package pageObjectModel;

import org.testng.annotations.Test;

public class runCreateLead extends projectSpecificMethods {
	@Test
	public void runcreatelead()
	{
new loginpage().enterusername().enterpassword().clickLoginButton().clickCrmsfa().clickLeads().clickCreateLead().entercompanyName().enterfirstName().enterlastName().clickSubmitButton().verifyViewLead();
}
}
