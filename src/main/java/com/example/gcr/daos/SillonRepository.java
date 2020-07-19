package com.example.gcr.daos;
import com.example.gcr.models.Sillon;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface SillonRepository extends CrudRepository<Sillon,Long>{

}
