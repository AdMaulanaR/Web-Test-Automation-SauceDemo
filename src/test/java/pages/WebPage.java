package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDef.Hooks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WebPage extends Hooks {


    public void UserIsOnLoginPage(){
        driver.get("https://www.saucedemo.com/");
    }
    public void UserInputUserName(String username){
        By userNameInputText = By.cssSelector("input#user-name");
        driver.findElement(userNameInputText).sendKeys(username);
    }
    public void UserInputPassword(String password){
        By userPasswordInputText = By.xpath("//*[@id=\"password\"]");
        driver.findElement(userPasswordInputText).sendKeys(password);
    }
    public void UserClickLoginButton(){
        By loginButton = By.id("login-button");
        driver.findElement(loginButton).click();
    }
    public void UserInHomePage(){
        By productTitle = By.xpath("//*[@id=\"item_0_title_link\"]/div");
        WebElement productElement = driver.findElement(productTitle);
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Bike Light", productElement.getText());
    }
    public void ErrorMessage(){
        By errorTitle = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");
        WebElement errorElement = driver.findElement(errorTitle);
        assertTrue(errorElement.isDisplayed());
        assertEquals("Epic sadface: Username and password do not match any user in this service", errorElement.getText());
    }
    public void UserAddToCartBackPack(){
        By addToCart = By.id("add-to-cart-sauce-labs-backpack");
        driver.findElement(addToCart).click();
    }
    public void UserClickShoppingCart(){
        By shoppingCart = By.id("shopping_cart_container");
        driver.findElement(shoppingCart).click();
    }
    public void UserClickCheckout(){
        By clickCheckout = By.id("checkout");
        driver.findElement(clickCheckout).click();
    }
    public void UserInputFirstName(String firstname){
        By firstNameInput = By.cssSelector("input#first-name");
        driver.findElement(firstNameInput).sendKeys(firstname);
    }
    public void UserInputLastName(String lastname){
        By lastNameInput = By.xpath("//*[@id=\"last-name\"]");
        driver.findElement(lastNameInput).sendKeys(lastname);
    }
    public void UserInputPostalCode(String postalcode){
        By postalCodeInput = By.cssSelector("input#postal-code");
        driver.findElement(postalCodeInput).sendKeys(postalcode);
    }
    public void ClickContinue(){
        By clickContinue = By.id("continue");
        driver.findElement(clickContinue).click();
    }
    public void ClickFinish(){
        By clickFinish = By.id("finish");
        driver.findElement(clickFinish).click();
    }
    public void UserIsOnLastPage(){
        By wordTitle = By.xpath("//*[@id=\"checkout_complete_container\"]/h2");
        WebElement wordElement = driver.findElement(wordTitle);
        assertTrue(wordElement.isDisplayed());
        assertEquals("Thank you for your order!", wordElement.getText());
    }
}
