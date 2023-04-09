package lesson_11.pages;

import io.qameta.allure.Step;


import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.linkText;

public class SearchPage {

    @Step
    public SearchPage clickFirstRepository( String repository ){
        $(linkText(repository)).click();
        return this;
    }
}
