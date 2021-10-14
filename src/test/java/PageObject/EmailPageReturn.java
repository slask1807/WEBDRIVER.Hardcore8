package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmailPageReturn extends EmailPage {
    public EmailPageReturn(WebDriver driver) {
        super(driver);
    }

    By waitReceiveEmail = By.partialLinkText("Google Cloud Sales");
    @FindBy(linkText = "Google Cloud Sales <noreply@google.com>")
    private WebElement findMail;
    By emailWithoutAdvertising = By.partialLinkText("Google Cloud Platform Price Estimate");

    @FindBy(xpath = "//*[@id=\"tab1\"]/div[1]/div/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/h3")
    private WebElement FindCheckElemend;

    public void getWaitReceiveEmail() {
        WebDriverWait wait = new WebDriverWait(driver, 270000);
        wait.until(ExpectedConditions.presenceOfElementLocated(waitReceiveEmail));
    }

    public void clickFindMail() {
        clickJS(findMail);
    }

    public void clickEmailWithoutAdvertising() {
        driver.navigate().refresh();
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailWithoutAdvertising));
        findMail.click();
    }

    public WebElement getFindCheckElemend() {
        return FindCheckElemend;
    }
}


