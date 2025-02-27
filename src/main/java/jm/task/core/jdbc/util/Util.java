package jm.task.core.jdbc.util;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    static  final  String DB_url = "jdbc:mysql://localhost:3306/test";
    static  final  String username = "root";
    static  final  String password = "root";

    public static Connection getConnection() {

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(DB_url, username, password);
            System.out.println("Соединение установлено");
            return conn;
        } catch (SQLException e) {
            System.out.println("Соединение разорвано");
        }

        return conn;
    }
    // реализуйте настройку соеденения с БД
}
