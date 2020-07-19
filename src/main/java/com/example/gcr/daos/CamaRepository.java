package com.example.gcr.daos;
import com.example.gcr.models.Cama;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CamaRepository extends CrudRepository<Cama,Long>{

}
