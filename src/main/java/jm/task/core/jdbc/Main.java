package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();

        userDaoHibernate.createUsersTable();

        userDaoHibernate.saveUser("Vasiliy", "Zaycev", (byte) 39);
        userDaoHibernate.saveUser("Ivan", "Korpatkin", (byte) 31);
        userDaoHibernate.saveUser("Maksim", "Fomich", (byte) 26);
        userDaoHibernate.saveUser("Alex", "Johns", (byte) 44);

        List<User> users = new ArrayList<>(userDaoHibernate.getAllUsers());
        System.out.println(users);

        userDaoHibernate.cleanUsersTable();

        userDaoHibernate.dropUsersTable();
    }
}
