package lesson_3;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AutomationPracticeForm {

    @Test
    public void formTest(){

        Configuration.browserSize = "1920x1080";

        open("https://demoqa.com/automation-practice-form");

        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        $("#firstName").setValue("Zhirenok");
        $("#lastName").setValue("Anton");
        $("#userEmail").setValue("zhirenok@list.ru");
        $(byText("Other")).click();
        $("#userNumber").setValue("8962880222");
        $(".react-datepicker-wrapper").click();
        $(".react-datepicker__month-select").$(byText("May")).click();
        $(".react-datepicker__year-select").$(byText("1997")).click();
        $(".react-datepicker__day--013").click();
        $("#subjectsInput").setValue("English").pressEnter();
        $(byText("Sports")).click();
        $("#hobbies-checkbox-3").parent().click();
        $("#uploadPicture").uploadFromClasspath("lesson_3\\123.png");
        $("#currentAddress").setValue("Lenina street 174");
        $("#state").click();
        $(byText("NCR")).click();
        $("#city").click();
        $(byText("Noida")).click();
        $("#submit").click();

        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".modal-body").shouldHave(text("Zhirenok Anton"));
        $(".modal-body").shouldHave(text("zhirenok@list.ru"));
        $(".modal-body").shouldHave(text("Other"));
        $(".modal-body").shouldHave(text("8962880222"));
        $(".modal-body").shouldHave(text("13 May,1997"));
        $(".modal-body").shouldHave(text("English"));
        $(".modal-body").shouldHave(text("Sports, Music"));
        $(".modal-body").shouldHave(text("123.png"));
        $(".modal-body").shouldHave(text("Lenina street 174"));
        $(".modal-body").shouldHave(text("NCR Noida"));
        $("#closeLargeModal").click();

    }
}
