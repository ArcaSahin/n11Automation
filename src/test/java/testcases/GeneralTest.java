package testcases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.util.concurrent.TimeUnit;

public class GeneralTest {

    WebDriver driver;

    @Test
    public void checkValidUser() {
        System.setProperty("webdriver.chrome.driver", "/Users/arca.sahin/Desktop/chromedriver");  // here you must write your driver which might be chrome or firefox ot other ..  // also for the second part you must write where your driver path is located on your computer.
        driver = new ChromeDriver(); // here you can change your driver if it is something diffrent than ChromeDriver.

        HomePage homePage = new HomePage(driver);
        homePage.goTo();

        LoginPage loginPage = homePage.clickSignIn();

        homePage = loginPage
                .login(" ", " ")    // here you can write your own e-mail address and password to login for the website N11.
                .clickLogin();

        homePage.searchProduct("telefon")  // here I chose to search telephone in the product search field at N11.
                .clickSearchButton()
                .clickProduct();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        BasketPage basketPage = homePage.clickPayInstant();

        PaymentPage paymentPage = basketPage.clickPayment() ;
        paymentPage.enterFirstPartOfCardNumber("1111"); // here you can write first '4 units' of your credit card.
        paymentPage.enterSecondPartOfCardNumber("2222"); // here you can write second '4 units' of your credit card.
        paymentPage.enterThirdPartOfCardNumber("3333");  // here you can write third '4 units' of your credit card.
        paymentPage.enterFourthPartOfCardNumber("4444"); // // here you can write fourth '4 units' of your credit card.
        paymentPage.enterCardOwnerName("Arca"); // here you can write your name which is on your credit card.
        paymentPage.expireMonth("01"); // here you can write your expire month which is on your credit card.
        paymentPage.expireYear("2021"); // here you can write your expire year which is on your credit card.
        paymentPage.enterSecurityCode("000"); // here you can write your security code which is on your credit card.
        paymentPage.clickApproveButton();

        FinalPage finalPage = paymentPage.clickPaymentButton();
    }
}
