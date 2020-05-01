import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloFromWebDriver {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://pastebin.com");
        WebElement searchInput = driver.findElement(By.id("paste_code"));
        searchInput.sendKeys("Hello from WebDriver");
        WebElement PasteExpiration0 = driver.findElement(By.xpath("//*[@id=\"myform\"]/div[3]/div[2]/div[2]/select/option[2]"));
        PasteExpiration0.click();
        WebElement SearchInput = driver.findElement(By.xpath("//*[@name=\"paste_name\"]"));
        SearchInput.sendKeys("Hello from WebDriver");
        WebElement CreatNewPaste = driver.findElement(By.id("submit"));
        CreatNewPaste.click();
        Thread.sleep(50000);
        driver.quit();
    }


}
