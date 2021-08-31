package Test;

import PageObject.BasePage;
//import PageObject.Main;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public WebDriver driver;
    public Check taskOne;
    public BasePage basePage;

    @Before
    public void start(){
        WebDriverManager.chromedriver().setup();
        driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        taskOne = PageFactory.initElements(driver, Check.class);
        basePage = PageFactory.initElements(driver, BasePage.class);
    }
    @After
    public void finish(){
     //  driver.quit();
    }

}
