package io.cadastroLogin.Gustavo;

import java.util.Scanner;

public class Cadastro {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá seja Bem-Vindo a nossa pagina de cadastro\n");
        System.out.println("Digite seu usuario abaixo: \n");

        String usuario = sc.nextLine();
        System.out.println("Seu nome de usuario é: " + usuario);

        String password = sc.nextLine();
        System.out.println("Digite a uma senha abaixo: \n");
        System.out.println("Presione enter para confirmar sua senha: " + password);

    }
}
