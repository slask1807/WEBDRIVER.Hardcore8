package PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculatorPage extends HomePage {
    public CalculatorPage(WebDriver driver) {
        super(driver);
    }

    public void enterToFrame() {
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
    }

    @FindBy(xpath = "//input[@id=\"input-0\"]")
    private WebElement searchCalcClick;

    @FindBy(xpath = "//*[@ng-model=\"listingCtrl.computeServer.quantity\"]")
    private WebElement numberOfInstances;

    @FindBy(xpath = "//*[@value=\"n1\"]")
    private WebElement Series;

    @FindBy(xpath = "//*[@value=\"CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8\"]")
    private WebElement mashinneTypeRol;

    @FindBy(xpath = "//*[@id=\"mainForm\"]/div[2]/div/md-card/md-card-content/div/div[1]/form/div[10]/div[1]/md-input-container/md-checkbox")
    private WebElement AddGPUs;

    @FindBy(xpath = "//*[@ng-repeat=\"item in listingCtrl.supportedGpuNumbers[listingCtrl.computeServer.gpuType]\" and @value=\"1\" ]")
    private WebElement numberOfGPU;

    @FindBy(xpath = "//*[@ng-disabled=\"listingCtrl.checkGpuAvailability(item.value, 'computeServer')\" and@ value=\"NVIDIA_TESLA_V100\"]")
    private WebElement GPUtypeRol;

    @FindBy(xpath = "//*[@ng-repeat=\"item in listingCtrl.dynamicSsd.computeServer\" and @value=\"2\"]")
    private WebElement GPUtype;

    @FindBy(xpath = "//*[@ ng-value=\"item.value\" and @value=\"2\"]")
    private WebElement localSSD;

    @FindBy(xpath = "//*[@ng-repeat=\"item in listingCtrl.fullRegionList | filter:listingCtrl.inputRegionText.computeServer\" and @value=\"europe-west3\"]")
    private WebElement datacenterlocation;

    @FindBy(xpath = "//*[@ng-disabled=\"listingCtrl.soleTenant.nodeType == 'CP-COMPUTEENGINE-VMIMAGE-M2-NODE-416-11776'\"]")
    private WebElement сommiteduUsage;

    @FindBy(xpath = "//*[@ng-disabled=\"ComputeEngineForm.$invalid || !listingCtrl.machineType['computeServer']\"]")
    private WebElement addToEstimate;

    @FindBy(id = "email_quote")
    private WebElement emailEstimate;


    public void fillSearchCalc(String seachCalc) {
        searchCalcClick.sendKeys(seachCalc);
    }

    public void getSearchCalcClick() {
        searchCalcClick.click();
    }

    public void searchCalcLeave() {
        searchCalcClick.sendKeys(Keys.TAB);
    }

    public void fillNumberOfInstances(String number) {
        numberOfInstances.sendKeys(number);
    }

    public void clickSeries() {
        clickJS(Series);
    }

    public void clickMashinneTypeRol() {
        clickJS(mashinneTypeRol);
    }

    public void clickAddGPUs() {
        AddGPUs.sendKeys(Keys.TAB, Keys.ENTER);
    }

    public void clickNumberOfGPU() {
        clickJS(numberOfGPU);
    }

    public void clickGPUtypeRol() {
        clickJS(GPUtypeRol);
    }

    public void clickGPUtype() {
        clickJS(GPUtype);
    }

    public void clicklocalSSD() {
        clickJS(localSSD);
    }

    public void chooseDatacenterlocation() {
        clickJS(datacenterlocation);
    }

    public void chooseCommiteduUsage() {
        clickJS(сommiteduUsage);
    }

    public void clickAddToEstimate() {
        clickJS(addToEstimate);
    }

    public void clickEmailEstimate() {
        clickJS(emailEstimate);
    }

    public void clickJS(WebElement elementBy) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", elementBy);
    }
}
