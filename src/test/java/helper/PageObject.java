package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class PageObject {
    private WebDriver driver;
    private WebDriverWait wait;

    public PageObject(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));  //Wait up to 10 seconds
    }

    // Web elements locators
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By postalCodeField = By.id("postal-code");
    private By loginButton = By.id("login-button");
    private By menuButton = By.id("react-burger-menu-btn");
    private By logoutLink = By.id("logout_sidebar_link");
    private By detailProduct = By.id("item_4_title_link");
    private By backToProduct = By.id("back-to-products");
    private By addToCart = By.id("add-to-cart");
    private By addToCartSauceLabBackpack = By.id("add-to-cart-sauce-labs-backpack");
    private By addToCartButton = By.xpath("//button[contains(text(), 'Add to cart')]");
    private By remove = By.id("remove");
    private By cartBadge = By.cssSelector(".shopping_cart_badge[data-test='shopping-cart-badge']");
    private By errorMessageLogin = By.cssSelector(".error-message-container h3[data-test='error']");
    private By filterDropdown = By.cssSelector(".product_sort_container");
    private By productNames = By.cssSelector(".inventory_item_name");
    private By productPrices = By.cssSelector(".inventory_item_price");
    private By checkoutButton = By.id("checkout");
    private By continueButton = By.id("continue");
    private By cancelButton = By.id("cancel");
    private By finishButton = By.id("finish");
    private By cartIcon = By.id("shopping_cart_container");
    private By continueShoppingButton = By.id("continue-shopping");
    private By checkoutErrorMessage = By.cssSelector(".error-message-container h3[data-test='error']");
    private By allItemsLink = By.id("inventory_sidebar_link");
    private By aboutLink = By.id("about_sidebar_link");
    private By resetAppStateLink = By.id("reset_sidebar_link");
    private By xButton = By.id("react-burger-cross-btn");
    private By completedCheckoutPage = By.className("complete-header");

    //Methods to interact with the elements
    //New method using wait

    //############## CLICK OBJECT ##############
    public void enterUsername(String username){
        WebElement usernameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField));
        usernameElement.sendKeys(username);
    }

    public void enterPassword(String password){
        WebElement passwordElement = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
        passwordElement.sendKeys(password);
    }

    public void enterFirstName(String first_name){
        WebElement firstNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameField));
        firstNameElement.sendKeys(first_name);
    }

    public void enterLastName(String last_name){
        WebElement lastNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameField));
        lastNameElement.sendKeys(last_name);
    }

    public void enterPostalCode(String postal_code){
        WebElement postalCodeElement = wait.until(ExpectedConditions.visibilityOfElementLocated(postalCodeField));
        postalCodeElement.sendKeys(postal_code);
    }

    public void clickLoginButton(){
        WebElement loginButtonElement = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButtonElement.click();
    }

    public void clickMenuButton() {
        WebElement menuButtonElement = wait.until(ExpectedConditions.elementToBeClickable(menuButton));
        menuButtonElement.click();
    }

    public void clickAddToCartButton(String product){
        WebElement addToCartButtonElement = wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        addToCartButtonElement.click();
    }

    public void clickCheckout(){
        WebElement checkoutElement = wait.until(ExpectedConditions.elementToBeClickable(checkoutButton));
        checkoutElement.click();
    }

    public void clickContinueButton(){
        WebElement continueElement = wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        continueElement.click();
    }

    public void clickFinishButton(){
        WebElement finishElement = wait.until(ExpectedConditions.elementToBeClickable(finishButton));
        finishElement.click();
    }

    public void clickCartIcon(){
        WebElement cartIconElement = wait.until(ExpectedConditions.elementToBeClickable(cartIcon));
        cartIconElement.click();
    }

    public void clickXButton(){
        WebElement closeMenu = wait.until(ExpectedConditions.elementToBeClickable(xButton));
        closeMenu.click();
    }

    public void clickResetStateApp(){
        WebElement resetStateApp = wait.until(ExpectedConditions.elementToBeClickable(resetAppStateLink));
        resetStateApp.click();
    }

    public boolean isOnCompletedCheckoutPage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(completedCheckoutPage)).isDisplayed();
    }

    //############## CHECK PAGE POSITION ##############
    public String isOnDashboardPage(){
        return driver.getCurrentUrl();
    }

    //############## GET TEXT ##############
    public List<String> getMenuOptions(){
        List<String> options = new ArrayList<>();
        options.add(wait.until(ExpectedConditions.visibilityOfElementLocated(allItemsLink)).getText());
        options.add(wait.until(ExpectedConditions.visibilityOfElementLocated(aboutLink)).getText());
        options.add(wait.until(ExpectedConditions.visibilityOfElementLocated(logoutLink)).getText());
        options.add(wait.until(ExpectedConditions.visibilityOfElementLocated(resetAppStateLink)).getText());
        return options;
    }


    




}
