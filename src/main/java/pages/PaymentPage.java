package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class PaymentPage {

    WebDriver driver;
    PaymentPage paymentPage;

    @FindBy(xpath = "//input[@class = \"cardNumberInput -metrika-nokeys ui-input-numpad\"][1]")
    WebElement card_number_first_part;

    @FindBy(xpath = "//input[@class = \"cardNumberInput -metrika-nokeys ui-input-numpad\"][2]")
    WebElement card_number_second_part;

    @FindBy(xpath = "//input[@class = \"cardNumberInput -metrika-nokeys ui-input-numpad\"][3]")
    WebElement card_number_third_part;

    @FindBy(xpath = "//input[@class = \"cardNumberInput -metrika-nokeys ui-input-numpad\"][4]")
    WebElement card_number_fourth_part;

    @FindBy(id = "cardOwnerName")
    WebElement txt_card_owner;

    @FindBy(id = "expireMonth")
    WebElement expire_month;

    @FindBy(id = "expireYear")
    WebElement expire_year;

    @FindBy(id = "securityCode")
    WebElement txt_security_code;

    @FindBy(xpath = "//label[contains(@for,'acceptAgreement')]")
    WebElement btn_approval;

    @FindBy(id = "js-paymentBtn")
    WebElement btn_payment;

    public PaymentPage enterFirstPartOfCardNumber(String cardNumber1)
    {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        card_number_first_part.sendKeys(cardNumber1);
        return paymentPage;
    }

    public PaymentPage enterSecondPartOfCardNumber(String cardNumber2)
    {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        card_number_second_part.sendKeys(cardNumber2);
        return paymentPage;
    }

    public PaymentPage enterThirdPartOfCardNumber(String cardNumber3)
    {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        card_number_third_part.sendKeys(cardNumber3);
        return paymentPage;
    }

    public PaymentPage enterFourthPartOfCardNumber(String cardNumber4)
    {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        card_number_fourth_part.sendKeys(cardNumber4);
        return paymentPage;
    }

    public PaymentPage enterCardOwnerName(String ownerName)
    {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        txt_card_owner.sendKeys(ownerName);
        return paymentPage;
    }

    public PaymentPage expireMonth(String expireMonth)
    {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        expire_month.sendKeys(expireMonth);
        return paymentPage;
    }

    public PaymentPage expireYear(String expireYear)
    {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        expire_year.sendKeys(expireYear);
        return paymentPage;
    }

    public PaymentPage enterSecurityCode(String securityCode)
    {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        txt_security_code.sendKeys(securityCode);
        return paymentPage;
    }

    public PaymentPage clickApproveButton()
    {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        btn_approval.click();
        return paymentPage;
    }

    public FinalPage clickPaymentButton()
    {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        FinalPage finalPage = new FinalPage(driver);
        btn_payment.click();
        return finalPage;
    }

    public PaymentPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
