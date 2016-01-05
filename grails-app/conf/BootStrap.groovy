import com.domain.pack.User
import com.service.pack.UserPersistenceService

class BootStrap {

    UserPersistenceService userPersistenceService

    def init = { servletContext ->
        println("BootStrap >> init()")
        User obj = new User(firstName: "Vaibhav", lastName: "Sharma", email: "vaibhav@gmail.com", userName: "vaibhav", password: "12345", confirmPassword: "12345", image: "VAIBHAV.jpg", isAdmin: "false")
        boolean persistenceStatus = userPersistenceService.createUser(obj);
        println("BootStrap >> init() status :: " + persistenceStatus)
    }
    def destroy = {
    }

}
