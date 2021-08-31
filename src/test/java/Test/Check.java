package Test;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class Check extends BasePage {
    public Check(WebDriver driver) {
        super(driver);
    }

    public void checkPageIsCorrect() {
        assertEquals(getFindCheckElemend().getText(), "USD 1,288.71");
    }
}
