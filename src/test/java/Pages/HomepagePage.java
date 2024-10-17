package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomepagePage extends BaseTest {

    public HomepagePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "card-body")
    public List<WebElement> cardList;

    public void clickOnCard(String name) {
        for (int i = 0; i < cardList.size(); i++) {
            if (cardList.get(i).getText().equals(name)) {
                cardList.get(i).click();
                break;
            }
        }
    }

}
