/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uniapp.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author santi
 */
public class AspiranteDao implements IDao{
    private File file = new File("C:\\temp\\archivo.txt");
    private ObjectOutputStream oos;
    private ObjectInputStream ois;
 
     public AspiranteDao() throws IOException {
        file.createNewFile();
        oos = new ObjectOutputStream(new FileOutputStream(file));
        ois = new ObjectInputStream(new FileInputStream(file));
    }
         @Override
    public String save(AspiranteDto u) {
        String salida = "Registro Exitoso";
        try {
            oos.writeObject(u);
        } catch (IOException ex) {
            Logger.getLogger(AspiranteDao.class.getName()).log(Level.SEVERE, null, ex);
            salida = "se ha podució un erro";
        } finally {
            try {
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(AspiranteDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return salida;
    }
     @Override
    public String update(AspiranteDto u) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     @Override
    public String delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     @Override
    public AspiranteDto getById(String id) {
        // Se lee el primer objeto
        AspiranteDto udtosalida = null;
        Object aux = null;
        try {
            aux = ois.readObject();
        } catch (IOException ex) {
            Logger.getLogger(AspiranteDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AspiranteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Mientras haya objetos
        while (aux != null) {
            if (aux instanceof AspiranteDto) {
                if(((AspiranteDto)aux).getUserName().equals(id)){
                    udtosalida= (AspiranteDto)aux;
                }
            }
            try {
                aux = ois.readObject();
            } catch (IOException ex) {
                Logger.getLogger(AspiranteDao.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AspiranteDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            ois.close();
        } catch (IOException ex) {
            Logger.getLogger(AspiranteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return udtosalida;
    }
    
    @Override
    public List<AspiranteDto> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    


     
     
}
