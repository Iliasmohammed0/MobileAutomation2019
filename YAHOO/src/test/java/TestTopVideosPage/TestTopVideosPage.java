package TestTopVideosPage;

import HomePage.HomePage;
import TopVideosPage.TopVideosPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTopVideosPage extends TopVideosPage {
    HomePage HomePage;
    TopVideosPage TopVideosPage;
    @BeforeMethod
    public void initElements() throws InterruptedException {
        TopVideosPage = PageFactory.initElements(ad, TopVideosPage.class);
        HomePage = PageFactory.initElements(ad, HomePage.class);
        HomePage.clickTopVideos();
        Thread.sleep(4000);
    }
    @Test
    public void testVideoTitleText(){
    checkVideoTitleText();
    }
    @Test
    public void testPlayFirstVideo(){
        clickFirstVideo();
    }
    @Test
    public void testFirstVideoText(){
        getFirstVideoText();
    }
    @Test
    public void testFirstVideoSize(){
        getFirstVideoSize();
    }
    @Test
    public void testFirstVideoTagName(){
        getFirstVideoTagName();
    }
    @Test
    public void testFirstVideoLocation(){ getTrendingFirstVideoLocation(); }
}