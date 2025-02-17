package Annotations;

import Annotations.roleallowedannotation.AdminService;
import Annotations.roleallowedannotation.RoleBasedAccessControl;
import Annotations.roleallowedannotation.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoleAccessExampleTest {
    @Test
    void testAdminAccess() {
        AdminService adminService = new AdminService();
        User admin = new User("AdminUser", "ADMIN");

        assertDoesNotThrow(() -> RoleBasedAccessControl.invokeMethod(adminService, "deleteUser", admin, "TestUser"));
    }

    @Test
    void testUserAccessDenied() {
        AdminService adminService = new AdminService();
        User user = new User("NormalUser", "USER");

        RoleBasedAccessControl.invokeMethod(adminService, "deleteUser", user, "TestUser");
    }

}