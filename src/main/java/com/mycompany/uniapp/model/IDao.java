/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.uniapp.model;

import java.util.List;

/**
 *
 * @author santi
 */
public interface IDao {
        String save(AspiranteDto aspirante);
    String update(AspiranteDto aspirante);
    String delete(String id);
    AspiranteDto getById(String id);
    List<AspiranteDto> getAll();
    
}
