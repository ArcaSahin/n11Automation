package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy(id = "email")
    WebElement user_email;

    @FindBy(id = "password")
    WebElement user_password;

    @FindBy(id = "loginButton")
    WebElement login_button;


    public LoginPage login(String u_email, String u_pass)
    // user_email = u_email, user_password= u_pass
    {
        user_email.sendKeys(u_email);
        user_password.sendKeys(u_pass);
        return this;
    }

    public HomePage clickLogin() {
        HomePage homePage = new HomePage(driver);
        login_button.click();
        return homePage;
    }

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
