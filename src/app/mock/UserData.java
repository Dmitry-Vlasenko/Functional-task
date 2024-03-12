package app.mock;

import app.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserData {
    private final List<User> users = new ArrayList<>();

    {
        users.add(new User("Ivan", "+380951231237"));
        users.add(new User("Maria", "+380978901234"));
        users.add(new User("Petro", "+380634561230"));
        users.add(new User("Olena", "+380991231237"));
        users.add(new User("Dmytro", "+380678901234"));
    }

    public List<User> getUsers() {
        return users;
    }
}