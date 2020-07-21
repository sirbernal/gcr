package com.example.gcr.daos;
import com.example.gcr.models.QuimioId;
import com.example.gcr.models.Quimioterapia;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface QuimioterapiaRepository extends CrudRepository<Quimioterapia,Long>{
    Quimioterapia findByQuimioId(QuimioId quimioId);
    Quimioterapia deleteByQuimioId(QuimioId quimioId);
}