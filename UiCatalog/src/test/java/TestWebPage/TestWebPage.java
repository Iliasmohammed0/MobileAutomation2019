package TestWebPage;

import WebPage.WebPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestWebPage extends WebPage {
    WebPage webPage;
    @BeforeMethod
    public void initElements(){
        webPage = PageFactory.initElements(ad, WebPage.class); }
    @Test
    public void clickWebsite(){
        webHome();
    }
}

