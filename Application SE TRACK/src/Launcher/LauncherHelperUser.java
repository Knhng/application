package Launcher;

import entity.User;
import helperClasses.HelperUser;

public class LauncherHelperUser {
    public static void main(String[] args) {
        User user1 = new User();
        HelperUser test = new HelperUser();

        test.addUser(user1);
        System.out.println(test.getUserList());

        test.deleteUser(user1);
        System.out.println(test.getUserList());

        test.addUser(user1);
        System.out.println(test.getUserList());

    }
}
