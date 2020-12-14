package at.co.boris.step_definitions

import at.co.boris.pageobjects.WikipediaPage
import at.co.boris.pageobjects.PageUrls


class NavigationSteps(testDataContainer: TestDataContainer) : AbstractStepDefs(testDataContainer) {

    init {
        Angenommen("the start page is loaded") {
            getWebDriverSession().gotoUrl(PageUrls.HOME, WikipediaPage::class, testDataContainer)
        }

        Wenn("{string} opens software testing") { userid: String ->
            getWebDriverSession(userid).gotoUrl(PageUrls.SOFTWARETEST, WikipediaPage::class, testDataContainer)
        }

    }

}
