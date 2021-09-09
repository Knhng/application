package helperClasses;

import entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class HelperUser {
    private List<User> userList;

    // delcare no-args constructor + implement a new ArrayList for userList
    public HelperUser() {
        userList = new ArrayList<>();
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void deleteUser(User user) {
        userList.remove(user);
    }

    public void updateUser(User user) {
        userList.replaceAll((UnaryOperator<User>) user);
    }

    @Override
    public String toString() {
        return "helperUser{" +
                "userList=" + userList +
                '}';
    }
}
