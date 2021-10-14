package Test;

import org.junit.Test;

public class First extends TestBase {
    @Test
    public void firstTest() throws InterruptedException {
        homePage.goTo();
        homePage.getSearchInput("Google Cloud Platform Pricing Calculator");
        homePage.getSearchInputClick();
        calculatorPage.enterToFrame();
        calculatorPage.fillSearchCalc("Compute Engine");
        calculatorPage.searchCalcLeave();
        calculatorPage.fillNumberOfInstances("4");
        calculatorPage.clickSeries();
        calculatorPage.clickMashinneTypeRol();
        calculatorPage.clickAddGPUs();
        calculatorPage.clickNumberOfGPU();
        calculatorPage.clickGPUtypeRol();
        calculatorPage.clickGPUtype();
        calculatorPage.clicklocalSSD();
        calculatorPage.chooseDatacenterlocation();
        calculatorPage.chooseCommiteduUsage();
        calculatorPage.clickAddToEstimate();
        calculatorPage.clickEmailEstimate();
        emailPage.ChangeNewWindow();
        emailPage.setNewWindow();
        emailPage.getCopyEmail();
        emailPage.setOriginalWindow();
        homePage.enterToFrame();
        emailPage.getPasteEmail();
        homePage.getClickSendReportOnEmail();
        emailPage.setNewWindow();
        emailPageReturn.getWaitReceiveEmail();
        emailPageReturn.clickFindMail();
        emailPageReturn.clickEmailWithoutAdvertising();
        check.checkPageIsCorrect();
    }
}
