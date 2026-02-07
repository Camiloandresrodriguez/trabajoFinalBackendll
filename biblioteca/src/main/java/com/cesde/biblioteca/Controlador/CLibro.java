package com.cesde.biblioteca.Controlador;

import com.cesde.biblioteca.Modelo.MLibro;
import com.cesde.biblioteca.Servicio.SLibro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/libro")

public class CLibro

{  // ----------------------------------------------------------------------------------------------------------

    @Autowired
    SLibro slibro;



    @PostMapping

    public ResponseEntity<?> guardar(@RequestBody MLibro mLibro) throws Exception

    {
        try {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.slibro.guardar(mLibro));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }    // -------------------------------------------------------------------------------------------------------

    @GetMapping
    public ResponseEntity<?> consultaGeneral() throws Exception

    {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.slibro.consultaGeneral());
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }   // ------------------------------------------------------------------------------------------------

     @GetMapping("/{codLibro}")
    public ResponseEntity<?> consultaIndividualId(@PathVariable Integer codLibro) throws Exception

     {
         try {
             return ResponseEntity
                     .status(HttpStatus.OK)
                     .body(this.slibro.consultaIndividualId(codLibro));
         } catch (Exception error) {
             return ResponseEntity
                     .status(HttpStatus.BAD_REQUEST)
                     .body(error.getMessage());
         }
     }   // -------------------------------------------------------------------------------------------


  /*   @GetMapping ("/buscarnom/{nombreAutor}")
      public  ResponseEntity <?> consultaIndividualNombre (@PathVariable String nombreAutor) throw Exception
        {
          try
          {
              return ResponseEntity
                      .status(HttpStatus.OK)
                      .body(this.slibro.consultaIndividualNombreAutor(nombreAutor));
          }    catch ( Exception error)
          {
              return  ResponseEntity
                      .status(HttpStatus.BAD_REQUEST)
                      .body(error.getMessage());
          }
        }     //  -------------------------------------------------------------------------------------- */

 @PutMapping ("/{codLibro}")
  public ResponseEntity <?> modificar (@RequestBody MLibro mLibro,  @PathVariable Integer codLibro) throws Exception
    {
       try
       {
          return  ResponseEntity
                  .status(HttpStatus.OK)
                  .body(this.slibro.modificar(mLibro, codLibro));
       }   catch (Exception error)
       {
          return ResponseEntity
                  .status(HttpStatus.BAD_REQUEST)
                  .body(error.getMessage());
       }
    }   //-------------------------------------------------------------------------------------------------------

   @PutMapping ("/codLibro")
   public ResponseEntity <?> anular (@RequestBody MLibro mLibro, @PathVariable Integer codLibro) throws  Exception
   {
       try
       {
           return ResponseEntity
                   .status(HttpStatus.OK)
                   .body(this.slibro.anular(mLibro, codLibro));
       } catch (Exception error)
       {
           return  ResponseEntity
                   .status(HttpStatus.BAD_REQUEST)
                   .body(error.getMessage());
       }
   }  // ----------------------------------------------------------------------------------------------------------

 @DeleteMapping ("/{codLibro}")
 public ResponseEntity <?> eliminar (@PathVariable Integer codLibro) throws  Exception
 {
   try
     {
       return ResponseEntity
               .status(HttpStatus.OK)
               .body(this.slibro.eliminar(codLibro));
     } catch (Exception error)
   {
       return ResponseEntity
               .status(HttpStatus.BAD_REQUEST)
               .body(error.getMessage());
   }
 } // -------------------------------------------------------------------------------------------------------------

 } //   FIN   CLASE CLibro