package TestAccountPage;

import AccountPage.AccountPage;
import HomePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAccountPage extends AccountPage {
    HomePage HomePage;
    AccountPage AccountPage;
    @BeforeMethod
    public void initElements() throws InterruptedException {
        AccountPage = PageFactory.initElements(ad, AccountPage.class);
        HomePage = PageFactory.initElements(ad, HomePage.class);
        HomePage.clickAccountButton();
        Thread.sleep(4000);
    }
    @Test
    public void testSignInButton(){ clickSignInButton(); }
    @Test
    public void testSignInText(){ signButtonText(); }
    @Test
    public void testNotifications(){ clickNotifications(); }
    @Test
    public void testNotificationsText(){ notificationsText(); }
    @Test
    public void testBookmark(){ clickBookmark(); }
    @Test
    public void testBookmarkText(){ bookmarkText(); }
    @Test
    public void testSettings(){ clickSettings(); }
    @Test
    public void testSettingsText(){ settingsText(); }
    @Test
    public void testHelp(){ clickHelp(); }
    @Test
    public void testHelpText(){ helpText(); }
    @Test
    public void testSendFeedback(){ clickSendFeedback(); }
    @Test
    public void testSendFeedbackText(){ sendFeedbackText(); }
    @Test
    public void testNotificationsLocation(){ notificationsLocation(); }
    @Test
    public void testBookmarkLocation(){ bookmarkLocation(); }
    @Test
    public void testSettingsLocation(){ settingsLocation(); }
    @Test
    public void testHelpLocation(){ helpLocation(); }
    @Test
    public void testSendFeedbackLocation(){ sendFeedbackLocation(); }
}
