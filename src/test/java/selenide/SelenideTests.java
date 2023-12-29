package selenide;

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

public class SelenideTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000;
        System.out.println("\n\n### @BeforeAll\n");
    }
    @AfterAll
    static void afterAll() {
        System.out.println("\n### @AfterAll");
        System.out.println("Code JUnit5 a finded\n\n");
    }

    @Test
    public void searchCodeJUnit5 () {
        open("https://github.com"); // Открытие гита
        $(".header-search-button > .flex-1").click(); // Открытие поискового окна
        $("#query-builder-test").setValue("Selenide").pressEnter(); // Поиск селенида
        $x("//em[contains(.,'selenide')]").click(); // Выбор селенида
        $("#wiki-tab").click(); // Открытие вики
        $("#wiki-body").$(byText("Soft assertions")); // Поиск Soft assertions
        $("li:nth-child(8) > .internal").click(); // Открытие Soft assertions
        $(".highlight:nth-child(21").$(".octicon:nth-child(1)").scrollIntoView(false); // Скролл до кода JUnit5
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class")); // Проверка наличия кода JUnit5


















    }

}
