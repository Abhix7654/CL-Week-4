package Annotations.roleallowedannotation;

public class AdminService {

    @RoleAllowed("ADMIN")
    public void deleteUser(String username) {
        System.out.println("User " + username + " has been deleted.");
    }

    public void viewUser(String username) {
        System.out.println("Viewing user: " + username);
    }
}
