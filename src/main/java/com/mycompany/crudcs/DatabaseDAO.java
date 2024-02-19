/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudcs;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author pipe2
 */
public class DatabaseDAO<T> extends AbstractDAO<T> {

    @Override
    public void saveToFile(T entity) {
        // Aquí puedes implementar la lógica para guardar en un archivo si es necesario
    }

    @Override
    public void saveToDatabase(T entity) {
    // Aquí implementamos la lógica para guardar en la base de datos
    String query = "INSERT INTO ProgresoMetas (GoalID, MontoAcumulado, FechaActualizacion) VALUES (?, ?, ?)";
    try (PreparedStatement statement = connection.prepareStatement(query)) {
        // Aquí establecemos los valores de los parámetros según la entidad T
        ProgresoMeta progresoMeta = (ProgresoMeta) entity; // Suponiendo que ProgresoMeta es el tipo de entidad que estamos insertando
        statement.setInt(1, progresoMeta.getGoalID());
        statement.setBigDecimal(2, progresoMeta.getMontoAcumulado());
        statement.setDate(3, progresoMeta.getFechaActualizacion());
        // Ejecutamos la consulta
        statement.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}


    public void create(T entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public T read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void update(T entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
