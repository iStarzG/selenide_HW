package selenide;

import Components.Base;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTests extends Base {

    @Test
    public void searchCodeJUnit5 () {
        open("https://github.com"); // Открытие гита
        $(".header-search-button > .flex-1").click(); // Открытие поискового окна
        $("#query-builder-test").setValue("Selenide").pressEnter(); // Поиск селенида
        $x("//em[contains(.,'selenide')]").click();// Выбор селенида
        $("#wiki-tab").click();// Выбор вики
        $("#wiki-clone-url").scrollIntoView(false);//Скролл до     Show 3 more pages…
        $(".js-wiki-more-pages-link").click();// Нажатие     Show 3 more pages…
        $(".Box-row:nth-child(18) .Truncate-text").click();//Нажатие SoftAssertions
        $("#user-content-without-soft-assertions-you-will-get-report").scrollIntoView(false); // Скролл до кода JUnit5
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class")); // Проверка наличия кода JUnit5
    }

}
