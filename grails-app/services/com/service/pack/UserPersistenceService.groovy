package com.service.pack

import com.domain.pack.User
import grails.transaction.Transactional

@Transactional
class UserPersistenceService {

    def serviceMethod() {
println("UserPersistenceService >> serviceMethod :: start ")
    }

    public boolean createUser(User user) {
        boolean status = false
        println("UserPersist Service :: User Details :- " + user)
        if (user.save()) {
            user.save()
            status = true
        }
/*println user.errors.allErrors*/
        else {
            user.errors.each {
                println it
            }
        }
        status
    }
}
