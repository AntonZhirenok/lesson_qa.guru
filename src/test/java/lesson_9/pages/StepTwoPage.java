package lesson_9.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class StepTwoPage {

    private SelenideElement
            headerStepTwo = $("h2");

    public StepTwoPage verifyHeaderStepTwo(String header){
        headerStepTwo.shouldHave(text(header));
        return this;
    }
}