package Components;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class Base {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        System.out.println("\n\n### @BeforeAll\n");
    }
    @AfterAll
    static void afterAll() {
        System.out.println("\n### @AfterAll");
        System.out.println("Code JUnit5 a finded\n\n");
    }
}
