package at.co.boris.pageobjects

import at.co.boris.driverutil.WebDriverSession
import at.co.boris.pageobjects.AbstractPage
import at.co.boris.pageobjects.MainPage
import org.openqa.selenium.By

class WikipediaPage(session: WebDriverSession) : MainPage(session)  {

    fun isSearchbarPresent(): Boolean {
        return webDriver.findElements(By.id("txtSearch")).size >= 1
    }


}
