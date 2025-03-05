package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import stepDefs.Hooks;

public class Register_page {

    public Select select;
    By btn_RegisterLink= By.linkText("Register");
    By btn_Gender = By.xpath("//input[@id='gender-female']");
    By textBox_FrName = By.xpath("//input[@id='FirstName']");
    By textBox_LaName = By.xpath("//input[@id='LastName']");
    By drpdown_Day= By.xpath("//select[@name='DateOfBirthDay']");
    By textbox_Month= By.xpath("//select[@name='DateOfBirthMonth']");
    By textbox_Year= By.xpath("//select[@name='DateOfBirthYear']");
    By text_Email= By.xpath("//input[@id='Email']");
    By text_companyName= By.xpath("//input[@id='Company']");
    By text_Password= By.xpath("//input[@id='Password']");
    By text_confirmPassword= By.xpath("//input[@id='ConfirmPassword']");
    By btn_Register= By.xpath("//button[@id='register-button']");
    public By text_sucessMessage = By.xpath("//div[text()='Your registration completed']");
    By btn_Contiue= By.xpath("//a[@class='button-1 register-continue-button']");
    By btn_LogOut= By.linkText("Log out");
    //create WebElement method to register button

    public void openRegisterLink(){

        clickButton(btn_RegisterLink);
    }
    public void enterPersonalData(String firstname,String lastname,int day,
                                  int month, String year,String email,String company)
    {
        clickButton(btn_Gender);
        sendText(textBox_FrName,firstname);
        sendText(textBox_LaName,lastname);
        selectByIndex(drpdown_Day,day);
        selectByIndex(textbox_Month,month);
        selectByVisibleText(textbox_Year,year);
        sendText(text_Email,email);
        sendText(text_companyName,company);
    }
    public void enterPassword(String password)
    {
        sendText(text_Password,password);
        sendText(text_confirmPassword,password);
    }
    public void pressOnRegisterButton() {
        clickButton(btn_Register);
    }
    public boolean issucessMessageDisplay(){
        return isDisplay(text_sucessMessage);

    }
    public void cotinue(){

        clickButton(btn_Contiue);
    }

    public void sendText(By element,String Value){

        Hooks.driver.findElement(element).sendKeys(Value);
    }
    public boolean isDisplay(By element){
        return Hooks.driver.findElement(element).isDisplayed();

    }
    public void clickButton(By element){

        Hooks.driver.findElement(element).click();
    }

    public void selectByIndex(By element,int number){
        select=new Select(Hooks.driver.findElement(element));
        select.selectByIndex(number);
    }

    public void selectByVisibleText(By element,String text){
        select=new Select(Hooks.driver.findElement(element));
        select.selectByVisibleText(text);
    }

    public void selectByText(By element,String value){
        select=new Select(Hooks.driver.findElement(element));
        select.selectByValue(value);
    }
    public String GetCssColour(By element) {
        // String Colour = Hooks.driver.findElement(element).getCssValue("color");
        String hex = Color.fromString(Hooks.driver.findElement(element).getCssValue("color")).asHex();
        return hex;

    }
    public void userLogOut()
    {
        clickButton(btn_LogOut);

    }





}
