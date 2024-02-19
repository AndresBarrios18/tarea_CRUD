/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudcs;

/**
 *
 * @author pipe2
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO<T> extends AbstractDAO<T> {
    
    private String fileName;

    public FileDAO(String fileName) {
        this.fileName = fileName;
    }

   

    @Override
    public void create(T entity) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            // Escribe el objeto en el archivo de texto
            writer.write(entity.toString() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Implementa los demás métodos CRUD según sea necesario

    public T read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void update(T entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
     public void saveToFile(T entity) {
        if (entity instanceof ProgresoMeta) {
            ProgresoMeta progresoMeta = (ProgresoMeta) entity;
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
                // Convertimos los atributos de ProgresoMeta a String y los escribimos en el archivo
                String data = progresoMeta.getGoalID() + "," + progresoMeta.getMontoAcumulado() + "," + progresoMeta.getFechaActualizacion();
                writer.write(data + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Tipo de entidad no compatible");
        }
    }
    @Override
    public void saveToDatabase(T entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
