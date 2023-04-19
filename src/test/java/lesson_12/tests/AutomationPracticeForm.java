package lesson_12.tests;

import lesson_12.pages.RegistrationFormPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class AutomationPracticeForm extends TestBase {

    RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    TestData testData = new TestData();

    @Test
    @Tag("lesson12")
    void formTest(){
        open("/automation-practice-form" );
        registrationFormPage
                .removeBanner()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setUserEmail(testData.email)
                .setGender(testData.gender)
                .setUserNumber(testData.phoneNumber)
                .setDateOfBirth(testData.year, testData.month,testData.day)
                .setSubjects(testData.subject)
                .setHobbies(testData.hobby)
                .setPictureLoading(testData.uploadFile)
                .setAddress(testData.address)
                .setState(testData.state)
                .setCity(testData.cite)
                .submit()
                .verifyModal()
                .verifyResult("Student Name",testData.firstName + " " + testData.lastName)
                .verifyResult("Student Email",testData.email)
                .verifyResult("Gender",testData.gender)
                .verifyResult("Mobile",testData.phoneNumber)
                .verifyResult("Date of Birth",testData.day + " " + testData.month + "," + testData.year)
                .verifyResult("Subjects",testData.subject)
                .verifyResult("Hobbies",testData.hobby)
                .verifyResult("Picture","123.png")
                .verifyResult("Address",testData.address)
                .verifyResult("State and City",testData.state + " " + testData.cite);
    }
}
