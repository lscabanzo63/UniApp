/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uniapp.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author santi
 */
public class AspiranteDto implements Serializable {

    
    private String userName ;
    private String password;
    private  String nombres;
    private String apellidos;
    private String correo;
    private int numeroCelular;

    public AspiranteDto(String userName, String password, String nombres, String apellidos, String correo, int numeroCelular) {
        this.userName = userName;
        this.password = password;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.numeroCelular = numeroCelular;
    }
    
    
    
    public String getUserName() {
        return userName;
    }

    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }
    


    
    
    
    
    
    
    
    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AspiranteDto other = (AspiranteDto) obj;
        if (!Objects.equals(this.userName, other.userName)) {
            return false;
        }
        return Objects.equals(this.getPassword(), other.getPassword());
    }
}
