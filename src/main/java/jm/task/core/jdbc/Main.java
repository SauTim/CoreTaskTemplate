package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Vasiliy", "Zaycev", (byte) 39);
        userService.saveUser("Ivan", "Korpatkin", (byte) 31);
        userService.saveUser("Maksim", "Fomich", (byte) 26);
        userService.saveUser("Alex", "Johns", (byte) 44);

        List<User> users = new ArrayList<>(userService.getAllUsers());
        System.out.println(users);

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
