package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    public static WebDriver driver;
    public WebDriverWait wait;

    public void goTo() {
        driver.get("https://cloud.google.com");
    }

    @FindBy(xpath = "//input")
    private WebElement searchInput;

    @FindBy(partialLinkText = "Google Cloud Platform Pricing Calculator")
    private WebElement searchInputClick;

    @FindBy(xpath = "//*[@value=\"n1\"]")
    private WebElement Series;

    @FindBy(xpath = "//*[@aria-label=\"Send Email\"]")
    private WebElement clickSendReportOnEmail;

    By waitLoadCalculator = By.partialLinkText("Google Cloud Platform Pricing Calculator");

    public void getSearchInputClick() {
        searchInputClick.click();
    }

    public void getSearchInput(String SearchText) {
        searchInput.sendKeys(SearchText);
        searchInput.sendKeys(Keys.TAB);
        searchInput.sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(waitLoadCalculator));
    }

    public void enterToFrame() {
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
    }

    public void getClickSendReportOnEmail() {
        clickSendReportOnEmail.sendKeys(Keys.ENTER);
    }
}
