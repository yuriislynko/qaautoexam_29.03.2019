package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class NextPageWithResults extends BasePage{

    @FindBy(xpath = "//td[@class='cur' and text()='2']")
    private WebElement nextPageIndex;

    @FindBy(xpath = "//div[@class='g']")
    private List<WebElement> searchResultElements;

    public NextPageWithResults(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isPageLoaded() {
        return nextPageIndex.isDisplayed();
    }

    public int getSearchResultCount () {
        return searchResultElements.size();
    }

    public List<String> getSearchResultsList() {
        List<String> searchResultsList = new ArrayList<String>();
        for (WebElement searchResult : searchResultElements) {
            String searchResultText = searchResult.getText();
            searchResultsList.add(searchResultText);
        }
        return searchResultsList;
    }
}
