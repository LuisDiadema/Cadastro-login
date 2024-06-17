package io.cadastroLogin.Gustavo.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conection {


    private static final String url = "jdbc:mysql://localhost:3306/bancodedados";
    private static final String user = "root";
    private static final String pasword = "Gustavo@14";

    private static Connection coon;

    public static Connection getConection() {
        try {
            if (coon == null) {
                coon = DriverManager.getConnection(url, user, pasword);
                return coon;
            } else {
                return coon;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}