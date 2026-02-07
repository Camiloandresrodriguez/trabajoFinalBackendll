package com.cesde.biblioteca.Servicio;

import com.cesde.biblioteca.Modelo.MUsuarios;
import com.cesde.biblioteca.Repositorio.IUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SUsuarios

{
    @Autowired
    IUsuarios iUsuarios;

    public SUsuarios(IUsuarios iUsuarios)
    {
        this.iUsuarios = iUsuarios;
    }

    public MUsuarios guardar(MUsuarios mUsuarios) throws Exception
    {
        try
        {
            return this.iUsuarios.save(mUsuarios);
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    public List<MUsuarios> consultaGeneral() throws Exception
    {
        try
        {
            return this.iUsuarios.findAll();
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    public  MUsuarios consultaIndividualId(Integer ideUsuario)throws Exception
    {
        try
        {
            Optional<MUsuarios> usuarioEncontrado = this.iUsuarios.findById(ideUsuario);
            if (usuarioEncontrado.isPresent())
            {
                return usuarioEncontrado.get();
            }
            else
            {
                throw new Exception("cliente no encontrado");
            }
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    public List<MUsuarios> consultaIndivisualNombre (String nombreUsuario) throws Exception
    {
        try
        {
            return this.iUsuarios.findByNombreusuario(nombreUsuario);
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    public MUsuarios modificar(MUsuarios mUsuarios, Integer ideUsuario) throws Exception
    {
        try
        {
            Optional<MUsuarios> usuarioEncontrado = this.iUsuarios.findById(ideUsuario);
            if(usuarioEncontrado.isPresent())
            {
                MUsuarios nuevoRegistro = usuarioEncontrado.get();
                nuevoRegistro.setIdeusuario(mUsuarios.getIdeusuario());
                nuevoRegistro.setTipodocumento(mUsuarios.getTipodocumento());
                nuevoRegistro.setNombreusuario(mUsuarios.getNombreusuario());
                nuevoRegistro.setApellidousuario(mUsuarios.getApellidousuario());
                nuevoRegistro.setTelefono(mUsuarios.getTelefono());
                nuevoRegistro.setCelular(mUsuarios.getCelular());
                nuevoRegistro.setDireccion(mUsuarios.getDireccion());
                nuevoRegistro.setActivo(mUsuarios.getActivo());
                return this.iUsuarios.save(nuevoRegistro);
            }
            else
            {
                throw new Exception("No se puede hacer la modificación, por que el usuario no esta registrado.");
            }
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    public Boolean eliminar(Integer ideUsuario) throws Exception
    {
        try
        {
            Optional<MUsuarios> usuarioEncontrado = this.iUsuarios.findById(ideUsuario);
            if (usuarioEncontrado.isPresent())
            {
                this.iUsuarios.deleteById(ideUsuario);
                return true;
            }
            else
            {
                throw new Exception("No se puede eliminar el usuario, porque no se encuentra registrado.");
            }
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    public MUsuarios anular(MUsuarios mUsuarios, Integer ideUsuario) throws Exception
    {
        try
        {
            Optional<MUsuarios> usuarioEncontrado = this.iUsuarios.findById(ideUsuario);
            if (usuarioEncontrado.isPresent())
            {
                MUsuarios nuevoRegistro = usuarioEncontrado.get();
                if (mUsuarios.getActivo().equals("True"))
                {
                    nuevoRegistro.setActivo("True");
                }
                else
                {
                    nuevoRegistro.setActivo("False");
                }
                return this.iUsuarios.save(nuevoRegistro);
            }
            else
            {
                throw new Exception("No se puede anular, Usuario no registrado");
            }
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }
}
