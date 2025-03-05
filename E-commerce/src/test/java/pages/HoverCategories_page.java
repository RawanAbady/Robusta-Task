package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import stepDefs.Hooks;

public class HoverCategories_page {
    Actions actions;
    By btn_Category= By.xpath("//ul[@class='top-menu notmobile']//li//a[text()='Computers ']");
    By btn_subCategory= By.xpath("(//a[@href='/desktops'])[1]");
    By text_Desktop=By.xpath("//div[@class='page-title']//h1");


    public void selectCategory() {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        actions = new Actions(Hooks.driver);
        actions.moveToElement(Hooks.driver.findElement(btn_Category)).build().perform();
    }
    public void selectSubCategory(){
        actions.moveToElement(Hooks.driver.findElement(btn_subCategory)).build().perform();
    }
    public void pressSubCategory(){
        clickOnButton(btn_subCategory);

    }
    public void clickOnButton(By element){
        Hooks.driver.findElement(element).click();
    }
    public String  getCurrentUrl(){
        return Hooks.driver.getCurrentUrl() ;
    }
    public String getTextSubCateogary(){
        String text= getText(text_Desktop).toLowerCase().trim();
        System.out.println(text);
        return text;

    }
    public String getText(By element){

        return Hooks.driver.findElement(element).getText();
    }


}


