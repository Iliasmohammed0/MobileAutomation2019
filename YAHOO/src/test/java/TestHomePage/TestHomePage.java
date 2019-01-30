package TestHomePage;

import HomePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage{
    HomePage homePage;
    @BeforeMethod
    public void initElements(){
        homePage = PageFactory.initElements(ad, HomePage.class); }
    @Test
    public void testAccountButton(){ clickAccountButton();}
    @Test
    public void  testTitleButton(){ clickTitle(); }
    @Test
    public void getTitleText(){ getTitleValues(); }
    @Test
    public void testTopStories(){ clickTopStories(); }
    @Test
    public void testTopStoriesTexts(){ getTopStoriesText(); }
    @Test
    public void testTopVideos(){ clickTopVideos(); }
    @Test
    public void testTopVideosTexts(){ getTopVideosText(); }
    @Test
    public void testOriginalsLink(){clickOriginalOption(); }
    @Test
    public void testOriginalsText(){ getOriginalsText(); }
    @Test
    public void testTrendingLink(){clickTrending(); }
    @Test
    public void testTrendingText(){ getTrendingText(); }
    @Test
    public void testSearchButton(){
        clickHomePageSearch();
    }
    @Test
    public void testSearch() { clickHomePageSearch();searchBar("Sports"); }
}
