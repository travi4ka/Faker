package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.AutomationPracticeFormPage;

import java.util.Map;

public class TestsBase {
    AutomationPracticeFormPage automationPracticeFormPage = new AutomationPracticeFormPage();

    @BeforeAll
    public static void beforeAll() {
        Configuration.browser = "chrome";
        Configuration.browserVersion = "100.0";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));
        Configuration.browserCapabilities = capabilities;
    }
}
