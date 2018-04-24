package org.seleniumhq;

import com.codeborne.selenide.Configuration;
import org.seleniumhq.page.objects.SeleniumHqPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

public class NavigationTests {

    @BeforeClass
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.seleniumhq.org";
    }

    @Test
    public void projectsPageShouldOpen() {
        open(baseUrl, SeleniumHqPage.class).goToProjects();
    }

    @Test
    public void downloadsPageShouldOpen() {
        open(baseUrl, SeleniumHqPage.class).goToDownload();
    }

    @Test
    public void documentationPageShouldOpen() {
        open(baseUrl, SeleniumHqPage.class).goToDocumentation();
    }

    @Test
    public void supportPageShouldOpen() {
        open(baseUrl, SeleniumHqPage.class).goToSupport();
    }

    @Test
    public void aboutPageShouldOpen() {
        open(baseUrl, SeleniumHqPage.class).goToAbout();
    }
}
