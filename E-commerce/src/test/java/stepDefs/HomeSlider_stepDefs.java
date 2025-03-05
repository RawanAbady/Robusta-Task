package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.HomeSlider_page;

public class HomeSlider_stepDefs {
    HomeSlider_page slider = new HomeSlider_page();
    SoftAssert softAssert;



    @Given("user can press on first slide")
    public void openFirstSlide() {
        slider.openHomePage();

    }
    @Then("compare between URls of first slide and fail")
    public void comparefirstSlideLink() {
        slider.openSlide1();
        Assert.assertEquals(slider.getUrl(), "https://demo.nopcommerce.com/nokia-lumia-1020");
    }

    @Given("user can press on second slide")
    public void openSecondSlide() {
        slider.openHomePage();
    }
    @Then("compare between URls of second slide and fail")
    public void compareSecondSlideLink() {
        slider.openSlide2();
        Assert.assertEquals(slider.getUrl(), "https://demo.nopcommerce.com/iphone");
    }
}
