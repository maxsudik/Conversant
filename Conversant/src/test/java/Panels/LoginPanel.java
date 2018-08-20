package Panels;

import Helper.FunctionHelper;
import Objects.UserObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPanel {

    private static final String EMAIL_FIELD = "//input[@type='email']";

    private static final String PASSWORD_FIELD = "//input[@type='password']";

    private static final String RECOVER_PASSWORD_BUTTON = "//a[contains(text(),'Recover password')]";

    private static final String GET_STARTED_BUTTON = "//a[contains(text(),'Get Started')]";

    private static final String LOGIN_BUTTON = "//div[@class='fixedHeaderScroller center-both']//div//div//div[@class='ripple-box']";

    private static final String FACEBOOK_ICON = "//body/div[@id='content']/div[@id='md-content']/div[@id='md-layer-content']/div[@class='conversantApp']/div[@class='fullscreen']/div[@class='login cv-light-textfield']/div[@class='fixedHeaderScroller center-both']/div/div/a[1]/*[1]";

    private static final String GOOGLE_ICON = "//body/div[@id='content']/div[@id='md-content']/div[@id='md-layer-content']/div[@class='conversantApp']/div[@class='fullscreen']/div[@class='login cv-light-textfield']/div[@class='fixedHeaderScroller center-both']/div/div/a[2]/*[1]";


    //Elements
    private static WebElement element = null;

    public static WebElement Email (WebDriver driver) {

        element = driver.findElement(By.xpath(EMAIL_FIELD));
        return element;
    }

    public static WebElement Password (WebDriver driver) {

        element = driver.findElement(By.xpath(PASSWORD_FIELD));
        return element;
    }

    public static WebElement RecoverPassword (WebDriver driver) {

        element = driver.findElement(By.xpath(RECOVER_PASSWORD_BUTTON));
        return element;
    }

    public static WebElement GetStarted (WebDriver driver) {

        element = driver.findElement(By.xpath(GET_STARTED_BUTTON));
        return element;
    }

    public static WebElement Login (WebDriver driver) {

        element = driver.findElement(By.xpath(LOGIN_BUTTON));
        return element;
    }

    public static WebElement Facebook (WebDriver driver) {

        element = driver.findElement(By.xpath(FACEBOOK_ICON));
        return element;
    }

    public static WebElement Google (WebDriver driver) {

        element = driver.findElement(By.xpath(GOOGLE_ICON));
        return element;
    }


    //Methods
    public void verifyLogin(WebDriver driver, UserObject user){

        FunctionHelper.waitForElement(driver, EMAIL_FIELD);
        LoginPanel.Email(driver).click();
        LoginPanel.Email(driver).clear();
        LoginPanel.Email(driver).sendKeys(user.email);

        FunctionHelper.waitForElement(driver, PASSWORD_FIELD);
        LoginPanel.Password(driver).click();
        LoginPanel.Password(driver).clear();
        LoginPanel.Password(driver).sendKeys(user.password);

        FunctionHelper.waitForElement(driver, LOGIN_BUTTON);
        LoginPanel.Login(driver).click();
    }

    public void verifyRecoverPassword(WebDriver driver){

        FunctionHelper.waitForElement(driver, RECOVER_PASSWORD_BUTTON);
        LoginPanel.RecoverPassword(driver).click();

    }

    public void verifyFacebookButton(WebDriver driver){

        FunctionHelper.waitForElement(driver, FACEBOOK_ICON);
        LoginPanel.Facebook(driver).click();
    }

    public void verifyGoogleButton(WebDriver driver){

        FunctionHelper.waitForElement(driver, GOOGLE_ICON);
        LoginPanel.Google(driver).click();
    }

    public void verifyGetStartedButton(WebDriver driver){

        FunctionHelper.waitForElement(driver, GET_STARTED_BUTTON);
        LoginPanel.GetStarted(driver).click();

    }




}
