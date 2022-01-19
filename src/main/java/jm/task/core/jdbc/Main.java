package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();

        userDaoJDBC.createUsersTable();
        userDaoJDBC.saveUser("Vasiliy", "Zaycev", (byte) 39);
        userDaoJDBC.saveUser("Ivan", "Korpatkin", (byte) 31);
        userDaoJDBC.saveUser("Maksim", "Fomich", (byte) 26);
        userDaoJDBC.saveUser("Alex", "Johns", (byte) 44);

        List<User> users = new ArrayList<>(userDaoJDBC.getAllUsers());
        System.out.println(users);

        userDaoJDBC.cleanUsersTable();

        userDaoJDBC.dropUsersTable();
    }
}
