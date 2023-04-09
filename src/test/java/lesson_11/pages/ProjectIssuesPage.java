package lesson_11.pages;

import com.codeborne.selenide.Condition;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class ProjectIssuesPage {

    @Step
    public ProjectIssuesPage verifyIssue(String issue){
        $(withText(issue)).should(Condition.exist);
        return this;
    }
}
