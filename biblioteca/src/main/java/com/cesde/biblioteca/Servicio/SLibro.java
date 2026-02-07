package com.cesde.biblioteca.Servicio;

import com.cesde.biblioteca.Modelo.MLibro;
import com.cesde.biblioteca.Repositorio.ILibro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class SLibro

{
  @Autowired
    ILibro iLibro;

   public SLibro(ILibro iLibro) { this.iLibro = iLibro; }

   public MLibro guardar (MLibro mLibro) throws  Exception {

    try
     {
       return  this.iLibro.save(mLibro);
     }
    catch (Exception error)
    {
     throw  new Exception(error.getMessage());
    }
   }

    public List<MLibro> consultaGeneral () throws  Exception
    {
      try
        {
           return this.iLibro.findAll();
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }

    }

    public MLibro consultaIndividualId (Integer codLibro) throws  Exception

    {
      try {
          Optional<MLibro> usuarioEncontrado = this.iLibro.findById(codLibro);
          if (usuarioEncontrado.isPresent()) {
              return usuarioEncontrado.get();
          } else {
             throw new Exception("El libro no fue encontrado");
          }
      }
       catch (Exception error) {
          throw new Exception(error.getMessage());
       }
    }

   public List<MLibro> consultaIndividualNombreAutor (String nombreAutor) throws Exception
   {
     try {
         return this.iLibro.findBynombreAutor(nombreAutor);
     } catch (Exception error) {
         throw new Exception(error.getMessage());
     }
   }

    public List<MLibro> consultaIndividualApellidoAutor (String apellidoAutor) throws Exception
    {
        try {
            return this.iLibro.findByApellidoAutor(apellidoAutor);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    public MLibro modificar (MLibro mLibro, Integer codLibro) throws  Exception
   {
     try {
       Optional<MLibro> usuarioEncontrado = this.iLibro.findById(codLibro);
         if (usuarioEncontrado.isPresent()) {
           MLibro nuevoRegistro = usuarioEncontrado.get();
           nuevoRegistro.setCodLibro(mLibro.getCodLibro());
           nuevoRegistro.setDescripcion(mLibro.getDescripcion());
           nuevoRegistro.setGenero(mLibro.getGenero());
           nuevoRegistro.setNombreAutor(mLibro.getNombreAutor());
           nuevoRegistro.setApellidoAutor(mLibro.getApellidoAutor());
           nuevoRegistro.setActivo(mLibro.getActivo());
           return  this.iLibro.save(nuevoRegistro);
        } else {
            throw new Exception("No se puede hacer la modificación, por que el libro no esta registrado.");
        }
     } catch (Exception error) {
         throw new Exception(error.getMessage());
     }
   }

    public  Boolean eliminar (Integer codLibro) throws Exception
   {
    try {
       Optional <MLibro> usuarioEncontrado = this.iLibro.findById(codLibro);
        if (usuarioEncontrado.isPresent()) {
           this.iLibro.deleteById(codLibro);
           return true;
        } else  {
            throw  new Exception("No se puede eliminar el libro, porque no se encuentra registrado.");
        }
    } catch (Exception error) {
        throw new Exception(error.getMessage());
    }
  }

 public MLibro anular (MLibro mLibro, Integer codLibro) throws  Exception
{
  try {
   Optional <MLibro> usuarioEncontrado = this.iLibro.findById(codLibro);
    if (usuarioEncontrado.isPresent())
    {
    MLibro nuevoRegistro = usuarioEncontrado.get();
     if (mLibro.getActivo().equals("True"))
     {
       nuevoRegistro.setActivo("True");
     } else {
        nuevoRegistro.setActivo("False");
     }
     return  this.iLibro.save(nuevoRegistro);
   } else {
   throw new Exception("No se puede anular, el Libro no esta registrado");
  }
 } catch (Exception error) {
    throw  new Exception(error.getMessage());
  }
}



}


