package io.cadastroLogin.Gustavo.entity;

import java.lang.String;

public class user {
    private int codigo;
    private String login;
    private String name;
    private String email;
    private String password;


    public int getCodigo(){
        return codigo;
    }
    public void setCodigo (int codigo) {
        this.codigo = codigo;
    }

    public String getLogin(String login) {
        return login;
    }
    public void setLogin(String Login) {
        this.login = login;
    }
    public String getName(String name) {
        return name;
    }
    public void setName (String Nome) {
        this.name = name;
    }

    public String getEmail(String email) {
        return email;
    }
    public void setEmail(String Email) {
        this.email = email;
    }

    public String getPassword(String password) {
        return password;
    }
    public void setPassword(String Password) {
        this.password = password;
    }
}
