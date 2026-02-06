package com.cesde.biblioteca.Controlador;

import com.cesde.biblioteca.Modelo.MUsuarios;
import com.cesde.biblioteca.Servicio.SUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class CUsuarios
{
    @Autowired
    SUsuarios sUsuarios;

    @PostMapping
    public ResponseEntity<?> guardar (@RequestBody MUsuarios mUsuarios) throws Exception
    {
        try
        {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.sUsuarios.guardar(mUsuarios));
        }
        catch (Exception error)
        {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> consultaGeneral() throws Exception
    {
        try
        {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.sUsuarios.consultaGeneral());
        }
        catch (Exception error)
        {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    @GetMapping("/{ideUsuario}")
    public ResponseEntity<?>consultaIndividualId(@PathVariable Integer ideUsuario) throws Exception
    {
        try
        {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.sUsuarios.consultaIndividualId(ideUsuario));
        }
        catch (Exception error)
        {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    @GetMapping("/buscarnom/{nombreUsuario}")
    public ResponseEntity<?> consultaIndividualNombre(@PathVariable String nombreUsuario) throws Exception
    {
        try
        {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.sUsuarios.consultaIndivisualNombre(nombreUsuario));
        }
        catch (Exception error)
        {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    @PutMapping("/{ideUsuario}")
    public ResponseEntity<?> modificar(@RequestBody MUsuarios mUsuarios, @PathVariable Integer ideUsuario) throws Exception
    {
        try
        {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.sUsuarios.modificar(mUsuarios, ideUsuario));
        }
        catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    @PutMapping("/{ideUsuario}")
    public ResponseEntity<?> anular(@RequestBody MUsuarios mUsuarios, @PathVariable Integer ideUsuario)throws Exception
    {
        try
        {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.sUsuarios.anular(mUsuarios, ideUsuario));
        }
        catch (Exception error)
        {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    @DeleteMapping("/{ideUsuario}")
    public ResponseEntity<?> eliminar(@PathVariable Integer ideUsuario) throws Exception
    {
        try
        {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.sUsuarios.eliminar(ideUsuario));
        }
        catch (Exception error)
        {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
