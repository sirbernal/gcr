package com.example.gcr.daos;
import com.example.gcr.models.Quimioterapia;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface QuimioterapiaRepository extends CrudRepository<Quimioterapia,Long>{

}