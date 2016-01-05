package e.comm

import grails.plugin.springsecurity.annotation.Secured

class DashboardController {

    @Secured('ROLE_ADMIN')
    def index() {
    }
}
