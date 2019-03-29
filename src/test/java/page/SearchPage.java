package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class SearchPage extends BasePage{

    @FindBy(xpath = "//div[@id='resultStats']")
    private WebElement searchResultStats;

    @FindBy(xpath = "//div[@class='g']")
    private List <WebElement> searchResultElements;

    @FindBy(xpath = "//a[@aria-label='Page 2']")
    private WebElement linkToSecondResultsPage;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isPageLoaded() {
        return searchResultStats.isDisplayed()
                &&driver.getCurrentUrl().contains("/search?")
                &&driver.getTitle().contains("Selenium");
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

    public NextPageWithResults clickSecondPage (){
        linkToSecondResultsPage.click();
        return new NextPageWithResults (driver);
    }
}
