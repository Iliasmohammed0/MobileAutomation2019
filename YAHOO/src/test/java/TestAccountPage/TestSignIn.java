package TestAccountPage;

import AccountPage.AccountPage;
import AccountPage.SignIn;
import HomePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class TestSignIn extends SignIn {
    HomePage HomePage;
    AccountPage AccountPage;

    @BeforeMethod
    public void initElements() throws InterruptedException {
        AccountPage = PageFactory.initElements(ad, AccountPage.class);
        HomePage = PageFactory.initElements(ad, HomePage.class);
        HomePage.clickAccountButton();
        AccountPage.clickSignInButton();
        Thread.sleep(4000);
    }

}
