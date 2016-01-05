package com.service.pack

import com.domain.pack.Role
import grails.transaction.Transactional

@Transactional
class BootstrapService {

    def serviceMethod() {

    }

    def createUserRoles() {
        def adminRole = new Role(authority: 'ROLE_ADMIN').save(flush: true)
        def userRole = new Role(authority: 'ROLE_USER').save(flush: true)
    }
}
