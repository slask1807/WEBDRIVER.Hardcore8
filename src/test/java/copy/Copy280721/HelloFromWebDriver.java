package copy.Copy280721;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class HelloFromWebDriver {
    //public ChromeDriver driver;
    WebDriver driver = new ChromeDriver();

    @Test
    public void firstTest() throws InterruptedException {

        driver.manage().timeouts().pageLoadTimeout(1500, TimeUnit.SECONDS);
        driver.get("https://cloud.google.com/products/calculator");
        // driver.get("https://cloud.google.com");
//        Thread.sleep(300);
//        int size = driver.findElements(By.tagName("iframe")).size();
//        System.out.println("Total Frames --" + size);
//        driver.manage().window().maximize();
//        WebElement SearchInput = driver.findElement(By.xpath("//input"));
//        SearchInput.sendKeys("Google Cloud Platform Pricing Calculator");
//        SearchInput.sendKeys(Keys.TAB);
//        SearchInput.sendKeys(Keys.ENTER);
//        waitForElementLocatedBy(driver, By.partialLinkText("Google Cloud Platform Pricing Calculato"));
//        WebElement SearchInput2 = driver.findElement(By.partialLinkText("Google Cloud Platform Pricing Calculator"));
//        SearchInput2.click();
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
        WebElement SearchCalc = driver.findElement(By.xpath("//input[@id=\"input-0\"]"));
        SearchCalc.click();
        SearchCalc.sendKeys("Compute Engine");
        SearchCalc.sendKeys(Keys.TAB);
        Thread.sleep(300);

        WebElement NumberOfInstances = driver.findElement(By.xpath("//*[@ng-model=\"listingCtrl.computeServer.quantity\"]"));
        NumberOfInstances.sendKeys("4");
        Thread.sleep(300);


        WebElement Series = driver.findElement(By.xpath("//*[@value=\"n1\"]"));
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click()", Series);
        Thread.sleep(300);

        WebElement MashinneTypeClickRol = driver.findElement(By.xpath("//*[@value=\"CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8\"]"));
        JavascriptExecutor executor2 = (JavascriptExecutor) driver;
        executor2.executeScript("arguments[0].click()", MashinneTypeClickRol);
        Thread.sleep(300);

        WebElement AddGPUs = driver.findElement(By.xpath("//*[@id=\"mainForm\"]/div[2]/div/md-card/md-card-content/div/div[1]/form/div[8]/div[1]/md-input-container/md-checkbox"));
        AddGPUs.sendKeys(Keys.TAB, Keys.ENTER);
        Thread.sleep(600);

        WebElement NumberOfGPUClick = driver.findElement(By.xpath("//*[@ng-repeat=\"item in listingCtrl.supportedGpuNumbers[listingCtrl.computeServer.gpuType]\" and @value=\"1\" ]"));//select_option_436
        JavascriptExecutor executor88 = (JavascriptExecutor) driver;
        executor88.executeScript("arguments[0].click()", NumberOfGPUClick);
        Thread.sleep(600);

        WebElement GPUtype = driver.findElement(By.xpath("//*[@ng-disabled=\"listingCtrl.checkGpuAvailability(item.value, 'computeServer')\" and@ value=\"NVIDIA_TESLA_V100\"]"));//select_option_443
        JavascriptExecutor executor24 = (JavascriptExecutor) driver;
        executor24.executeScript("arguments[0].click()", GPUtype);
        Thread.sleep(300);

        WebElement GPUtypeClick = driver.findElement(By.xpath("//*[@ng-repeat=\"item in listingCtrl.dynamicSsd.computeServer\" and @value=\"2\"]"));
        JavascriptExecutor executor244 = (JavascriptExecutor) driver;
        executor244.executeScript("arguments[0].click()", GPUtypeClick);
        Thread.sleep(300);

        WebElement localSSD = driver.findElement(By.xpath("//*[@ ng-value=\"item.value\" and @value=\"2\"]"));//*[@ng-repeat="instance in typeInfo" and @ value="CP-COMPUTEENGINE-VMIMAGE-N1-HIGHCPU-64"]   //select_option_414
        JavascriptExecutor executor35 = (JavascriptExecutor) driver;
        executor35.executeScript("arguments[0].click()", localSSD);
        Thread.sleep(300);

        WebElement Datacenterlocation = driver.findElement(By.xpath("//*[@ng-repeat=\"item in listingCtrl.fullRegionList\" and @value=\"europe-west3\"]"));//select_option_217
        JavascriptExecutor executor5 = (JavascriptExecutor) driver;
        executor5.executeScript("arguments[0].click()", Datacenterlocation);
        Thread.sleep(300);

        WebElement CommiteduUsage = driver.findElement(By.xpath("//*[@ng-disabled=\"listingCtrl.soleTenant.nodeType == 'CP-COMPUTEENGINE-VMIMAGE-M2-NODE-416-11776'\"]"));
        JavascriptExecutor executor7 = (JavascriptExecutor) driver;
        executor7.executeScript("arguments[0].click()", CommiteduUsage);

        Thread.sleep(300);
        WebElement AddToEstimate = driver.findElement(By.xpath("//*[@ng-disabled=\"ComputeEngineForm.$invalid || !listingCtrl.machineType['computeServer']\"]"));
        JavascriptExecutor executor9 = (JavascriptExecutor) driver;
        executor9.executeScript("arguments[0].click()", AddToEstimate);
        Thread.sleep(300);

        WebElement EMAILESTIMATE = driver.findElement(By.id("email_quote"));
        JavascriptExecutor executor10 = (JavascriptExecutor) driver;
        executor10.executeScript("arguments[0].click()", EMAILESTIMATE);

        String originalWindow = driver.getWindowHandle();
        final Set<String> oldWindowsSet = driver.getWindowHandles();

        String url = "https://10minutemail.net";
        ((JavascriptExecutor) driver).executeScript("window.open(arguments[0])", url);
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

        driver.switchTo().window(newWindow);
        driver.findElement(By.xpath("//*[@id=\"copy-button\"]")).click();
        driver.switchTo().window(originalWindow);
        Thread.sleep(3000);

        driver.switchTo().frame(0);
        driver.switchTo().frame(0);

        driver.findElement(By.xpath("//*[@ng-model=\"emailQuote.user.email\"]")).sendKeys(Keys.CONTROL + "V");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@aria-label=\"Send Email\"]")).sendKeys(Keys.ENTER);
        driver.switchTo().window(newWindow);
        Thread.sleep(1000);

        WebDriverWait wait = new WebDriverWait(driver, 270000); //throws exception if element is not found within 10 seconds
        wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Google Cloud Sales")));
        WebElement FindMail = driver.findElement(By.linkText("Google Cloud Sales <noreply@google.com>"));
        JavascriptExecutor executor77 = (JavascriptExecutor) driver;
        executor77.executeScript("arguments[0].click()", FindMail);
        Thread.sleep(300);

        driver.navigate().refresh();
        Thread.sleep(300);

        WebElement ClickEmailWithoutAdvertising = driver.findElement(By.linkText("Google Cloud Platform Price Estimate"));
        ClickEmailWithoutAdvertising.click();
        Thread.sleep(300);

        String estimateSum = driver.findElement(By.id("tab1")).getText();
        assertTrue(estimateSum.contains("1,288.71"));
    }

    @After
    public void close() {
        System.out.println("test close");
        driver.quit();
    }

    private static void waitForElementLocatedBy(WebDriver driver, By by) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(by));
    }
}


