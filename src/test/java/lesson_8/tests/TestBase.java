package lesson_8.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {

    @BeforeEach
    public void before() {
        Configuration.browserSize = "1920x1080";
    }

}