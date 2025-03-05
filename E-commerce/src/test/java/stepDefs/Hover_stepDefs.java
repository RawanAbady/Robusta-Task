package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.HoverCategories_page;

public class Hover_stepDefs {
   HoverCategories_page hover = new HoverCategories_page();
    @Given("open Homepage and hover on Category")
    public void Hofer(){
        hover.selectCategory();

    }

    @Then("user can open sub-Category and get Text")
    public void openSubCatogry(){
        hover.selectSubCategory();
        hover.pressSubCategory();
        Assert.assertTrue(hover.getTextSubCateogary().contains("desktops"));
        Assert.assertTrue(hover.getCurrentUrl().contains("https://demo.nopcommerce.com/desktops"));
    }
}


