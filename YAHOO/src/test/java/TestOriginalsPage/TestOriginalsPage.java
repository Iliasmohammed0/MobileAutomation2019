package TestOriginalsPage;

import HomePage.HomePage;
import OriginalsPage.OriginalsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOriginalsPage extends OriginalsPage {
    HomePage HomePage;
    OriginalsPage OriginalsPage;
    @BeforeMethod
    public void initElements() throws InterruptedException {
        OriginalsPage = PageFactory.initElements(ad, OriginalsPage.class);
        HomePage = PageFactory.initElements(ad, HomePage.class);
        HomePage.clickOriginalOption();
        Thread.sleep(4000);
    }

    @Test
    public void testOriginalsTopStory(){ clickOriginalsFirstStory(); }
    @Test
    public void testOriginalTopStoryText(){ getOriginalTopStoryText(); }
    @Test
    public void testOriginalStorySize(){ getSizeOriginalStory(); }
    @Test
    public void testTagNameOriginalStory(){ getTagOriginalStory(); }
    @Test
    public void testOriginalStoryLocation(){ getFirstOriginalsStoryLocation(); }

}
