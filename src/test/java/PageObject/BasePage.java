package PageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class BasePage {
    public static WebDriver driver;
    public WebDriverWait wait;
    private String originalWindow;
    private String newWindow;

    public static void goTo() {
        driver.get("https://cloud.google.com");
    }

    @FindBy(xpath = "//input")
    private WebElement searchInput;

    @FindBy(partialLinkText = "Google Cloud Platform Pricing Calculator")
    private WebElement searchInputClick;

    @FindBy(xpath = "//input[@id=\"input-0\"]")
    private WebElement searchCalcClick;

    @FindBy(xpath = "//*[@ng-model=\"listingCtrl.computeServer.quantity\"]")
    private WebElement numberOfInstances;

    @FindBy(xpath = "//*[@value=\"n1\"]")
    private WebElement Series;

    @FindBy(xpath = "//*[@id=\"tab1\"]/div[1]/div/table/tbody/tr[2]/td/table/tbody/tr[1]/td[4]")
    private WebElement FindCheckElemend;

    @FindBy(xpath = "//*[@value=\"CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8\"]")
    private WebElement mashinneTypeRol;

    @FindBy(xpath = "//*[@id=\"mainForm\"]/div[2]/div/md-card/md-card-content/div/div[1]/form/div[8]/div[1]/md-input-container/md-checkbox")
    private WebElement AddGPUs;

    @FindBy(xpath = "//*[@ng-repeat=\"item in listingCtrl.supportedGpuNumbers[listingCtrl.computeServer.gpuType]\" and @value=\"1\" ]")
    private WebElement numberOfGPU;

    @FindBy(xpath = "//*[@ng-disabled=\"listingCtrl.checkGpuAvailability(item.value, 'computeServer')\" and@ value=\"NVIDIA_TESLA_V100\"]")
    private WebElement GPUtypeRol;

    @FindBy(xpath = "//*[@ng-repeat=\"item in listingCtrl.dynamicSsd.computeServer\" and @value=\"2\"]")
    private WebElement GPUtype;

    @FindBy(xpath = "//*[@ ng-value=\"item.value\" and @value=\"2\"]")
    private WebElement localSSD;

    @FindBy(xpath = "//*[@ng-repeat=\"item in listingCtrl.fullRegionList\" and @value=\"europe-west3\"]")
    private WebElement datacenterlocation;

    @FindBy(xpath = "//*[@ng-disabled=\"listingCtrl.soleTenant.nodeType == 'CP-COMPUTEENGINE-VMIMAGE-M2-NODE-416-11776'\"]")
    private WebElement сommiteduUsage;

    @FindBy(xpath = "//*[@ng-disabled=\"ComputeEngineForm.$invalid || !listingCtrl.machineType['computeServer']\"]")
    private WebElement addToEstimate;

    @FindBy(id = "email_quote")
    private WebElement emailEstimate;

    @FindBy(id = "copy-button")
    private WebElement copyEmail;

    @FindBy(xpath = "//*[@ng-model=\"emailQuote.user.email\"]")
    private WebElement pasteEmail;

    @FindBy(xpath = "//*[@aria-label=\"Send Email\"]")
    private WebElement clickSendReportOnEmail;

    @FindBy(linkText = "Google Cloud Sales <noreply@google.com>")
    private WebElement findMail;

    By waitReceiveEmail = By.partialLinkText("Google Cloud Sales");
    By emailWithoutAdvertising = By.partialLinkText("Google Cloud Platform Price Estimate");
    By waitLoadCalculator = By.partialLinkText("Google Cloud Platform Pricing Calculator");


    public void getSearchInput(String SearchText) {
        searchInput.sendKeys(SearchText);
        searchInput.sendKeys(Keys.TAB);
        searchInput.sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(waitLoadCalculator));
    }

    public void getSearchInputClick() {
        searchInputClick.click();
    }

    public void fillNumberOfInstances(String number) {
        numberOfInstances.sendKeys(number);
    }

    public void fillSearchCalc(String seachCalc) {
        searchCalcClick.sendKeys(seachCalc);
    }

    public void getSearchCalcClick() {
        searchCalcClick.click();
    }

    public void searchCalcLeave() {
        searchCalcClick.sendKeys(Keys.TAB);
    }

    public void getJavascriptExecutor(WebElement elementBy) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", elementBy);
    }

    public void click(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    public void clickSeries() {
        getJavascriptExecutor(Series);
    }

    public void clickMashinneTypeRol() {
        getJavascriptExecutor(mashinneTypeRol);
    }

    public void clickAddGPUs() {
        AddGPUs.sendKeys(Keys.TAB, Keys.ENTER);
    }

    public void clickNumberOfGPU() {
        getJavascriptExecutor(numberOfGPU);
    }

    public void clickGPUtypeRol() {
        getJavascriptExecutor(GPUtypeRol);
    }

    public void clickGPUtype() {
        getJavascriptExecutor(GPUtype);
    }

    public void clicklocalSSD() {
        getJavascriptExecutor(localSSD);
    }

    public void chooseDatacenterlocation() {
        getJavascriptExecutor(datacenterlocation);
    }

    public void chooseCommiteduUsage() {
        getJavascriptExecutor(сommiteduUsage);
    }

    public void clickAddToEstimate() {
        getJavascriptExecutor(addToEstimate);
    }

    public void clickEmailEstimate() {
        getJavascriptExecutor(emailEstimate);
    }

    public WebElement getFindCheckElemend() {
        return FindCheckElemend;
    }

    public void enterToFrame() {
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
    }

    public void getCopyEmail() {
        copyEmail.click();
    }

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    public void getWaitReceiveEmail() {
        WebDriverWait wait = new WebDriverWait(driver, 270000);
        wait.until(ExpectedConditions.presenceOfElementLocated(waitReceiveEmail));
    }


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

    public void getPasteEmail() {
        pasteEmail.sendKeys(Keys.CONTROL + "V");
    }

    public void getClickSendReportOnEmail() {
        clickSendReportOnEmail.sendKeys(Keys.ENTER);
    }

    public void clickFindMail() {
        getJavascriptExecutor(findMail);
    }

    public void clickEmailWithoutAdvertising() {
        driver.navigate().refresh();
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailWithoutAdvertising));
        findMail.click();
    }
}


