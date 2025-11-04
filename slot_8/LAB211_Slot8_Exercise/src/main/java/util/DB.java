/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author xcall
 */
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DB {
    private static String url;
    private static String user;
    private static String pass;

    static {
        try (InputStream in = Thread.currentThread()
                .getContextClassLoader()
                .getResourceAsStream("db.properties")) {

            if (in == null) {
                throw new RuntimeException("db.properties not found! Please put it in src/main/resources");
            }

            Properties p = new Properties();
            p.load(in);

            url  = p.getProperty("db.url");
            user = p.getProperty("db.user");
            pass = p.getProperty("db.password");

            if (url == null || user == null || pass == null) {
                throw new RuntimeException("Missing db.url / db.user / db.password in db.properties");
            }

        } catch (Exception e) {
            throw new RuntimeException("Cannot load db.properties: " + e.getMessage(), e);
        }
    }

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(url, user, pass);
    }
}