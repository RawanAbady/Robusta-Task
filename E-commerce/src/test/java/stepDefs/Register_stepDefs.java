package stepDefs;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import pages.Register_page;


public class Register_stepDefs{
   Register_page reg = new Register_page();
    SoftAssert softAssert;

    @Given("user open Register Link")
    public void navigateToRegisterLink(){

        reg.openRegisterLink();
    }

    @When("user enter personal data and Email")
    public void enterData(){

        reg.enterPersonalData("Rawan","Abady",12,7,"1994","prograwanabady@gmail.com","BanqueMisr");
    }

    @And("user enter password and confirm password")
    public void enterValidPassword()
    {
        reg.enterPassword("12345678");
    }


    @And("user click on Register button")
    public void clickOnRegisteration(){
        reg.pressOnRegisterButton();
    }
    @Then("page should be opened successfully")
    public void registerSucess() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(reg.issucessMessageDisplay());
        softAssert.assertAll();
        Assert.assertEquals("#4cb17c",reg.GetCssColour(reg.text_sucessMessage));
    }
    @And("user log out")

    public void Logout () {
        reg.userLogOut();
    }
}

