package PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class EmailPage extends HomePage {
    public EmailPage(WebDriver driver) {
        super(driver);
    }

    private String originalWindow;
    private String newWindow;

    @FindBy(id = "copy-button")
    private WebElement copyEmail;

    @FindBy(xpath = "//*[@ng-model=\"emailQuote.user.email\"]")
    private WebElement pasteEmail;

    public void ChangeNewWindow() throws InterruptedException {
        String originalWindow = driver.getWindowHandle();
        this.originalWindow = originalWindow;
        final Set<String> oldWindowsSet = driver.getWindowHandles();
        String url2 = "https://10minutemail.net";
        ((JavascriptExecutor) driver).executeScript("window.open(arguments[0])", url2);
        Thread.sleep(3000);
        String newWindow = (new WebDriverWait(driver, 10))
                .until(new ExpectedCondition<String>() {
                           public String apply(WebDriver driver) {
                               Set<String> newWindowsSet = driver.getWindowHandles();
                               newWindowsSet.removeAll(oldWindowsSet);
                               return newWindowsSet.size() > 0 ?
                                       newWindowsSet.iterator().next() : null;
                           }
                       }
                );
        this.newWindow = newWindow;
    }

    public void setOriginalWindow() {
        driver.switchTo().window(originalWindow);
    }

    public void setNewWindow() {
        driver.switchTo().window(newWindow);
    }

    public void getCopyEmail() {
        copyEmail.click();
    }

    public void clickJS(WebElement elementBy) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", elementBy);
    }

    public void getPasteEmail() {
        pasteEmail.sendKeys(Keys.CONTROL + "V");
    }
}
