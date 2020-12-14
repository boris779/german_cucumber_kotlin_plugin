package at.co.boris.pageobjects

import at.co.boris.driverutil.WebDriverSession
import org.openqa.selenium.WebDriver


open class AbstractPage(val session: WebDriverSession) {

    protected val webDriver: WebDriver
        get() = session.webDriver


    init {
        session.activate(page = this)
    }


}
