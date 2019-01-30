package TestTrendingPage;

import HomePage.HomePage;
import TrendingPage.TrendingPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTrendingPage extends TrendingPage {
    HomePage HomePage;
    TrendingPage TrendingPage;
    @BeforeMethod
    public void initElements() throws InterruptedException {
        TrendingPage = PageFactory.initElements(ad, TrendingPage.class);
        HomePage = PageFactory.initElements(ad, HomePage.class);
        HomePage.clickTrending();
        Thread.sleep(4000);
    }
    @Test
    public void testTrendingTitleText(){ checkTrendingText(); }
    @Test
    public void testTrendingArticle(){
        clickTrendingArictle();
    }
    @Test
    public void testTrendingArticleText(){
        getTrendingArticleText();
    }
    @Test
    public void testTrendingArticleSize(){
        getTrendingArticleSize();
    }
    @Test
    public void testTrendingArticleTagName(){
        getTrendingArticleTagName();
    }
    @Test
    public void testTrendingArticleLocation(){ getTrendingArticleLocation(); }
}
