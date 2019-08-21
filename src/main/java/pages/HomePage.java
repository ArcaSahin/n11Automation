package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    @FindBy(id = "searchData")
    WebElement txt_search;

    @FindBy(className = "searchBtn")
    WebElement click_search;

    @FindBy(className = "productName")
    WebElement product_name;

    @FindBy(id = "instantPay")
    WebElement instant_pay;

    @FindBy(className = "btnSignIn")
    WebElement btn_signIn;


    public LoginPage clickSignIn() {
        LoginPage loginPage = new LoginPage(driver);
        btn_signIn.click();
        return loginPage;
    }


    public HomePage searchProduct(String txt_searchBox) {
        txt_search.sendKeys(txt_searchBox);
        return this;
    }

    public HomePage clickSearchButton() {
        click_search.click();
        return this;
    }

    public HomePage clickProduct() {
        product_name.click();
        return this;
    }

    public BasketPage clickPayInstant() {
        BasketPage basketPage = new BasketPage(driver);
        instant_pay.click();
        return basketPage;
    }

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public HomePage goTo() {
        driver.navigate().to("https://www.n11.com/");
        return this;
    }
}
