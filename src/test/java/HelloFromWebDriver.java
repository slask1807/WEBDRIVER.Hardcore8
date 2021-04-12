import org.junit.After;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HelloFromWebDriver {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(1500, TimeUnit.SECONDS);
        driver.get("https://cloud.google.com");
        Thread.sleep(300);
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Total Frames --" + size);
        driver.manage().window().maximize();
        WebElement SearchInput = driver.findElement(By.xpath("//input"));
        SearchInput.sendKeys("Google Cloud Platform Pricing Calculator");
               SearchInput.sendKeys(Keys.TAB);
        SearchInput.sendKeys(Keys.ENTER);
        waitForElementLocatedBy(driver, By.partialLinkText("Google Cloud Platform Pricing Calculato"));
        WebElement SearchInput2 = driver.findElement(By.partialLinkText("Google Cloud Platform Pricing Calculato"));
        SearchInput2.click();
        long start_time = System.currentTimeMillis();
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
       WebElement SearchCalc = driver.findElement(By.xpath("//input[@id=\"input-0\"]"));
        SearchCalc .click();
        SearchCalc.sendKeys("Compute Engine");
        SearchCalc.sendKeys(Keys.TAB);
        WebElement NumberOfInstances = driver.findElement(By.id("input_58"));
        NumberOfInstances.sendKeys("4");
        WebElement MachineTYpe = driver.findElement(By.xpath("//*[@id=\"select_83\"]"));
        JavascriptExecutor executor1  = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click()", MachineTYpe);
        Thread.sleep(300);
        WebElement MachineTYpe2= driver.findElement(By.xpath("//*[@id=\"select_option_212\"]"));
        JavascriptExecutor executor2  = (JavascriptExecutor)driver;
        executor2.executeScript("arguments[0].click()", MachineTYpe2);
                        Thread.sleep(300);
                       WebElement AddGPUs = driver.findElement(By.xpath("//*[@id=\"mainForm\"]/div[2]/div/md-card/md-card-content/div/div[1]/form/div[8]/div[1]/md-input-container/md-checkbox"));
              AddGPUs.sendKeys(Keys.SPACE, Keys.TAB,Keys.SPACE,Keys.SPACE);
        Thread.sleep(300);
        WebElement GPUtype= driver.findElement(By.xpath("//md-select[@ng-model=\"listingCtrl.computeServer.gpuType\"]"));
        JavascriptExecutor executor0  = (JavascriptExecutor)driver;
        executor0.executeScript("arguments[0].click()",GPUtype);
        Thread.sleep(600);
        WebElement GPUtype1= driver.findElement(By.cssSelector("#select_option_349"));
        JavascriptExecutor executor  = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", GPUtype1);
        Thread.sleep(300);
        WebElement localSSD= driver.findElement(By.xpath("//*[@id=\"select_170\"]"));
        JavascriptExecutor executor3  = (JavascriptExecutor)driver;
        executor3.executeScript("arguments[0].click()", localSSD);
        Thread.sleep(300);
        WebElement localSSD1= driver.findElement(By.xpath("//*[@id=\"select_option_233\"]"));
        JavascriptExecutor executor4  = (JavascriptExecutor)driver;
        executor4.executeScript("arguments[0].click()", localSSD1);
        Thread.sleep(300);
        WebElement Datacenterlocation = driver.findElement(By.id("select_value_label_56"));
        JavascriptExecutor executor5  = (JavascriptExecutor)driver;
        executor5.executeScript("arguments[0].click()", Datacenterlocation);
        Thread.sleep(300);
        WebElement Datacenterlocation1 = driver.findElement(By.id("select_option_181"));
        JavascriptExecutor executor6  = (JavascriptExecutor)driver;
        executor6.executeScript("arguments[0].click()", Datacenterlocation1);
        Thread.sleep(300);
        WebElement CommiteduUsage = driver.findElement(By.id("select_option_89"));
        JavascriptExecutor executor7  = (JavascriptExecutor)driver;
        executor7.executeScript("arguments[0].click()", CommiteduUsage);
        Thread.sleep(300);
        WebElement CommiteduUsage1 = driver.findElement(By.id("select_option_90"));
        JavascriptExecutor executor8  = (JavascriptExecutor)driver;
        executor8.executeScript("arguments[0].click()", CommiteduUsage1);
        Thread.sleep(300);
        WebElement AddToEstimate = driver.findElement(By.xpath("//*[@id=\"mainForm\"]/div[2]/div/md-card/md-card-content/div/div[1]/form/div[15]/button"));
        JavascriptExecutor executor9  = (JavascriptExecutor)driver;
        executor9.executeScript("arguments[0].click()", AddToEstimate);
        Thread.sleep(300);
        WebElement EMAILESTIMATE = driver.findElement(By.id("email_quote"));
        JavascriptExecutor executor10  = (JavascriptExecutor)driver;
        executor10.executeScript("arguments[0].click()", EMAILESTIMATE);
        driver.findElement(By.xpath("//*[@id=\"input_368\"]")).sendKeys(Keys.ENTER);

        String originalWindow = driver.getWindowHandle();
        final Set<String> oldWindowsSet = driver.getWindowHandles();

        String url="https://10minutemail.net";
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

        driver.findElement(By.id("input_404")).sendKeys(Keys.CONTROL +"V");
        Thread.sleep(3000);

   driver.findElement(By.id("input_409")).sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);



    }

    @After
    public void tearDown(WebDriver driver) throws Exception {
        driver.quit();
    }


  private static void waitForElementLocatedBy(WebDriver driver, By by) {
  new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(by));
    }
}


