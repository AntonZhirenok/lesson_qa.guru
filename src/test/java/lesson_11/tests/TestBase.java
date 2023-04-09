package lesson_11.tests;

import com.codeborne.selenide.Configuration;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import lesson_11.pages.MainPage;
import org.junit.jupiter.api.BeforeEach;

import static io.qameta.allure.Allure.step;

public class TestBase {

    MainPage mainPage = new MainPage();

    @BeforeEach
    public void before() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        Configuration.browserSize = "2560x1440";
            mainPage.openPage();
    }
}
