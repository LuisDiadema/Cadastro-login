package io.cadastroLogin.Gustavo;

import javax.swing.*;
import java.util.Scanner;

public class Cadastro {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá seja Bem-Vindo a nossa pagina de cadastro\n");
        System.out.println("Digite seu usuario abaixo:");

        String usuario = sc.nextLine();
        System.out.println("\nDigite uma senha de 4 digitos ");
        System.out.println("(Somente numeros): ");
        String pass = sc.nextLine();
        String aster = pass;
        for (int i = 0; i < 1; i++) {
            aster = aster.replaceAll(aster, "****");
        }
        System.out.println("\nUsuario: " + usuario + "\nSenha: " + aster);
    }
}
