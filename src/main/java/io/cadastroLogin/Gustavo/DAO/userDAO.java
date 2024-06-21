package io.cadastroLogin.Gustavo.DAO;

import io.cadastroLogin.Gustavo.Conexao.Conection;
import io.cadastroLogin.Gustavo.entity.user;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class userDAO {

    public void registerUser(user user) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome completo abaixo: \n");
        String name = sc.nextLine();

        System.out.println("\nDigite o seu e-mail: \n");
        String email = sc.nextLine();
        if (email.contains("@")) {
            System.out.println("\nSeu e-mail e: " + email);

        } else if (email.contains("com") || email.contains("com.br")) {
            System.out.println("\nSeu e-mail é: " + email);

        } else if (email.contains("gmail") || email.contains("hotmail") || email.contains("yahoo")) {
            System.out.println("\nSeu e-mail é: " + email);

        } else {
            System.out.println("\nEstá faltando algo no seu e-mail, tente novamente!!\n");
        }

        System.out.println("\nCrie um usuario: \n");
        String login = sc.nextLine();


        System.out.println("\nCrie uma senha de 4 digitos (Somente números): \n");
        String senha = sc.nextLine();
        String aster = senha;
        for (int i = 0; i < 1; i++) {
            aster = aster.replaceAll(aster, "****");
        }

        System.out.println("\nCadastro completo confirme as informações a seguir: \n\n" + "Nome: " + name + "\nUsuario: " + login + "\nSenha: " + aster + "\nE-mail: " + email);

        String sql = "INSERT INTO USER (NAME, EMAIL, LOGIN, PASSWORD) VALUES (?, ?, ?, ?)";

        PreparedStatement ps = null;
        try {
            ps = Conection.getConection().prepareStatement(sql);
            ps.setString(1, user.getName(name));
            ps.setString(2, user.getEmail(email));
            ps.setString(3, user.getLogin(login));
            ps.setString(4, user.getPassword(senha));

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            //TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
