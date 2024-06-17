package io.cadastroLogin.Gustavo;

import io.cadastroLogin.Gustavo.DAO.userDAO;
import io.cadastroLogin.Gustavo.entity.user;

public class Cadastro {
    public static void main (String [] args) throws Exception {
        System.out.println("Olá seja Bem-Vindo a nossa pagina de cadastro\n");
        user u = new user();
        new userDAO().registerUser(u);

    }

}
