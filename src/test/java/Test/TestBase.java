package Test;

import PageObject.CalculatorPage;
import PageObject.EmailPage;
import PageObject.EmailPageReturn;
import PageObject.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public WebDriver driver;
    public CalculatorPage calculatorPage;
    public HomePage homePage;
    public EmailPage emailPage;
    public EmailPageReturn emailPageReturn;
    public Check check;

    @Before
    public void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        homePage = PageFactory.initElements(driver, HomePage.class);
        calculatorPage = PageFactory.initElements(driver, CalculatorPage.class);
        emailPage = PageFactory.initElements(driver, EmailPage.class);
        emailPageReturn = PageFactory.initElements(driver, EmailPageReturn.class);
        check = PageFactory.initElements(driver, Check.class);
    }

    @After
    public void finish() {
        //  driver.quit();
    }

}
