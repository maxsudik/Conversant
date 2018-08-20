package Panels;

import Helper.FunctionHelper;
import Objects.UserObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RecoverPasswordPanel {

    private static final String EMAIL_FIELD = "//input[@type='email']";

    private static final String RECOVER_BUTTON = "//button[@class='accent-bg']";


    //Elements
    private static WebElement element = null;

    public static WebElement Email (WebDriver driver) {

        element = driver.findElement(By.xpath(EMAIL_FIELD));
        return element;
    }

    public static WebElement Recover (WebDriver driver) {

        element = driver.findElement(By.xpath(RECOVER_BUTTON));
        return element;
    }

    //Methods

    public void verifyRecoverPanelFunctionality(WebDriver driver, UserObject user){

        FunctionHelper.waitForElement(driver, EMAIL_FIELD);
        RecoverPasswordPanel.Email(driver).click();
        RecoverPasswordPanel.Email(driver).clear();
        RecoverPasswordPanel.Email(driver).sendKeys(user.email);

        FunctionHelper.waitForElement(driver, RECOVER_BUTTON);
        RecoverPasswordPanel.Recover(driver).click();
    }
}
