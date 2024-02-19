/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudcs;

/**
 *
 * @author pipe2
 */
import java.util.ArrayList;
import java.util.List;

public class ListDAO<T> extends AbstractDAO<T> {
    private final List<T> dataList;

    public ListDAO() {
        this.dataList = new ArrayList<T>();

    }

    @Override
    public void create(T entity) {
        dataList.add(entity);
    }

    @Override
    public T read(int id) {
        // Implementa la lógica para leer un elemento de la lista según el ID
        return null;
    }

    @Override
    public void update(T entity) {
        // Implementa la lógica para actualizar un elemento en la lista
    }

    @Override
    public void delete(int id) {
        // Implementa la lógica para eliminar un elemento de la lista según el ID
    }

    @Override
    public void saveToFile(T entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void saveToDatabase(T entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

