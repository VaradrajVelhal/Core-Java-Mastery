//Write a Java program to create nested packages org.example.project.models
//and org.example.project.services. Create a class User in the models package
//and a class UserService in the services package. Use UserService to perform
//operations on User.

import org.example.project.models.User;
import org.example.project.services.UserService;

class Program4 {
    public static void main(String[] args) {
        User u = new User(1, "Alice");
        UserService service = new UserService();

        service.displayUser(u);
    }
}
