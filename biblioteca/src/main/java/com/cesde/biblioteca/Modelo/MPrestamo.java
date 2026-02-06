package com.cesde.biblioteca.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "prestamoLibro")
public class MPrestamo
{
    @Id
    @Column(nullable = false)
    private Integer codprestamo;

    @Column(length = 13, nullable = false)
    private String fechaPrestamo;

    @Column(length = 13, nullable = false)
    private String fechaDevolucion;

    @Column(length = 10, nullable = false)
    private String identificacion;

    @Column(length = 100, nullable = false)
    private String activo;

    //Constructores

    public MPrestamo(Integer codprestamo, String fechaPrestamo, String fechaDevolucion, String identificacion, String activo) {
        this.codprestamo = codprestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.identificacion = identificacion;
        this.activo = activo;
    }

    public MPrestamo() {
    }

    //Set y Get

    public Integer getCodprestamo() {
        return codprestamo;
    }

    public void setCodprestamo(Integer codprestamo) {
        this.codprestamo = codprestamo;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }
}
