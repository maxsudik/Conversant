package Panels;

import Helper.FunctionHelper;
import Objects.UserObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetStartedPanel {

    //Locators
    private static final String EMAIL_FIELD = "//input[@type='email']";

    private static final String SEND_VERIFICATION_BUTTON = "//div[@class='fixedHeaderScroller center-both']//div//div//div//div[@class='ripple-box']";

    private static final String FACEBOOK_ICON = "//body/div[@id='content']/div[@id='md-content']/div[@id='md-layer-content']/div[@class='conversantApp']/div[@class='fullscreen']/div[@class='login cv-light-textfield']/div[@class='fixedHeaderScroller center-both']/div/div/div/div/a[1]/*[1]";

    private static final String GOOGLE_ICON = "//body/div[@id='content']/div[@id='md-content']/div[@id='md-layer-content']/div[@class='conversantApp']/div[@class='fullscreen']/div[@class='login cv-light-textfield']/div[@class='fixedHeaderScroller center-both']/div/div/div/div/a[2]/*[1]";


    //Elements
    private static WebElement element = null;

    public static WebElement Email (WebDriver driver) {

        element = driver.findElement(By.xpath(EMAIL_FIELD));
        return element;
    }

    public static WebElement SendVerification (WebDriver driver) {

        element = driver.findElement(By.xpath(SEND_VERIFICATION_BUTTON));
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
    public void verifyFunctionalityGetStartedPanel(WebDriver driver, UserObject user){

        FunctionHelper.waitForElement(driver, EMAIL_FIELD);
        GetStartedPanel.Email(driver).click();
        GetStartedPanel.Email(driver).clear();
        GetStartedPanel.Email(driver).sendKeys(user.email);

        FunctionHelper.waitForElement(driver, SEND_VERIFICATION_BUTTON);
        GetStartedPanel.SendVerification(driver);


    }

    public void verifyFacebookButton(WebDriver driver){

        FunctionHelper.waitForElement(driver, FACEBOOK_ICON);
        GetStartedPanel.Facebook(driver).click();
    }

    public void verifyGoogleButton(WebDriver driver){

        FunctionHelper.waitForElement(driver, GOOGLE_ICON);
        GetStartedPanel.Google(driver).click();
    }
}
