package io.cadastroLogin.Gustavo;

import io.cadastroLogin.Gustavo.DAO.userDAO;
import io.cadastroLogin.Gustavo.entity.user;

import java.util.Scanner;

public class Cadastro {
    public static void main (String [] args) throws Exception
    {
        login();

        db();

    }
    //bloco de código a baixo executa a ação de capturar o usuario e senha.
    public static void login () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá seja Bem-Vindo a nossa pagina de cadastro\n");
        System.out.println("Digite seu usuario abaixo:");

        String usuario = sc.nextLine();
        System.out.println("\nDigite uma senha de 4 digitos: ");
        String pass = sc.nextLine();
        String aster = pass;
        for (int i = 0; i < 1; i++) {
            aster = aster.replaceAll(aster, "****");
        }
        System.out.println("\nUsuario: " + usuario + "\nSenha: " + aster);
    }

    public static void db() {
        user u = new user();
        u.setName("Luis Gustavo");
        u.setEmail("luis.gustavo.sene99@gmail.com");
        u.setLogin("LuisinhoDiadema");
        u.getPassword("");

        new userDAO().registerUser(u);

    }

}
