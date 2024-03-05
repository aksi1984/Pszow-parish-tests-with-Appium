package mainmenu.main;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import base.DropdownListTest;
import qa.enums.URLs;
import qa.pageobject.menu.MainDropdownList;

@Epic("E2E")
@Feature("Main dropdown list links")
public class LinksTest extends DropdownListTest {
    private MainDropdownList mainDropdownList;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        mainDropdownList = new MainDropdownList(getDriver());
    }

    @Test
    @Parameters("announcementsURL")
    @QaseId(4)
    @QaseTitle("The \"Ogłoszenia duszpasterskie\" link")
    @Description("The \"Ogłoszenia duszpasterskie\" link")
    public void announcementsLink(String announcementsURL) {

        mainDropdownList.touchAnnouncementsLink();
        waitForUrl(announcementsURL, "Incorrect url");
    }

    @Test
    @Parameters("intentionsURL")
    @QaseId(5)
    @QaseTitle("The \"Intencje mszalne\" link")
    @Description("The \"Intencje mszalne\" link")
    public void intentionsLink(String intentionsURL) {

        mainDropdownList.touchIntentionsLink();
        waitForUrl(intentionsURL, "Incorrect url");
    }

    @Test
    @Parameters("funeralsURL")
    @QaseId(6)
    @QaseTitle("The \"Pogrzeby\" link")
    @Description("The \"Pogrzeby\" link")
    public void funeralsLink(String funeralsURL) {

        mainDropdownList.touchFuneralsLink();
        waitForUrl(funeralsURL, "Incorrect url");
    }

    @Test
    @Parameters("stewardsURL")
    @QaseId(7)
    @QaseTitle("The \"Szafarze\" link")
    @Description("The \"Szafarze\" link")
    public void stewardsLink(String stewardsURL) {

        mainDropdownList.touchStewardsLink();
        waitForUrl(stewardsURL, "Incorrect url");
    }

    @Test
    @Parameters("priestsURL")
    @QaseId(8)
    @QaseTitle("The \"Duszpasterze\" link")
    @Description("The \"Duszpasterze\" link")
    public void priestsLink(String priestsURL) {

        mainDropdownList.touchPriestsLink();
        waitForUrl(priestsURL, "Incorrect url");
    }

    @Test
    @Parameters("confessionURL")
    @QaseId(9)
    @QaseTitle("The \"Spowiedź\" link")
    @Description("The \"Spowiedź\" link")
    public void confessionLink(String confessionURL) {

        mainDropdownList.touchConfessionLink();
        waitForUrl(confessionURL, "Incorrect url");
    }

    @Test
    @Parameters("officeURL")
    @QaseId(10)
    @QaseTitle("The \"Kancelaria\" link")
    @Description("The \"Kancelaria\" link")
    public void officeLink(String officeURL) {

        mainDropdownList.touchOfficeLink();
        waitForUrl(officeURL, "Incorrect url");
    }
}
