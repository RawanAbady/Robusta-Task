package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Currency_page;

public class Currency_stepDefs {
    Currency_page currency=new Currency_page();

    @Given("user press on currency dropdown and switch to Euro")
    public void switchToEuroCurrency(){
        currency.navigateToCurrency();
    }
    @When("user scroll down")
    public void scrollPage(){
        currency.scrollDown();
    }
    @Then("Euro should be displayed")
    public void verifyEuro(){
        Assert.assertTrue(currency.validateCurrency().contains("€"));

    }
}

