package lesson_4;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class OpenSoftAssertionsTest {
    @Test
    public void openSoftAssertions(){

        String str = "@ExtendWith({SoftAssertsExtension.class})\n" +
                "class Tests {\n" +
                "  @Test\n" +
                "  void test() {\n" +
                "    Configuration.assertionMode = SOFT;\n" +
                "    open(\"page.html\");\n" +
                "\n" +
                "    $(\"#first\").should(visible).click();\n" +
                "    $(\"#second\").should(visible).click();\n" +
                "  }\n" +
                "}";

        Configuration.browserSize = "1920x1080";

        open("https://github.com/");
        $("[aria-label=\"Search GitHub\"]").setValue("Selenide").pressEnter();
        $(".repo-list .v-align-middle").click();
        $("#wiki-tab").click();
        $(".wiki-more-pages-link button").click();
        $(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(text("3. Using JUnit5 extend test class:"));
        $(".markdown-body").shouldHave(text(str));
    }
}
