package Panels;

import Helper.FunctionHelper;
import Objects.UserObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SupportPanel {

    //Locators
    private static final String YOUR_NAME_FIELD = "//input[@id='cv-name']";

    private static final String EMAIL_ADDRESS_FIELD = "//input[@id='cv-emailPhone']";

    private static final String CONNECT_BUTTON = "//input[@id='cv-emailPhone']";

    //Elements
    private static WebElement element = null;

    public static WebElement YourName (WebDriver driver) {

        element = driver.findElement(By.xpath(YOUR_NAME_FIELD));
        return element;
    }

    public static WebElement EmailAddress(WebDriver driver) {

        element = driver.findElement(By.xpath(EMAIL_ADDRESS_FIELD));
        return element;
    }

    public static WebElement Connect(WebDriver driver) {

        element = driver.findElement(By.xpath(CONNECT_BUTTON));
        return element;
    }

    //Methods

    public void verifySupportObjects(WebDriver driver, UserObject user){

        FunctionHelper.waitForElement(driver, YOUR_NAME_FIELD);
        SupportPanel.YourName(driver).click();
        SupportPanel.YourName(driver).clear();
        SupportPanel.YourName(driver).sendKeys(user.name);

        FunctionHelper.waitForElement(driver, EMAIL_ADDRESS_FIELD);
        SupportPanel.EmailAddress(driver).click();
        SupportPanel.EmailAddress(driver).clear();
        SupportPanel.EmailAddress(driver).sendKeys(user.email);

        FunctionHelper.waitForElement(driver, CONNECT_BUTTON);
        SupportPanel.Connect(driver).click();
    }

}

