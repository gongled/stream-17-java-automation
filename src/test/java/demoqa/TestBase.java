package demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.CheckingFormPage;

public class TestBase {
    CheckingFormPage checkingFormPage = new CheckingFormPage();

    @BeforeAll
    static void beforeAll (){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }
}
