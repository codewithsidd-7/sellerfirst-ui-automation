package tests;

import baseTest.BaseClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjects.OrderFlowPage;

@Listeners(listeners.TestListener.class)
public class OrderDeliveryTest extends BaseClass {
    OrderFlowPage orderFlowPage=new OrderFlowPage(driver);
    @Test(priority = 1)
    public void openMyorderTest(){
        orderFlowPage.myordersIcon();

    }
    @Test(priority = 2)
    public void searchOrderTest(){
        orderFlowPage.searchOrder();
    }
    @Test(priority = 3)
    public void uploadInvoiceTest(){
        orderFlowPage.uploadInvoiceFile();
    }
    @Test(priority = 4)
    public void markRFDTest(){
        orderFlowPage.markForRED();
    }
    @Test(priority = 5)
    public void goToReadyDispatchTest(){
        orderFlowPage.goToScheduledandDispatch();
    }
    @Test(priority = 6)
    public void searchOrderScheduledDisptachedTest(){
        orderFlowPage.searchOrderDispatch();
    }
    @Test(priority = 7)
    public void RFDDetailsTest(){
        orderFlowPage.readyForDispatch();
    }
    @Test(priority = 8)
    public void scheduledTest(){
        orderFlowPage.scheduledOrder();
    }
    @Test(priority = 9)
    public void OrderDeliverTest(){
        orderFlowPage.UploadDeliveryFile();
    }


}
