
package at.co.boris.driverutil

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.RemoteWebDriver
import java.net.URI

class RemoteChromeWebDriverFactory : RemoteWebDriverFactory() {

    override fun createDriver(): WebDriver {

        caps.browserName = "chrome"

        val options = ChromeOptions()
        options.merge(caps)

        webDriver = RemoteWebDriver(URI.create("${ getRemoteTestingServer()}/wd/hub").toURL(), options)
        webDriver.manage().window().maximize()

        return webDriver
    }

}
