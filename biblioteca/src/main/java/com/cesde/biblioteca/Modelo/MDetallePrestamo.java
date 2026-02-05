package com.cesde.biblioteca.Modelo;

import jakarta.persistence.*;
import org.hibernate.Length;

@Entity
@Table(name = "detalleprestamo")
public class MDetallePrestamo
{
    @Id
    @Column(name = "consecutivo", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer consecutivo;
    @Column(nullable = false)
    private Integer codprestamo;

    @Column(nullable = false)
    private  Integer codlibro;

    @Column (length = 13, nullable = false)
    private String fecharealdevolucion;

    public MDetallePrestamo(Integer consecutivo, Integer codprestamo, Integer codlibro, String fecharealdevolucion) {
        this.consecutivo = consecutivo;
        this.codprestamo = codprestamo;
        this.codlibro = codlibro;
        this.fecharealdevolucion = fecharealdevolucion;
    }

    public MDetallePrestamo() {
    }

    public Integer getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(Integer consecutivo) {
        this.consecutivo = consecutivo;
    }

    public Integer getCodprestamo() {
        return codprestamo;
    }

    public void setCodprestamo(Integer codprestamo) {
        this.codprestamo = codprestamo;
    }

    public Integer getCodlibro() {
        return codlibro;
    }

    public void setCodlibro(Integer codlibro) {
        this.codlibro = codlibro;
    }

    public String getFecharealdevolucion() {
        return fecharealdevolucion;
    }

    public void setFecharealdevolucion(String fecharealdevolucion) {
        this.fecharealdevolucion = fecharealdevolucion;
    }
}

