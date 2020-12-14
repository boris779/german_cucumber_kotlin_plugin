package at.co.boris.step_definitions

import assertk.assertThat
import assertk.assertions.isTrue
import  at.co.boris.pageobjects.WikipediaPage

class WikipediaSteps(testDataContainer: TestDataContainer) : AbstractStepDefs(testDataContainer) {

    init {
        Dann("the searchbar is visible") {
            assertThat(getPage(WikipediaPage::class).isSearchbarPresent(), "Searchbar is not present").isTrue()

        }
    }
}
