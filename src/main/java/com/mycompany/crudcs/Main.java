/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.crudcs;

/**
 *
 * @author pipe2
 */





import java.math.BigDecimal;
import java.sql.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("¿Donde deseas guardar los datos? (archivo/base de datos)");
        String eleccionUsuario = scanner.nextLine();
        
        FileDAO dao = null;
        DatabaseDAO dao1;
        
        if (eleccionUsuario.equals("archivo")) {
            dao = new FileDAO<String>("C:/Users/pipe2/Documents/Tareas/datos.txt");
        } else if (eleccionUsuario.equals("base de datos")) {
            dao1 = new DatabaseDAO<String>();
        } else {
            System.out.println("Opción no válida");
            return;
        }
        
        // Crear una instancia de ProgresoMeta con los valores adecuados
        ProgresoMeta entity = new ProgresoMeta(1, new BigDecimal("1000.00"), Date.valueOf("2024-02-18"));

        // Llamar al método save de tu DAO
       
        dao.create(entity);
        
        scanner.close();
    }
}
        
