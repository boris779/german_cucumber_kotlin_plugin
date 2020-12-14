package at.co.boris.driverutil

import logger

class PageNotFoundException(s: String) : Throwable() {

    private val log by logger()

    init {
        log.error(s)
    }


}
