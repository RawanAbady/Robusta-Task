package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepDefs.Hooks;

import java.time.Duration;
import java.util.List;

public class Wishlist_page {
    By btn_Product1 = By.xpath("//div//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/18/2/1\"),!1']");
    By wishHeader = By.xpath("//div[@class='bar-notification success']");
    By txt_SuccessMessage = By.xpath("//*[text()='The product has been added to your ']");
    By btn_wishLishLink = By.xpath("//a[@href='/wishlist']");


    public void pressOnWishBoard() {

        clickButton(btn_Product1);

    }
    public String verifyMessageColour(){

        return getCssValue(wishHeader);
    }
    public boolean isDisplaysucessMessage(){

        return isDisplayMessage(txt_SuccessMessage);
    }

    public String getCssValue(By element){
        String backGroundColour = Color.fromString(Hooks.driver.findElement(element).getCssValue("background-color")).asHex();
        return backGroundColour;
    }
    public void handleError(){
        WebDriverWait wait=new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(Hooks.driver.findElement(wishHeader)));
    }
    public void navigateToWishListLink(){

        clickButton(btn_wishLishLink);
    }




    public boolean isDisplayMessage(By element){

        return Hooks.driver.findElement(element).isDisplayed();
    }


    public void clickButton(By element) {

        Hooks.driver.findElement(element).click();
    }
}



