package Panels;

import Helper.FunctionHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConversantChatPanel {

    //Locators
    private static final String OPTION_BUTTON = "//div[@id='md-layer-menu']//div[1]//div[1]//div[1]";

    private static final String LOGOUT_BUTTON = "//label[contains(text(),'Logout')]";


    //Elements
    private static WebElement element = null;

    public static WebElement Option (WebDriver driver) {

        element = driver.findElement(By.xpath(OPTION_BUTTON));
        return element;
    }

    public static WebElement Logout (WebDriver driver) {

        element = driver.findElement(By.xpath(LOGOUT_BUTTON));
        return element;
    }

    //Methods
    public void logout (WebDriver driver){

        FunctionHelper.waitForElement(driver, OPTION_BUTTON);
        ConversantChatPanel.Option(driver).click();

        FunctionHelper.waitForElement(driver, LOGOUT_BUTTON);
        ConversantChatPanel.Logout(driver).click();
    }
}
