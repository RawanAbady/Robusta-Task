package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Search_Page;

public class Search_stepDefs {
Search_Page search = new Search_Page();
    @Given("user open Home Page and open search")
    public void NavigateToSearch(){
        search.openSearch();

    }
    @When("^user enter Product as \"(.*)\"$")
    public void searchWithProduct(String product){

        search.searchProduct(product);
    }
    @And("user search")
    public void searchOfProduct(){

        search.pressSearch();
    }
    @Then("All words of search contain Apple")
    public void verifyWithSearch(){
        // Assert.assertTrue(home.verifyName().contains("Apple"));
        Assert.assertTrue(search.vervifySearch());

    }
    @And("user open link and found Sku")
    public void navigateToLink(){
        search.navigateToLink();
        Assert.assertTrue(search.isDisplaySku());
    }

}


