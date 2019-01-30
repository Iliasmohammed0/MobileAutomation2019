package TestTopStoriesPage;

import HomePage.HomePage;
import TopStoriesPage.TopStoriesPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTopStoriesPage extends TopStoriesPage{
    TopStoriesPage TopStoriesPage;
    @BeforeMethod
    public void initElements(){
        TopStoriesPage = PageFactory.initElements(ad, TopStoriesPage.class);
    }
    @Test
    public void testFirstStory(){ clickFirstStory(); }
    @Test
    public void testFirstStoryText(){ getFirstHeadlineText(); }
    @Test
    public void testSecondStory(){ clickSecondStory(); }
    @Test
    public void testSecondStoryText(){
        getSecondHeadlineText();
    }
    @Test
    public void testThirdStory(){
        clickThirdStory();
    }
    @Test
    public void testThirdStoryText(){
        getThirdHeadlineText();
    }
    @Test
    public void testShare(){
        clickShare(); }
    @Test
    public void testBookmark(){
        clickBookmark(); }
}
