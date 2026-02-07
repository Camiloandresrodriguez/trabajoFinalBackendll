package com.cesde.biblioteca.Modelo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "libro")

public class MLibro
{

@Id
@Column (name = "codLibro", nullable = false)
private Integer codLibro;

@Column (length = 100, nullable = false)
private String descripcion;

@Column (length = 20, nullable = false)
private String genero;

@Column (length = 100, nullable = false)
private String nombreAutor;

@Column (length = 100, nullable = false)
private String apellidoAutor;

@Column (length = 100, nullable = false)
private String activo;

// Constructores

    public MLibro(Integer codLibro, String descripcion, String genero, String nombreAutor, String apellidoAutor, String activo) {
        this.codLibro = codLibro;
        this.descripcion = descripcion;
        this.genero = genero;
        this.nombreAutor = nombreAutor;
        this.apellidoAutor = apellidoAutor;
        this.activo = activo;
    }

    public MLibro() {
    }

    // Set y Get


    public Integer getCodLibro() {
        return codLibro;
    }

    public void setCodLibro(Integer codLibro) {
        this.codLibro = codLibro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getApellidoAutor() {
        return apellidoAutor;
    }

    public void setApellidoAutor(String apellidoAutor) {
        this.apellidoAutor = apellidoAutor;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }
}

