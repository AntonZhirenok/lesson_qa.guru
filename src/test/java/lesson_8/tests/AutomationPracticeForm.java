package lesson_8.tests;

import lesson_8.pages.RegistrationFormPage;
import org.junit.jupiter.api.Test;

public class AutomationPracticeForm {

    RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    TestData testData = new TestData();

    @Test
    void formTest(){
        registrationFormPage.openPage()
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
