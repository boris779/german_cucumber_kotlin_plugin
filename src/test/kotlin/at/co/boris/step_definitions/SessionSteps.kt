package at.co.boris.step_definitions

import assertk.assertThat
import assertk.assertions.endsWith
import assertk.assertions.isEqualTo
import at.co.boris.pageobjects.MainPage
import at.co.boris.pageobjects.PageUrls

class SessionSteps(testDataContainer: TestDataContainer) : AbstractStepDefs(testDataContainer) {


    init {
        Wenn("the start page for {string} is loaded") { sessionID: String ->
            getWebDriverSession(sessionID).gotoUrl(PageUrls.HOME, MainPage::class, testDataContainer)
        }

        Wenn("{string} is activated") { sessionID: String ->
            getWebDriverSession(sessionID)
        }

        Dann("{string} should be still on start page") { sessionID: String ->
            assertThat(getWebDriverSession(sessionID).webDriver.currentUrl).isEqualTo((testDataContainer.getTestData("baseurl") as String) + "/")
        }

        Dann("the active session should contain {int} window") { expCount: Int ->
            assertThat(getWebDriverSession().webDriver.windowHandles.size).isEqualTo(expCount)
        }

        Dann("{string} should be still on software testing") { sessionID: String ->
            assertThat(getWebDriverSession(sessionID).webDriver.currentUrl).endsWith("/Software_testing")
        }


    }
}
