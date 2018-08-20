package Panels;

import Helper.FunctionHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutPanel {

    //Locators
    private static final String CHAT_NOW_FLOAT_BUTTON = "//span[@class='cv-callout']";

    private static final String CHAT_NOW_FLOAT_ICON = "//img[@src='https://storage.conversant.im/images/connect/ChatNow.svg']";

    private static final String GET_STARTED_BUTTON2 = "/html[1]/body[1]/div[3]/div[2]/div[1]/h4[1]/a[1]";


    //Elements
    private static WebElement element = null;

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
    public void verifyGetStartedButton (WebDriver driver){

        FunctionHelper.waitForElement(driver, GET_STARTED_BUTTON2);
        AboutPanel.GetStarted2(driver).click();
    }

    public void verifyChatButton (WebDriver driver){

        FunctionHelper.waitForElement(driver, CHAT_NOW_FLOAT_BUTTON);
        AboutPanel.ChatNowButton(driver).click();
    }

    public void verifyChatIcon (WebDriver driver){

        FunctionHelper.waitForElement(driver, CHAT_NOW_FLOAT_ICON);
        AboutPanel.ChatNowIcon(driver).click();
    }
}
