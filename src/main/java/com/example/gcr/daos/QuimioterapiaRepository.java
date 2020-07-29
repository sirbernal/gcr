package com.example.gcr.daos;
import com.example.gcr.models.QuimioId;
import com.example.gcr.models.Quimioterapia;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface QuimioterapiaRepository extends CrudRepository<Quimioterapia,QuimioId>{
    Quimioterapia findByQuimioId(QuimioId quimioId);
    void deleteByQuimioId(QuimioId quimioId);
}