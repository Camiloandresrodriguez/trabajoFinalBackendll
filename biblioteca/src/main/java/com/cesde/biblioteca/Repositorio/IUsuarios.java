package com.cesde.biblioteca.Repositorio;

import com.cesde.biblioteca.Modelo.MUsuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUsuarios extends JpaRepository<MUsuarios,Integer>
{
    List<MUsuarios>findByNombreusuario(String Nombreusuario);
}

