package entity;

import java.lang.String;

public class user {
    private int codigo;
    private String login;
    private String nome;
    private String email;
    private String password;


    public int getCodigo(){
        return codigo;
    }
    public void setCodigo (int codigo) {
        this.codigo = codigo;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String Login) {
        this.login = login;
    }
    public String getNome() {
        return nome;
    }
    public void setNome (String Nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String Email) {
        this.email = email;
    }

    public String getPassword(String number) {
        return password;
    }
    public void setPassword(String Password) {
        this.password = password;
    }
}
