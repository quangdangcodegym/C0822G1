
import user.User;
import user.allusers.UsersList;

import java.util.ArrayList;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        UsersList usersList = new UsersList();
        System.out.println(usersList);
        usersList.addUser(new User("aladin", "aladin@gmail.com", "VN", 1348539638, new Date()));
        System.out.println(usersList);
//        usersList.addUser();
        System.out.println(usersList);
        usersList.removeUser(4);
        System.out.println(usersList);
        usersList.removeUser("Messi");
        System.out.println(usersList);
    }
}