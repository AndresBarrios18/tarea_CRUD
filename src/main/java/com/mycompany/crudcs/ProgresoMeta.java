/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudcs;


/**
 *
 * @author pipe2
 */
import java.math.BigDecimal;
import java.sql.Date;

public class ProgresoMeta {
    private int goalID;
    private BigDecimal montoAcumulado;
    private Date fechaActualizacion;

    public ProgresoMeta(int goalID, BigDecimal montoAcumulado, Date fechaActualizacion) {
        this.goalID = goalID;
        this.montoAcumulado = montoAcumulado;
        this.fechaActualizacion = fechaActualizacion;
    }

    public int getGoalID() {
        return goalID;
    }

    public void setGoalID(int goalID) {
        this.goalID = goalID;
    }

    public BigDecimal getMontoAcumulado() {
        return montoAcumulado;
    }

    public void setMontoAcumulado(BigDecimal montoAcumulado) {
        this.montoAcumulado = montoAcumulado;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    @Override
    public String toString() {
        return "ProgresoMeta{" +
                "goalID=" + goalID +
                ", montoAcumulado=" + montoAcumulado +
                ", fechaActualizacion=" + fechaActualizacion +
                '}';
    }
}
