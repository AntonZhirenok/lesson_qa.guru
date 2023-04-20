package lesson_13.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

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

    @Step("Открыть страницу /automation-practice-form")
    public RegistrationFormPage openPage(){
        open("https://demoqa.com/automation-practice-form");
        return this;
    }

    @Step("закрыть рекламный баннер")
    public RegistrationFormPage removeBanner(){
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    @Step("Ввести значениев поле Имя {firstName}")
    public RegistrationFormPage setFirstName(String firstName){
        firstNameInput.setValue(firstName);
        return this;
    }

    @Step("Ввести значение в поле Фамилия {lastName}")
    public RegistrationFormPage setLastName(String lastName){
        lastNameInput.setValue(lastName);
        return this;
    }

    @Step("Ввести значение в поле Email {userEmail}")
    public RegistrationFormPage setUserEmail(String userEmail){
        userEmailInput.setValue(userEmail);
        return this;
    }

    @Step("Выбрать гендер")
    public RegistrationFormPage setGender(String gender){
        $(byText(gender)).click();
        return this;
    }

    @Step("Ввести значение в поле телефон {userNumber}")
    public RegistrationFormPage setUserNumber(String userNumber){
        userNumberInput.setValue(userNumber);
        return this;
    }

    @Step("Выбрать дату {day} {month} {year}")
    public RegistrationFormPage setDateOfBirth(String year, String month, String day){
        $(".react-datepicker-wrapper").click();
        calendarComponent.setData(year, month, day);
        return this;
    }

    @Step("Выюрать субьект")
    public RegistrationFormPage setSubjects(String subjects){
        subjectsInput.setValue(subjects).pressEnter();
        return this;
    }

    @Step("Выбрать хобби")
    public RegistrationFormPage setHobbies(String hobbies){
        $(byText(hobbies)).parent().click();
        return this;
    }

    @Step("Загрузить фото")
    public RegistrationFormPage setPictureLoading(String path){
        pictureLoading.uploadFromClasspath(path);
        return this;
    }

    @Step("Заполнить поле адрес {address}")
    public RegistrationFormPage setAddress(String address){
        addressInput.setValue(address);
        return this;
    }

    @Step("Выбрать область {state}")
    public RegistrationFormPage setState(String state){
        $("#state").click();
        $(byText(state)).click();
        return this;
    }

    @Step("Выбрать город {city}")
    public RegistrationFormPage setCity(String city){
        $("#city").click();
        $(byText(city)).click();
        return this;
    }

    @Step("Нажать кнопку")
    public RegistrationFormPage submit(){
        submitButton.click();
        return this;
    }

    @Step("Проверить заголовок формы")
    public RegistrationFormPage verifyModal(){
        resultModal.verifyModal();
        return this;
    }

    @Step("Проверить значение в форме {value}")
    public RegistrationFormPage verifyResult(String key, String value){
        resultModal.verifyResult(key, value);
        return this;
    }
}
