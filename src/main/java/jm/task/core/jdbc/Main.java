package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        Util.getConnection();
        UserDao userDao = new UserDaoJDBCImpl();
        userDao.createUsersTable();
        userDao.saveUser("vlad", "vanin", (byte) 15);
        userDao.saveUser("adam", "ivanov", (byte) 17);
        userDao.saveUser("maxim", "privet", (byte) 22);
        userDao.saveUser("privet", "poka", (byte) 28);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
