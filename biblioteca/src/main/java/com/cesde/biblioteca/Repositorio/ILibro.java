package com.cesde.biblioteca.Repositorio;

import com.cesde.biblioteca.Modelo.MLibro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ILibro extends JpaRepository<MLibro, Integer>
{
    List<MLibro> findBycodLibro (Integer codLibro);
}
