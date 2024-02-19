/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.crudcs;

/**
 *
 * @author pipe2
 */
public interface CRUD<T> {
    void create(T entity);
    T read(int id);
    void update(T entity);
    void delete(int id);
}
