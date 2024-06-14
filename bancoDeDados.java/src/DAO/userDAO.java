package DAO;

import Conection.Conection;
import entity.user;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class userDAO {

    public void registerUser(user user) {

        String sql = "INSET INTO USER (NOME, LOGIN, SENHA, EMAIL) VALUES (?, ?, ?, ?)";

        PreparedStatement ps = null;
        try {
            ps = Conection.getConection().prepareStatement(sql);
            ps.setString(1, user.getNome());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword("1234"));
            ps.setString(4, user.getLogin());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            //TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}