package tests;

import baseTest.BaseClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjects.AddRewardPointsPage;
import pageObjects.LoginPage;
import pageObjects.RemoveRewardPointsPage;

@Listeners(listeners.TestListener.class)
public class RemoveRewardPointsTest extends BaseClass {
    RemoveRewardPointsPage rrpp = new RemoveRewardPointsPage(driver);

    @Test(priority = 1)
    void openRewards() {
        logger.info("Starting test: openRewards");

        rrpp.clickRetailers();
        logger.debug("Clicked on 'Retailers'");

        rrpp.clickRewards();
        logger.debug("Clicked on 'Rewards'");

        logger.info("Finished test: openRewards");
    }

    @Test(priority = 2)
    void searchRetailer() {
        logger.info("Starting test: searchRetailer");

        rrpp.enterRetailerNumber();
        logger.debug("Entered retailer number");

        rrpp.searchRetailer();
        logger.debug("Searched for retailer");

        rrpp.clickEditRetailer();
        logger.debug("Clicked on 'Edit Retailer'");

        logger.info("Finished test: searchRetailer");
    }

    @Test(priority = 3)
    void removeRewardPoints() {
        logger.info("Starting test: removeRewardPoints");

        rrpp.selectRemovePoints();
        logger.debug("Selected 'Remove Points'");

        rrpp.selectReasonDropdown();
        logger.debug("Opened reason dropdown");

        rrpp.selectReason();
        logger.debug("Selected reason for point removal");

        rrpp.addPointsValue();
        logger.debug("Entered points value");

        rrpp.clickConfirmButton();
        logger.debug("Clicked on 'Confirm'");

        rrpp.clickYesButton();
        logger.debug("Confirmed removal with 'Yes'");

        logger.info("Finished test: removeRewardPoints");
    }

    @Test(priority = 4)
    void validateConfirmationMessage() {
        logger.info("Starting test: validateConfirmationMessage");

        rrpp.validatePopupMessage();
        logger.debug("Validated confirmation popup message");

        logger.info("Finished test: validateConfirmationMessage");
    }
}



