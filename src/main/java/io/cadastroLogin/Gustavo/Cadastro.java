package io.cadastroLogin.Gustavo;

import javax.swing.*;
import java.util.Scanner;

public class Cadastro {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá seja Bem-Vindo a nossa pagina de cadastro\n");
        System.out.println("Digite seu usuario abaixo: \n");

        String usuario = sc.nextLine();
        System.out.println("Seu usuario é: " + usuario);

        System.out.println("\nDigite a uma senha abaixo: \n");
        String password = sc.nextLine();
        password = password.replaceAll(password, pass);
        String pass = JOptionPane.showInputDialog(null, "****************");
        JOptionPane.showConfirmDialog(null, pass);


        System.out.println("Seu usuario é: " + usuario + " e sua senha é: " + pass);

    }
}
