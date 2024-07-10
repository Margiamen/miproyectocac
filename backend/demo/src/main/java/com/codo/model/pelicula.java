package com.codo.model;

import java.util.Date;

public class pelicula {
    private Integer id;
    private String titulo;
    private Double puntuacion;
    private String portada;
    public pelicula(Integer id, String titulo, Double puntuacion, String portada) {
        this.id = id;
        this.titulo = titulo;
        this.puntuacion = puntuacion;
        this.portada = portada;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Double getPuntuacion() {
        return puntuacion;
    }
    public void setPuntuacion(Double puntuacion) {
        this.puntuacion = puntuacion;
    }
    public String getPortada() {
        return portada;
    }
    public void setPortada(String portada) {
        this.portada = portada;
    }
    
}
