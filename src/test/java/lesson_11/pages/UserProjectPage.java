package lesson_11.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class UserProjectPage {

    private SelenideElement issueButton = $("#issues-tab");

    @Step
    public UserProjectPage clickIssueButton(){
        issueButton.click();
        return this;
    }

}
