package lesson_12.tests;


import lesson_12.pages.RegistrationFormPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class AutomationPracticeForm {

    RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    TestData testData = new TestData();

    @Test
    @Tag("form")
    void formTest(){

    }
}
