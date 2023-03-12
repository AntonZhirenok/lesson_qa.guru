package lesson_8.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ResultModal {

    private SelenideElement
            titleResultModal = $("#example-modal-sizes-title-lg"),
            tableResultModal = $(".table-responsive");

    public void verifyModal(){
        titleResultModal.shouldHave(text("Thanks for submitting the form"));
    }

    public void verifyResult(String key, String value ){
        tableResultModal.$(byText(key)).parent().shouldHave(text(value));
    }
}