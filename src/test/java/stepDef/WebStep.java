package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.WebPage;

public class WebStep {

    WebPage webPage;

    public WebStep(){
        this.webPage = new WebPage();
    }

    @Given("user is on login page")
    public void userIsOnLoginPage(){
        webPage.UserIsOnLoginPage();
    }

    @And("user input username with {string}")
    public void userInputUsernameWith(String username) {
        webPage.UserInputUserName(username);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
        webPage.UserInputPassword(password);
    }

    @When("user click login button")
    public void userClickLoginButton() {
        webPage.UserClickLoginButton();
    }

    @Then("user is on homepage")
    public void userIsOnHomepage() {
        webPage.UserInHomePage();
    }

    @Then("user able to see error message")
    public void userAbleToSeeErrorMessage() {
        webPage.ErrorMessage();
    }

    @And("user click Add to cart Back Pack")
    public void userClickAddToCartBackPack() {
        webPage.UserAddToCartBackPack();
    }

    @And("user click shopping cart")
    public void userClickShoppingCart() {
        webPage.UserClickShoppingCart();
    }

    @And("user click checkout")
    public void userClickCheckout() {
        webPage.UserClickCheckout();
    }

    @And("user input first name {string}")
    public void userInputFirstName(String firstname) {
        webPage.UserInputFirstName(firstname);
    }

    @And("user input last name {string}")
    public void userInputLastName(String lastname) {
        webPage.UserInputLastName(lastname);
    }

    @And("user input postal code {string}")
    public void userInputPostalCode(String postalcode) {
        webPage.UserInputPostalCode(postalcode);
    }

    @And("user click continue")
    public void userClickContinue() {
        webPage.ClickContinue();
    }

    @When("user click finish")
    public void userClickFinish() {
        webPage.ClickFinish();
    }

    @Then("user is on last page")
    public void userIsOnLastPage() {
        webPage.UserIsOnLastPage();
    }
}
