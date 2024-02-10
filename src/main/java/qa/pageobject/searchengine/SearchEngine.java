package qa.pageobject.searchengine;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import qa.base.BasePage;

public class SearchEngine extends BasePage {

    public SearchEngine(AndroidDriver driver) {

        super(driver);
    }

    @FindBy(id = "ocean-mobile-search-2")
    WebElement searchField;

    @FindBy(className = "searchform-submit") //button //button/i xpaths
    WebElement searchButton;

    public void setPhrase(String phrase) {

        getWebDriverWait().until(ExpectedConditions.visibilityOf(searchField)).sendKeys(phrase);
    }

    public void tapSearchButton() {

        getWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchButton)).click();
    }
}
