package Helper;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FunctionHelper {

    private static WebDriverWait wait;

    public static WebDriverWait waitForElement(WebDriver driver, String Xpath){

        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));
        return wait;
    }

}
