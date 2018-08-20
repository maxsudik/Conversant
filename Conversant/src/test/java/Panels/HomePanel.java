package Panels;

import Helper.FunctionHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePanel {

    //Locators
    private static final String CONVERSANT_ICON = "//img[@class='logo']";

    private static final String HOME_BUTTON = "/html[1]/body[1]/header[1]/div[1]/div[3]/ul[1]/li[1]/a[1]";

    private static final String ABOUT_BUTTON = "/html[1]/body[1]/header[1]/div[1]/div[3]/ul[1]/li[3]/a[1]";

    private static final String PRICING_BUTTON = "/html[1]/body[1]/header[1]/div[1]/div[3]/ul[1]/li[5]/a[1]";

    private static final String SERVICES_BUTTON = "/html[1]/body[1]/header[1]/div[1]/div[3]/ul[1]/li[7]/a[1]";

    private static final String SUPPORT_BUTTON = "/html[1]/body[1]/header[1]/div[1]/div[3]/ul[1]/li[9]/a[1]";

    private static final String BLOG_BUTTON = "/html[1]/body[1]/header[1]/div[1]/div[3]/ul[1]/li[11]/a[1]";

    private static final String LOGIN_BUTTON = "/html[1]/body[1]/header[1]/div[1]/div[3]/ul[1]/li[13]/a[1]";

    private static final String GET_STARTED_BUTTON = "/html[1]/body[1]/div[3]/div[2]/div[1]/h4[1]/a[1]";

    private static final String CHAT_NOW_FLOAT_BUTTON = "//span[@class='cv-callout']";

    private static final String CHAT_NOW_FLOAT_ICON = "//img[@src='https://storage.conversant.im/images/connect/ChatNow.svg']";

    private static final String GET_STARTED_BUTTON2 = "/html[1]/body[1]/div[3]/div[2]/div[6]/h4[1]/a[1]";


    //Elements
    private static WebElement element = null;

    public static WebElement ConversantIcon (WebDriver driver) {

        element = driver.findElement(By.xpath(CONVERSANT_ICON));
        return element;
    }

    public static WebElement Home (WebDriver driver) {

        element = driver.findElement(By.xpath(HOME_BUTTON));
        return element;
    }

    public static WebElement About (WebDriver driver) {

        element = driver.findElement(By.xpath(ABOUT_BUTTON));
        return element;
    }

    public static WebElement Pricing (WebDriver driver) {

        element = driver.findElement(By.xpath(PRICING_BUTTON));
        return element;
    }

    public static WebElement Services (WebDriver driver) {

        element = driver.findElement(By.xpath(SERVICES_BUTTON));
        return element;
    }

    public static WebElement Support (WebDriver driver) {

        element = driver.findElement(By.xpath(SUPPORT_BUTTON));
        return element;
    }

    public static WebElement Blog (WebDriver driver) {

        element = driver.findElement(By.xpath(BLOG_BUTTON));
        return element;
    }

    public static WebElement Login (WebDriver driver) {

        element = driver.findElement(By.xpath(LOGIN_BUTTON));
        return element;
    }

    public static WebElement GetStarted (WebDriver driver) {

        element = driver.findElement(By.xpath(GET_STARTED_BUTTON));
        return element;
    }

    public static WebElement ChatNowButton (WebDriver driver) {

        element = driver.findElement(By.xpath(CHAT_NOW_FLOAT_BUTTON));
        return element;
    }

    public static WebElement ChatNowIcon (WebDriver driver) {

        element = driver.findElement(By.xpath(CHAT_NOW_FLOAT_ICON));
        return element;
    }

    public static WebElement GetStarted2 (WebDriver driver) {

        element = driver.findElement(By.xpath(GET_STARTED_BUTTON2));
        return element;
    }


    //Methods
    public void verifyFunctionalityOfObjects(WebDriver driver){

        FunctionHelper.waitForElement(driver, CONVERSANT_ICON);

        HomePanel.ConversantIcon(driver).click();

        FunctionHelper.waitForElement(driver, HOME_BUTTON);

        HomePanel.Home(driver).click();

        FunctionHelper.waitForElement(driver, ABOUT_BUTTON);

        HomePanel.About(driver).click();

        FunctionHelper.waitForElement(driver, PRICING_BUTTON);

        HomePanel.Pricing(driver).click();

        FunctionHelper.waitForElement(driver, SERVICES_BUTTON);

        HomePanel.Services(driver).click();

        FunctionHelper.waitForElement(driver, LOGIN_BUTTON);

        HomePanel.Login(driver).click();

    }

    public void verifySupportButton(WebDriver driver){

        FunctionHelper.waitForElement(driver, SUPPORT_BUTTON);

        HomePanel.Support(driver).click();
    }

    public void verifyGetStartedButton(WebDriver driver){

        FunctionHelper.waitForElement(driver, GET_STARTED_BUTTON);

        HomePanel.GetStarted(driver).click();
    }

    public void verifyGetStartedButton2(WebDriver driver){

        FunctionHelper.waitForElement(driver, GET_STARTED_BUTTON2);

        HomePanel.GetStarted2(driver).click();
    }

    public void verifyChatNowButton(WebDriver driver){

        FunctionHelper.waitForElement(driver, CHAT_NOW_FLOAT_BUTTON);

        HomePanel.ChatNowButton(driver).click();
    }

    public void verifyChatNowIcon(WebDriver driver){

        FunctionHelper.waitForElement(driver, CHAT_NOW_FLOAT_ICON);

        HomePanel.ChatNowIcon(driver).click();
    }

    public void verifyLoginButton(WebDriver driver){

        FunctionHelper.waitForElement(driver, LOGIN_BUTTON);
        HomePanel.Login(driver).click();
    }

    public void verifyAboutButton(WebDriver driver){

        FunctionHelper.waitForElement(driver, ABOUT_BUTTON);
        HomePanel.About(driver).click();
    }

    public void verifyPricingButton(WebDriver driver){

        FunctionHelper.waitForElement(driver, PRICING_BUTTON);
        HomePanel.Pricing(driver).click();
    }

    public void verifyServicesButton(WebDriver driver){

        FunctionHelper.waitForElement(driver, SERVICES_BUTTON);
        HomePanel.Services(driver).click();
    }





}



