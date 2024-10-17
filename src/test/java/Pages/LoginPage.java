package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {

    public LoginPage() {
        PageFactory.initElements(driver, this);

    }

    @FindBy (id="userName")
    WebElement usernameField;

    @FindBy (id = "password")
    WebElement passwordField;

    @FindBy (id = "login")
    WebElement loginButton;

    public void clickOnLoginButton() {
        loginButton.click();
    }



    public void inputUserName(String  username) {
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void inputPassword(String password) {
        usernameField.clear();
        usernameField.sendKeys(password);
    }






}
