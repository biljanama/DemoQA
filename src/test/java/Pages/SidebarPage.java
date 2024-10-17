package Pages;

import Base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SidebarPage extends BaseTest {

    public SidebarPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy (css = ".btn.btn-primary")
    WebElement firstLogInButton;

    @FindBy (css = ".text")
    public List<WebElement> textFields;

    public void clickOnFirstLogInButton() {
        firstLogInButton.click();
    }

    public void clickOnTextField(String name) {
        for (int i = 0; i < textFields.size(); i++) {
            if (textFields.get(i).getText().equals(name)) {
                textFields.get(i).click();
                break;
            }
        }
    }

}


