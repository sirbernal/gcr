package com.example.gcr.daos;
import com.example.gcr.models.Formulario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface FormularioRepository extends CrudRepository<Formulario,Long>{
}