package io.cadastroLogin.Gustavo.DAO;

import io.cadastroLogin.Gustavo.Conexao.Conection;
import io.cadastroLogin.Gustavo.entity.user;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class userDAO {

    public void registerUser(user user) {

        String sql = "INSERT INTO USER (NAME, LOGIN, PASSWORD, EMAIL) VALUES (?, ?, ?, ?)";

        PreparedStatement ps = null;
        try {
            ps = Conection.getConection().prepareStatement(sql);
            ps.setString(1, user.getName("luis"));
            ps.setString(2, user.getEmail("luis.gustavo.sene99@gmail.com"));
            ps.setString(3, user.getPassword("1234"));
            ps.setString(4, user.getLogin("LuisinhoDiadema"));

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            //TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
