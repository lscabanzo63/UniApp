/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uniapp.model;

import java.io.Serializable;

/**
 *
 * @author santi
 */
public class AspiranteDto implements Serializable{
    
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
            
    
    
    
    
    
    
    
}
