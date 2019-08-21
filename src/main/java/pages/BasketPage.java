package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage {

    WebDriver driver;

    @FindBy(id="js-goToPaymentBtn")
    WebElement go_to_payment;

    public PaymentPage clickPayment()
    {
        PaymentPage paymentPage = new PaymentPage(driver);
        go_to_payment.click();
        return paymentPage;
    }

    public BasketPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}

