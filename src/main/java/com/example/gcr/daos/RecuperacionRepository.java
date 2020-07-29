package com.example.gcr.daos;
import com.example.gcr.models.RecuId;
import com.example.gcr.models.Recuperacion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface RecuperacionRepository extends CrudRepository<Recuperacion,RecuId>{
    Recuperacion findByRecuId(RecuId recuId);
    void deleteByRecuId(RecuId recuId);

}
