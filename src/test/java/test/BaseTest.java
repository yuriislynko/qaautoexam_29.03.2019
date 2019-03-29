package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.StartPage;

public class BaseTest {

    private WebDriver driver;
    StartPage startPage;

    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\slynko_y\\IdeaProjects\\qaautoexam_29.03.2019\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        startPage = new StartPage(driver);
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
