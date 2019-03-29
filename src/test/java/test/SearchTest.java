package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.NextPageWithResults;
import page.SearchPage;
import page.StartPage;

import java.util.List;

public class SearchTest extends BaseTest {

    @Test
    public void basicSearchTest (){
        String searchTerm = "Selenium";

        Assert.assertTrue(startPage.isPageLoaded(), "Start page is not loaded.");

        SearchPage searchPage = startPage.search(searchTerm);
        Assert.assertTrue(searchPage.isPageLoaded(), "Search page is not loaded.");

        Assert.assertEquals(searchPage.getSearchResultCount(), 9,
                "Search results count is wrong.");

        List<String> SearchResultsList = searchPage.getSearchResultsList();

        for(String searchResult : SearchResultsList) {
            Assert.assertTrue(searchResult.contains(searchTerm),
                    "SearchTerm: "+searchTerm+" not found in: \n"+searchResult);
        }

        NextPageWithResults nextPageWithResults = searchPage.clickSecondPage();
        Assert.assertTrue(nextPageWithResults.isPageLoaded(), "Next search page is not loaded.");

        Assert.assertEquals(nextPageWithResults.getSearchResultCount(), 10,
                "Search results count is wrong.");

        List<String> SearchResultsList2 = nextPageWithResults.getSearchResultsList();

        for(String searchResult : SearchResultsList2) {
            Assert.assertTrue(searchResult.contains(searchTerm),
                    "SearchTerm: "+searchTerm+" not found in: \n"+searchResult);
        }
    }
}
