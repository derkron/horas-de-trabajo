package com.work.calculo.entidad;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import org.springframework.lang.NonNull;



import java.util.Date;

@Entity
public class Servicio {
    @Id
    @NonNull
    private String identificacionTecnico;

    @NonNull
    private String identificacionServicio;

    @NonNull
    private Date fechaIncio;

    @NonNull
    private Date fechaFin;

    public Servicio() {
    }

    public Servicio(String identificacionTecnico, String identificacionServicio, Date fechaIncio, Date fechaFin) {
        this.identificacionTecnico = identificacionTecnico;
        this.identificacionServicio = identificacionServicio;
        this.fechaIncio = fechaIncio;
        this.fechaFin = fechaFin;
    }

    public String getIdentificacionTecnico() {
        return identificacionTecnico;
    }

    public void setIdentificacionTecnico(String identificacionTecnico) {
        this.identificacionTecnico = identificacionTecnico;
    }

    public String getIdentificacionServicio() {
        return identificacionServicio;
    }

    public void setIdentificacionServicio(String identificacionServicio) {
        this.identificacionServicio = identificacionServicio;
    }

    public Date getFechaIncio() {
        return fechaIncio;
    }

    public void setFechaIncio(Date fechaIncio) {
        this.fechaIncio = fechaIncio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
}
