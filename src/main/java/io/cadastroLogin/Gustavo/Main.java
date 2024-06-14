package io.cadastroLogin.Gustavo;

import java.util.Scanner;

import io.cadastroLogin.Gustavo.DAO.userDAO;
import io.cadastroLogin.Gustavo.entity.user;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {
    public static void main(String[] args) throws Exception {

         SpringApplication.run(Main.class,args);
         Scanner sc = new Scanner(System.in);
         String valor = sc.nextLine();

         System.out.println("Olá seja Bem-Vindo a nossa pagina de cadastro");
         System.out.println("Digite seu usuario abaixo: ");
         System.out.println("Presione para confirmar o usuario" + valor);


    }

    @Bean
    CommandLineRunner init(){
        return args -> {
            System.out.println("Tudo ok");
        };
    }

}