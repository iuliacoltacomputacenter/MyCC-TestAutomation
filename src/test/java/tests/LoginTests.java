/*
 * package tests;
 * 
 * import base.BaseTest; import lombok.extern.slf4j.Slf4j; import
 * org.testng.Reporter; import org.testng.annotations.Parameters; import
 * org.testng.annotations.Test;
 * 
 * import pages.Dashboard; import pages.LoginPage; import pages.SecureAreaPage;
 * 
 * import static org.testng.Assert.assertTrue;
 * 
 * import static utils.Timers.getDurationInMillisFrom; import static
 * utils.Timers.setTimestamp;
 * 
 * @Slf4j public class LoginTests extends BaseTest {
 * 
 * @Test(groups = "end2end")
 * 
 * @Parameters({"email", "password"}) public void testSuccessfulLogin(String
 * email, String password){
 * 
 * //Start timer setTimestamp("testSuccessfulLogin");
 * 
 * // LoginPage loginPage = homePage.clickFormAuthentication();
 * loginPage.setEmail(email); Reporter.log("Enter email: " + email);
 * log.debug("Once before all tests within this class");
 * loginPage.setPassword(password); Reporter.log("Enter password: " + password);
 * Dashboard dashboardPage = loginPage.clickLoginButton(); //
 * dashboardPage.getHeaderText();
 * 
 * assertTrue(dashboardPage.getAlertText()
 * .contains("You logged into a secure area!") , "Alert text is incorrect");
 * 
 * //Report duration Reporter.log("Test duration: " +
 * getDurationInMillisFrom("testSuccessfulLogin") + " ms");
 * 
 * //Log duration
 * log.debug(Long.toString(getDurationInMillisFrom("testSuccessfulLogin")));
 * System.out.println(getDurationInMillisFrom("testSuccessfulLogin")); long
 * maxDuration = 2000L;
 * 
 * assertTrue(maxDuration >= getDurationInMillisFrom("testSuccessfulLogin")); }
 * 
 * @Test(groups = "end2end") public void testSuccessfulLogin1() throws
 * InterruptedException {
 * 
 * loginPage.setEmail("cctestuser12@yopmail.com");
 * loginPage.setPassword("SCCTest@2021"); SecureAreaPage secureAreaPage =
 * loginPage.clickSignInButton(); secureAreaPage.getAlertText();
 * assertTrue(secureAreaPage.getAlertText()
 * .contains("You logged into a secure area!") , "Alert text is incorrect"); }
 * 
 * @Test(groups = "end2end") public void testSuccessfulLogin2() throws
 * InterruptedException { LoginPage loginPage =
 * homePage.clickFormAuthentication();
 * loginPage.setUsername("cctestuser12@yopmail.com");
 * loginPage.setPassword("CCTest@2021"); SecureAreaPage secureAreaPage =
 * loginPage.clickLoginButton(); secureAreaPage.getAlertText();
 * assertTrue(secureAreaPage.getAlertText()
 * .contains("You logged into a secure area!") , "Alert text is incorrect"); } }
 */