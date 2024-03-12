package app;
import app.entity.User;
import app.mock.UserData;

import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        UserData userData = new UserData();
        List<User> userList = userData.getUsers();
        Consumer<User> printUser = user -> System.out.println(user.getName() + " - " + user.getPhone());
        userList.forEach(printUser);
    }
}