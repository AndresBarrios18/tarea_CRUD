/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudcs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pipe2
 */
public abstract class AbstractDAO<T> implements CRUD<T> {
    protected Connection connection;

    public AbstractDAO() {
        // Aquí deberías inicializar tu conexión a la base de datos
        // Puedes modificar los parámetros según la configuración de tu base de datos
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/software_cs", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public abstract void saveToFile(T entity);
    public abstract void saveToDatabase(T entity);

    void save(ProgresoMeta entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

