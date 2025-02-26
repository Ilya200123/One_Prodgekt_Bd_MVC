package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;
import org.hibernate.boot.model.relational.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        Util util = new Util();
        try {
            util.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        // реализуйте алгоритм здесь

    }


}
