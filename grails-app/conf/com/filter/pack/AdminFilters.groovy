package com.filter.pack

class AdminFilters {

    def filters = {
        all(controller: '*', action: '*') {
            before = {
                println("Admin Filters invoked")
            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }
    }
}
