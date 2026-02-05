package com.cesde.biblioteca.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class MUsuarios
    {
        @Id
        @Column(name = "ideusuario", nullable = false)
        private Integer ideusuario;

        @Column(length = 20, nullable = false)
        private String tipodocumento;

        @Column(length = 80, nullable = false)
        private String nombreusuario;

        @Column(length = 100, nullable = false)
        private  String apellidousuario;

        @Column(length = 10,nullable = false)
        private String telefono;

        @Column(length = 10, nullable = false)
        private String celular;

        @Column (length = 100, nullable = false)
        private String direccion;

        @Column (length = 100, nullable = false)
        private String activo;

         // Constructores


        public MUsuarios(Integer ideusuario, String tipodocumento, String nombreusuario, String apellidousuario, String telefono, String celular, String direccion, String activo) {
            this.ideusuario = ideusuario;
            this.tipodocumento = tipodocumento;
            this.nombreusuario = nombreusuario;
            this.apellidousuario = apellidousuario;
            this.telefono = telefono;
            this.celular = celular;
            this.direccion = direccion;
            this.activo = activo;
        }
        public MUsuarios() {
        }

         // Set y get


        public Integer getIdeusuario()
        {
            return ideusuario;
        }

        public void setIdeusuario(Integer ideusuario)
        {
            this.ideusuario = ideusuario;
        }

        public String getTipodocumento()
        {
            return tipodocumento;
        }

        public void setTipodocumento(String tipodocumento)
        {
            this.tipodocumento = tipodocumento;
        }

        public String getNombreusuario()
        {
            return nombreusuario;
        }

        public void setNombreusuario(String nombreusuario)
        {
            this.nombreusuario = nombreusuario;
        }

        public String getApellidousuario()
        {
            return apellidousuario;
        }

        public void setApellidousuario(String apellidousuario)
        {
            this.apellidousuario = apellidousuario;
        }

        public String getTelefono()
        {
            return telefono;
        }

        public void setTelefono(String telefono)
        {
            this.telefono = telefono;
        }

        public String getCelular()
        {
            return celular;
        }

        public void setCelular(String celular)
        {
            this.celular = celular;
        }

        public String getDireccion()
        {
            return direccion;
        }

        public void setDireccion(String direccion)
        {
            this.direccion = direccion;
        }

        public String getActivo()
        {
            return activo;
        }

        public void setActivo(String activo)
        {
            this.activo = activo;
        }
    }

/*
package com.Cesde.Concesionario.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class MCliente {
    @Id
    @Column(name="idecliente",nullable = false)
    private Integer ideCliente;
    @Column(length = 100,nullable = false)
    private String nomcliente;
    @Column(length = 50,nullable = false)
    private String dircliente;
    @Column(length = 10,nullable = false)
    private String telcliente;
    @Column(length = 5,nullable = false)
    private String activo;

    // Constructores
    public MCliente(Integer ideCliente, String nomcliente, String dircliente, String telcliente, String activo) {
        this.ideCliente = ideCliente;
        this.nomcliente = nomcliente;
        this.dircliente = dircliente;
        this.telcliente = telcliente;
        this.activo = activo;
    }

    public MCliente() {
    }
    // Metodos Get y Set (Encapsulamiento)
    public Integer getIdeCliente() {
        return ideCliente;
    }
    public void setIdeCliente(Integer ideCliente) {
        this.ideCliente = ideCliente;
    }

    public String getNomcliente() {
        return nomcliente;
    }
    public void setNomcliente(String nomcliente) {
        this.nomcliente = nomcliente;
    }

    public String getDircliente() {
        return dircliente;
    }
    public void setDircliente(String dircliente) {
        this.dircliente = dircliente;
    }

    public String getTelcliente() {
        return telcliente;
    }
    public void setTelcliente(String telcliente) {
        this.telcliente = telcliente;
    }

    public String getActivo() {
        return activo;
    }
    public void setActivo(String activo) {
        this.activo = activo;
    }
}
 */
