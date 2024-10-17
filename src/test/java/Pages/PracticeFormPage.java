package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PracticeFormPage extends BaseTest {

    public PracticeFormPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "firstName")
    WebElement firstNameField;

    @FindBy(id = "lastName")
    WebElement lastNameField;

    @FindBy(id = "userEmail")
    WebElement emailField;

    @FindBy(className = "custom-control-label")
    public List<WebElement> radioAndCheckboxLabels;

    @FindBy(id = "userNumber")
    WebElement mobileNoField;

    @FindBy(id = "dateOfBirthInput")
    WebElement dateOfBirthField;

    @FindBy (id = "subjectsContainer")
    WebElement subjectField;

    @FindBy (id = "uploadPicture")
    WebElement uploadPictureButton;

    @FindBy (id = "currentAddress")
    WebElement addressField;

    @FindBy (id = "state")
    WebElement stateField;

    @FindBy (id = "city")
    WebElement cityButton;

    @FindBy (id = "submit")
    WebElement submitButton;

    public void inputFirstName(String firstName) {
        firstNameField.clear();
        firstNameField.sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        lastNameField.clear();
        lastNameField.sendKeys(lastName);
    }

    public void inputEmailAdsress (String email) {
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void clickOnGenderLabel(String text) {
        for (int i = 0; i < radioAndCheckboxLabels.size(); i++)
            if(text.equals(radioAndCheckboxLabels.get(i).getText()))
                radioAndCheckboxLabels.get(i).click();
    }

    public void inputMobileNo (String number) {
        mobileNoField.sendKeys(number);
    }

    public void inputSubject (String subject) {
        subjectField.sendKeys(subject);
    }

    public void clickOnHobbyCheckbox(String text) {
        for (int i = 0; i < radioAndCheckboxLabels.size(); i++)
            if(text.equals(radioAndCheckboxLabels.get(i).getText()))
                radioAndCheckboxLabels.get(i).click();
    }

    public void inputAddress (String address) {
        addressField.sendKeys(address);
    }

    public void selectState (String state) {
        addressField.sendKeys(state);
    }

    public void selectCity (String city) {
        addressField.sendKeys(city);
    }

    public void clickOnSubmitButton() {
        submitButton.click();
    }

    @FindBy(className = "modal-dialog")
    public WebElement submitingForm;







}
