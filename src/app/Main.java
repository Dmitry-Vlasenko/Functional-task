package app;
import app.entity.User;
import app.mock.UserData;

import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        List<User>  userslist = UserData.getUsers();
        Consumer<User> printUser = user -> System.out.println(user.getName() + " - " + user.getPhone());
        userslist.forEach(printUser);
    }
}