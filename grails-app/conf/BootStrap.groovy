import com.domain.pack.Role
import com.domain.pack.User
import com.domain.pack.UserRole
import com.service.pack.UserPersistenceService

class BootStrap {

    UserPersistenceService userPersistenceService
    def bootstrapService
    def springSecurityService
    def init = { servletContext ->
        boolean persistenceStatus
        println("BootStrap >> init()")

        def adminRole = new Role('ROLE_ADMIN').save()
        def userRole = new Role('ROLE_USER').save()

        def adminUser = new User('admin', springSecurityService.encodePassword('admin'), "Admin-FirstName", "Admin-LastName", true, false, false, false)
         persistenceStatus = userPersistenceService.createUser(adminUser);

        println("BootStrap >> init() status :: " + persistenceStatus)

        def normalUser = new User('normal',springSecurityService.encodePassword('normal'), "Normal-FirstName", "Normal-LastName", true, false, false, false)
        persistenceStatus = userPersistenceService.createUser(normalUser);

        println("BootStrap >> init() status :: " + persistenceStatus)

        UserRole.create adminUser, adminRole, true
        UserRole.create normalUser, userRole, true

    }
    def destroy = {
    }

}
