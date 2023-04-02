package lesson_9.tests;

import com.codeborne.selenide.Configuration;
import lesson_9.pages.StepOnePage;
import lesson_9.pages.StepTwoPage;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class CreditCalculatorTests extends TestBase {

    StepOnePage stepOnePage = new StepOnePage();
    StepTwoPage stepTwoPage = new StepTwoPage();

    static Stream<Arguments> writeFormApplicationLoanMethodSource(){
        return Stream.of(
                Arguments.of("Жиренок", "Антон", "Александрович","9628802211","mail@mail.ru"),
                Arguments.of("Лишута", "Николай", "Алексеевич","9628802222","test@mail.ru")
        );
    }

    @ValueSource(strings = {
            "9628802211", "9628802222"
    })
    @ParameterizedTest()
    public void writeFormApplicationLoanValueSource(String testData){
        stepOnePage.verifyHeaderStepOne("Заявка на кредит наличными или рефинансирование");
        stepOnePage.setLastName("Жиренок");
        stepOnePage.setFirstName("Антон");
        stepOnePage.setMiddleName("Александрович");
        stepOnePage.setPhone(testData);
        stepOnePage.setEmail("mail@mail.ru");
        stepOnePage.setConfirmedCheckbox();
        stepOnePage.clickContinueButton();
        stepTwoPage.verifyHeaderStepTwo("Заявка на кредит наличными или рефинансирование");
    }

    @CsvSource(value = {
            "Жиренок,    Антон,     Александрович",
            "Лишута,     Николай,   Алексеевич",
            "Богданова,  Анастасия, Игоревна"
    })
    @ParameterizedTest()
    public void writeFormApplicationLoanCsvSource(String lastName, String firstName, String middleName){
        stepOnePage.verifyHeaderStepOne("Заявка на кредит наличными или рефинансирование");
        stepOnePage.setLastName(lastName);
        stepOnePage.setFirstName(firstName);
        stepOnePage.setMiddleName(middleName);
        stepOnePage.setPhone("9628802211");
        stepOnePage.setEmail("mail@mail.ru");
        stepOnePage.setConfirmedCheckbox();
        stepOnePage.clickContinueButton();
        stepTwoPage.verifyHeaderStepTwo("Заявка на кредит наличными или рефинансирование");
    }

    @MethodSource()
    @ParameterizedTest()
    public void writeFormApplicationLoanMethodSource(String lastName, String firstName, String middleName,String phone, String email){
        stepOnePage.verifyHeaderStepOne("Заявка на кредит наличными или рефинансирование");
        stepOnePage.setLastName(lastName);
        stepOnePage.setFirstName(firstName);
        stepOnePage.setMiddleName(middleName);
        stepOnePage.setPhone(phone);
        stepOnePage.setEmail(email);
        stepOnePage.setConfirmedCheckbox();
        stepOnePage.clickContinueButton();
        stepTwoPage.verifyHeaderStepTwo("Заявка на кредит наличными или рефинансирование");
    }
}