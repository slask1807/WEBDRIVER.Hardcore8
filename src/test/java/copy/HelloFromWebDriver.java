package copy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class HelloFromWebDriver {
    //public ChromeDriver driver;

    @Test
    public void firstTest() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("D:\\webdriver2\\extension.crx"));
        ChromeDriver driver = new ChromeDriver(options);
        //блокировка рекламы
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
        WebElement NumberOfInstances = driver.findElement(By.id("input_67"));
        NumberOfInstances.sendKeys("4");
        Thread.sleep(300);
        WebElement Series = driver.findElement(By.id("select_option_200"));
        JavascriptExecutor executor1 =  driver;
        executor1.executeScript("arguments[0].click()", Series);
        Thread.sleep(300);
        WebElement MashinneTypeClickRol = driver.findElement(By.id("select_value_label_63"));
        JavascriptExecutor executor2 = (JavascriptExecutor) driver;
        executor2.executeScript("arguments[0].click()", MashinneTypeClickRol);
        Thread.sleep(300);
        WebElement MashinneType = driver.findElement(By.id("select_option_393"));
        JavascriptExecutor executor3 = (JavascriptExecutor) driver;
        executor3.executeScript("arguments[0].click()", MashinneType);
        Thread.sleep(300);
        WebElement AddGPUs = driver.findElement(By.xpath("//*[@id=\"mainForm\"]/div[2]/div/md-card/md-card-content/div/div[1]/form/div[8]/div[1]/md-input-container/md-checkbox"));
        AddGPUs.sendKeys(Keys.TAB, Keys.ENTER);
        Thread.sleep(600);
//        WebElement NumberOfGPU = driver.findElement(By.id("select_value_label_425"));
//        JavascriptExecutor executor888 = (JavascriptExecutor) driver;
//        executor888.executeScript("arguments[0].click()", NumberOfGPU);
//        Thread.sleep(600);
        WebElement NumberOfGPUClick = driver.findElement(By.id("select_option_436"));//select_option_432
        JavascriptExecutor executor88 = (JavascriptExecutor) driver;
        executor88.executeScript("arguments[0].click()", NumberOfGPUClick);
        Thread.sleep(600);
        WebElement GPUtype = driver.findElement(By.id("select_option_436"));
        JavascriptExecutor executor24 = (JavascriptExecutor) driver;
        executor24.executeScript("arguments[0].click()", GPUtype);
        //GPUtype.sendKeys(Keys.ENTER);
        Thread.sleep(300);
        WebElement GPUtypeClick = driver.findElement(By.id("select_option_439"));
        JavascriptExecutor executor244 = (JavascriptExecutor) driver;
        executor244.executeScript("arguments[0].click()", GPUtypeClick);
        Thread.sleep(300);
        WebElement localSSD = driver.findElement(By.id("select_option_414"));
        JavascriptExecutor executor35 = (JavascriptExecutor) driver;
        executor35.executeScript("arguments[0].click()", localSSD);
        Thread.sleep(300);
        WebElement Datacenterlocation = driver.findElement(By.id("select_option_217"));
        JavascriptExecutor executor5 = (JavascriptExecutor) driver;
        executor5.executeScript("arguments[0].click()", Datacenterlocation);
        Thread.sleep(300);
        WebElement CommiteduUsage = driver.findElement(By.id("select_option_100"));
        JavascriptExecutor executor7 = (JavascriptExecutor) driver;
        executor7.executeScript("arguments[0].click()", CommiteduUsage);
        CommiteduUsage.sendKeys(Keys.ENTER);
        Thread.sleep(300);
        WebElement AddToEstimate = driver.findElement(By.xpath("//*[@id=\"mainForm\"]/div[2]/div/md-card/md-card-content/div/div[1]/form/div[16]/button"));
        JavascriptExecutor executor9 = (JavascriptExecutor) driver;
        executor9.executeScript("arguments[0].click()", AddToEstimate);
        Thread.sleep(300);
        WebElement EMAILESTIMATE = driver.findElement(By.id("email_quote"));
        JavascriptExecutor executor10 = (JavascriptExecutor) driver;
        executor10.executeScript("arguments[0].click()", EMAILESTIMATE);
        // driver.findElement(By.xpath("//*[@id=\"input_368\"]")).sendKeys(Keys.ENTER);

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

        driver.findElement(By.id("input_510")).sendKeys(Keys.CONTROL + "V");
        Thread.sleep(3000);

        driver.findElement(By.id("input_515")).sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);
        driver.switchTo().window(newWindow);
        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 270000); //throws exception if element is not found within 10 seconds
        wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Google Cloud Sales")));
        WebElement FindMail = driver.findElement(By.linkText("Google Cloud Sales <noreply@google.com>"));
        JavascriptExecutor executor77 = (JavascriptExecutor) driver;
        executor77.executeScript("arguments[0].click()", FindMail);
        String estimateSum = driver.findElement(By.id("tab1")).getText();
        assertTrue(estimateSum.contains("1,083.33"));
    }

    @After
    public void close() {
        System.out.println("test close");
        // driver.quit();
    }


    private static void waitForElementLocatedBy(WebDriver driver, By by) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(by));
    }
}


