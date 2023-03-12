package lesson_7.tests;

import lesson_7.pages.RegistrationFormPage;
import org.junit.jupiter.api.Test;

public class AutomationPracticeForm {

    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    @Test
    void formTest(){
        registrationFormPage.openPage()
                .setFirstName("Zhirenok")
                .setLastName("Anton")
                .setUserEmail("zhirenok@list.ru")
                .setOther()
                .setUserNumber("8962880222")
                .setDateOfBirth("1997","May","13")
                .setSubjects("English")
                .setHobbiesSports()
                .setPictureLoading()
                .setAddress("Lenina street 174")
                .setState("NCR")
                .setCity("Noida")
                .submit()
                .verifyModal()
                .verifyResult("Student Name","Zhirenok Anton")
                .verifyResult("Student Email","zhirenok@list.ru")
                .verifyResult("Gender","Other")
                .verifyResult("Mobile","8962880222")
                .verifyResult("Date of Birth","13 May,1997")
                .verifyResult("Subjects","English")
                .verifyResult("Hobbies","Sports")
                .verifyResult("Picture","123.png")
                .verifyResult("Address","Lenina street 174")
                .verifyResult("State and City","NCR Noida");
    }
}
