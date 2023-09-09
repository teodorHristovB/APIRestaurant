package com.ApiMasterBar.APIMasterBar.MappedTables;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    private String dni;
    private String usuario;
    private String password;
    private int tipo;

    public Usuario(){

    }
    public Usuario(String dni, String usuario, String password, int tipo) {
        this.dni = dni;
        this.usuario = usuario;
        this.password = password;
        this.tipo = tipo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
