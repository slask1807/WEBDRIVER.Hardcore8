package Test;

import PageObject.BasePage;
import org.junit.Test;

public class First extends TestBase {
    @Test
    public void firstTest() throws InterruptedException {
        basePage.goTo();
        basePage.getSearchInput("Google Cloud Platform Pricing Calculator");
        basePage.getSearchInputClick();
        basePage.enterToFrame();
        basePage.getSearchCalcClick();
        basePage.fillSearchCalc("Compute Engine");
        basePage.searchCalcLeave();
        basePage.fillNumberOfInstances("4");
        basePage.clickSeries();
        basePage.clickMashinneTypeRol();
        basePage.clickAddGPUs();
        basePage.clickNumberOfGPU();
        basePage.clickGPUtypeRol();
        basePage.clickGPUtype();
        basePage.clicklocalSSD();
        basePage.chooseDatacenterlocation();
        basePage.chooseCommiteduUsage();
        basePage.clickAddToEstimate();
        basePage.clickEmailEstimate();
        basePage.ChangeNewWindow();
        basePage.setNewWindow();
        basePage.getCopyEmail();
        basePage.setOriginalWindow();
        basePage.enterToFrame();
        basePage.getPasteEmail();
        basePage.getClickSendReportOnEmail();
        basePage.setNewWindow();
        basePage.getWaitReceiveEmail();
        basePage.clickFindMail();
        basePage.clickEmailWithoutAdvertising();
        taskOne.checkPageIsCorrect();
    }
}
