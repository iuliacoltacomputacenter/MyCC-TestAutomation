package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.Dashboard;

public class WorkLogTest extends BaseTest {

	@Test
	
	public void workLog() {
		loginPage.setEmail("cctestuser12@yopmail.com");
		loginPage.setPassword("CCTest@2021");
		
		Dashboard dashboard = loginPage.clickSignInButton() ;
		sleep(5000);
		dashboard.logTimeButton();
		
		dashboard.selectProject("My CC Test Project");
		dashboard.selectTask("Development Back End Test");
		dashboard.selectHours("13");
		dashboard.addComments("This is my comment for test");
		dashboard.saveButtonLog();
		sleep(3000);
		
}

	
	public static void sleep(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
