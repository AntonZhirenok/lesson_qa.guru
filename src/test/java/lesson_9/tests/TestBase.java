package lesson_9.tests;

import com.codeborne.selenide.Configuration;
import lesson_9.pages.StepOnePage;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {

    StepOnePage stepOnePage = new StepOnePage();
    @BeforeEach
    public void before() {
        Configuration.browserSize = "2560x1440";
        stepOnePage.openPage();
    }
}
