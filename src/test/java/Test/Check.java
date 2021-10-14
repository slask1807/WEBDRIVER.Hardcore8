package Test;

import PageObject.EmailPageReturn;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class Check extends EmailPageReturn {
    public Check(WebDriver driver) {
        super(driver);
    }

    public void checkPageIsCorrect() {
        assertEquals(getFindCheckElemend().getText(), "USD 1,290.63");
    }
}
