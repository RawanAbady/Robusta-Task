package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.Login_page;

public class Login_stepDefs {
   Login_page login= new Login_page();
    SoftAssert softAssert;

    @Given("user open Login Link")
    public void navigateToLoginLink(){
        login.openLoginLink();

    }
    @When("user enter Email and Password")
    public void enterValidEmailAndValidPassword() {
        login.enterEmailAndPassword("prograwanabady@gmail.com", "654321");
    }
    @And("user click on Login Button")
    public void clickLoginButton(){
        login.pressLoginButton();
    }
    @Then("user should login successfully")
    public void loginUserSuccess(){
        softAssert=new SoftAssert();
        softAssert.assertEquals(login.getCurrentUrl(),"https://demo.nopcommerce.com/");
        softAssert.assertTrue(login.isDisplayMyAccount());
        softAssert.assertAll();

    }
}


