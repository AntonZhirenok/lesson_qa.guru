package lesson_11.tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import lesson_11.pages.MainPage;
import lesson_11.pages.ProjectIssuesPage;
import lesson_11.pages.SearchPage;
import lesson_11.pages.UserProjectPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;


import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;


public class Tests extends TestBase{

    private static final String REPOSITIRY = "AntonZhirenok/lesson_qa.guru";
    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();
    UserProjectPage userProjectPage = new UserProjectPage();
    ProjectIssuesPage projectIssuesPage = new ProjectIssuesPage();

    @Test
    @Story("Issue")
    @Owner("Zhirenok Anton")
    @Severity(SeverityLevel.NORMAL)
    public void testIssueSearch(){
        $(".header-search-input").click();
        $(".header-search-input").setValue(REPOSITIRY);
        $(".header-search-input").submit();
        $(linkText(REPOSITIRY)).click();
        $("#issues-tab").click();
        $(withText("New Issue")).should(Condition.exist);
    }

    @Test
    @Story("Issue")
    @Owner("Zhirenok Anton")
    @Severity(SeverityLevel.NORMAL)
    public void testIssueSearchLambda(){
        step("Ищем репозиторий " + REPOSITIRY, ()->{
            $(".header-search-input").click();
            $(".header-search-input").setValue(REPOSITIRY);
            $(".header-search-input").submit();
        });
        step("кликаем по репозиторию " + REPOSITIRY,() ->{
            $(linkText(REPOSITIRY)).click();
        });
        step("Кликаем по вкладке issue", ()->{
            $("#issues-tab").click();
        });
        step("Проверяем наличие issue New Issue",()->{
            $(withText("New Issue")).should(Condition.exist);
        });
    }

    @Test
    @DisplayName("Проверка наличия issue: New Issue")
    @Story("Issue")
    @Owner("Zhirenok Anton")
    @Severity(SeverityLevel.NORMAL)
    @ValueSource()
    public void testIssueSearchWithStep(){
        mainPage.clickSearch()
                .setSearch(REPOSITIRY)
                .submitSearch();
        searchPage.clickFirstRepository(REPOSITIRY);
        userProjectPage.clickIssueButton();
        projectIssuesPage.verifyIssue("New Issue");
    }
}
