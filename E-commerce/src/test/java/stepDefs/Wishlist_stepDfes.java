package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;
import pages.Wishlist_page;

public class Wishlist_stepDfes {
    Wishlist_page wishlist = new Wishlist_page();
    SoftAssert softassert;
    @Given("user open page and click on product wishlist")
    public void addingToWishList() {
        wishlist.pressOnWishBoard();
    }

    @Then("message displayed with green")
    public void verifyMessageandcolour() {
        softassert = new SoftAssert();
        softassert.assertTrue(wishlist.isDisplaysucessMessage());
        softassert.assertEquals(wishlist.verifyMessageColour(), "#4bb07a");
        softassert.assertAll();
    }

    //Scenario2
    @Given("user open home page and click on button add to wishlist")
    public void clickOnWishList() {

        wishlist.pressOnWishBoard();
    }

    @Then("wait for element to be invisible")
    public void waitSuccessBar() {

        wishlist.handleError();
    }

    @Then("user able to click on wishList Link")
    public void openWishLink() {

        wishlist.navigateToWishListLink();
    }

}
