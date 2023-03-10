package lesson_8.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormPage {

    CalendarComponent calendarComponent = new CalendarComponent();
    ResultModal resultModal = new ResultModal();

    private SelenideElement
            firstNameInput  = $("#firstName"),
            lastNameInput  = $("#lastName"),
            userEmailInput  = $("#userEmail"),
            userNumberInput  = $("#userNumber"),
            subjectsInput = $("#subjectsInput"),
            pictureLoading = $("#uploadPicture"),
            addressInput = $("#currentAddress"),
            submitButton = $("#submit");

    public RegistrationFormPage openPage(){
        open("https://demoqa.com/automation-practice-form");
        return this;
    }

    public RegistrationFormPage removeBanner(){
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public RegistrationFormPage setFirstName(String firstName){
        firstNameInput.setValue(firstName);
        return this;
    }

    public RegistrationFormPage setLastName(String lastName){
        lastNameInput.setValue(lastName);
        return this;
    }

    public RegistrationFormPage setUserEmail(String userEmail){
        userEmailInput.setValue(userEmail);
        return this;
    }

    public RegistrationFormPage setGender(String gender){
        $(byText(gender)).click();
        return this;
    }

    public RegistrationFormPage setUserNumber(String userNumber){
        userNumberInput.setValue(userNumber);
        return this;
    }

    public RegistrationFormPage setDateOfBirth(String year, String month, String day){
        $(".react-datepicker-wrapper").click();
        calendarComponent.setData(year, month, day);
        return this;
    }

    public RegistrationFormPage setSubjects(String subjects){
        subjectsInput.setValue(subjects).pressEnter();
        return this;
    }

    public RegistrationFormPage setHobbies(String hobbies){
        $(byText(hobbies)).parent().click();
        return this;
    }

    public RegistrationFormPage setPictureLoading(String path){
        pictureLoading.uploadFromClasspath(path);
        return this;
    }

    public RegistrationFormPage setAddress(String address){
        addressInput.setValue(address);
        return this;
    }

    public RegistrationFormPage setState(String state){
        $("#state").click();
        $(byText(state)).click();
        return this;
    }

    public RegistrationFormPage setCity(String city){
        $("#city").click();
        $(byText(city)).click();
        return this;
    }

    public RegistrationFormPage submit(){
        submitButton.click();
        return this;
    }

    public RegistrationFormPage verifyModal(){
        resultModal.verifyModal();
        return this;
    }

    public RegistrationFormPage verifyResult(String key, String value){
        resultModal.verifyResult(key, value);
        return this;
    }
}
