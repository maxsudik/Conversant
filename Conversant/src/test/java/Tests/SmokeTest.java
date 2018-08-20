package Tests;

import Objects.UserObject;
import Panels.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SmokeTest {

    private WebDriver driver;

    @BeforeMethod

    public void beforeTest() {

        System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver");

        driver = new ChromeDriver();

        driver.get("https://www.conversant.im/");
    }

    @AfterMethod

    public void afterTest() {
        driver.quit();

    }

    @Test

    public void TC1() {

        HomePanel homePanel = new HomePanel();

        homePanel.verifyFunctionalityOfObjects(driver);
    }

    @Test
    public void TC2() {

        HomePanel homePanel = new HomePanel();
        SupportPanel supportPanel = new SupportPanel();
        UserObject user = new UserObject().withName(UserObject.User_Name).withEmail(UserObject.User_Email);

        homePanel.verifySupportButton(driver);
        supportPanel.verifySupportObjects(driver, user);
    }

    @Test
    public void TC3() {

        HomePanel homePanel = new HomePanel();
        LoginPanel loginPanel = new LoginPanel();
        ConversantChatPanel conversantChatPanel = new ConversantChatPanel();
        UserObject user = new UserObject().withEmail(UserObject.User_Email).withPassword(UserObject.User_Password);


        homePanel.verifyGetStartedButton(driver);
        loginPanel.verifyLogin(driver, user);
        conversantChatPanel.logout(driver);
    }

    @Test
    public void TC4() {

        HomePanel homePanel = new HomePanel();
        LoginPanel loginPanel = new LoginPanel();
        ConversantChatPanel conversantChatPanel = new ConversantChatPanel();
        UserObject user = new UserObject().withEmail(UserObject.User_Email).withPassword(UserObject.User_Password);


        homePanel.verifyGetStartedButton2(driver);
        loginPanel.verifyLogin(driver, user);
        conversantChatPanel.logout(driver);
    }

    @Test
    public void TC5() {

        HomePanel homePanel = new HomePanel();
        LoginPanel loginPanel = new LoginPanel();
        ConversantChatPanel conversantChatPanel = new ConversantChatPanel();
        UserObject user = new UserObject().withEmail(UserObject.User_Email).withPassword(UserObject.User_Password);

        homePanel.verifyLoginButton(driver);
        loginPanel.verifyLogin(driver, user);
        conversantChatPanel.logout(driver);
    }

    @Test
    public void TC6() {

        HomePanel homePanel = new HomePanel();

        homePanel.verifyChatNowButton(driver);
    }

    @Test
    public void TC7() {

        HomePanel homePanel = new HomePanel();

        homePanel.verifyChatNowIcon(driver);
    }

    @Test
    public void TC8() {

        HomePanel homePanel = new HomePanel();
        LoginPanel loginPanel = new LoginPanel();
        RecoverPasswordPanel recoverPasswordPanel = new RecoverPasswordPanel();
        UserObject user = new UserObject().withEmail(UserObject.User_Email).withPassword(UserObject.User_Password);

        homePanel.verifyLoginButton(driver);
        loginPanel.verifyRecoverPassword(driver);
        recoverPasswordPanel.verifyRecoverPanelFunctionality(driver, user);
    }

    @Test
    public void TC9() {

        HomePanel homePanel = new HomePanel();
        LoginPanel loginPanel = new LoginPanel();

        homePanel.verifyLoginButton(driver);
        loginPanel.verifyFacebookButton(driver);
    }

    @Test
    public void TC10() {

        HomePanel homePanel = new HomePanel();
        LoginPanel loginPanel = new LoginPanel();

        homePanel.verifyLoginButton(driver);
        loginPanel.verifyGoogleButton(driver);
    }

    @Test
    public void TC11() {

        HomePanel homePanel = new HomePanel();
        LoginPanel loginPanel = new LoginPanel();
        GetStartedPanel getStartedPanel = new GetStartedPanel();

        homePanel.verifyLoginButton(driver);
        loginPanel.verifyGetStartedButton(driver);
        getStartedPanel.verifyFacebookButton(driver);
    }

    @Test
    public void TC12() {

        HomePanel homePanel = new HomePanel();
        LoginPanel loginPanel = new LoginPanel();
        GetStartedPanel getStartedPanel = new GetStartedPanel();

        homePanel.verifyLoginButton(driver);
        loginPanel.verifyGetStartedButton(driver);
        getStartedPanel.verifyGoogleButton(driver);
    }

    @Test
    public void TC13() {

        HomePanel homePanel = new HomePanel();
        LoginPanel loginPanel = new LoginPanel();
        GetStartedPanel getStartedPanel = new GetStartedPanel();
        UserObject user = new UserObject().withEmail(UserObject.User_Email);

        homePanel.verifyLoginButton(driver);
        loginPanel.verifyGetStartedButton(driver);
        getStartedPanel.verifyFunctionalityGetStartedPanel(driver, user);
    }

    @Test
    public void TC14() {

        HomePanel homePanel = new HomePanel();
        AboutPanel aboutPanel = new AboutPanel();

        homePanel.verifyAboutButton(driver);
        aboutPanel.verifyChatButton(driver);
    }

    @Test
    public void TC15() {

        HomePanel homePanel = new HomePanel();
        AboutPanel aboutPanel = new AboutPanel();

        homePanel.verifyAboutButton(driver);
        aboutPanel.verifyChatIcon(driver);
    }

    @Test
    public void TC16() {

        HomePanel homePanel = new HomePanel();
        AboutPanel aboutPanel = new AboutPanel();
        LoginPanel loginPanel = new LoginPanel();
        ConversantChatPanel conversantChatPanel = new ConversantChatPanel();
        UserObject user = new UserObject().withEmail(UserObject.User_Email).withPassword(UserObject.User_Password);

        homePanel.verifyAboutButton(driver);
        aboutPanel.verifyGetStartedButton(driver);
        loginPanel.verifyLogin(driver, user);
        conversantChatPanel.logout(driver);
    }

    @Test
    public void TC17() {

        HomePanel homePanel = new HomePanel();
        PricingPanel pricingPanel = new PricingPanel();

        homePanel.verifyPricingButton(driver);
        pricingPanel.verifyChatButton(driver);
    }

    @Test
    public void TC18() {

        HomePanel homePanel = new HomePanel();
        PricingPanel pricingPanel = new PricingPanel();

        homePanel.verifyPricingButton(driver);
        pricingPanel.verifyChatIcon(driver);
    }

    @Test
    public void TC19() {

        HomePanel homePanel = new HomePanel();
        PricingPanel pricingPanel = new PricingPanel();
        LoginPanel loginPanel = new LoginPanel();
        ConversantChatPanel conversantChatPanel = new ConversantChatPanel();
        UserObject user = new UserObject().withEmail(UserObject.User_Email).withPassword(UserObject.User_Password);

        homePanel.verifyPricingButton(driver);
        pricingPanel.verifyGetStarted(driver);
        loginPanel.verifyLogin(driver, user);
        conversantChatPanel.logout(driver);
    }

    @Test
    public void TC20() {

        HomePanel homePanel = new HomePanel();
        ServicesPanel servicesPanel = new ServicesPanel();

        homePanel.verifyServicesButton(driver);
        servicesPanel.verifyChatButton(driver);
    }

    @Test
    public void TC21() {

        HomePanel homePanel = new HomePanel();
        ServicesPanel servicesPanel = new ServicesPanel();

        homePanel.verifyPricingButton(driver);
        servicesPanel.verifyChatIcon(driver);
    }

    @Test
    public void TC22() {

        HomePanel homePanel = new HomePanel();
        ServicesPanel servicesPanel = new ServicesPanel();
        LoginPanel loginPanel = new LoginPanel();
        ConversantChatPanel conversantChatPanel = new ConversantChatPanel();

        UserObject user = new UserObject().withEmail(UserObject.User_Email).withPassword(UserObject.User_Password);

        homePanel.verifyPricingButton(driver);
        servicesPanel.verifyGetStartedButton(driver);
        loginPanel.verifyLogin(driver, user);
        conversantChatPanel.logout(driver);
    }
}