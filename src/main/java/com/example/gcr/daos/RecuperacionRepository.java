package com.example.gcr.daos;
import com.example.gcr.models.RecuId;
import com.example.gcr.models.Recuperacion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface RecuperacionRepository extends CrudRepository<Recuperacion,Long>{
    Recuperacion findByRecuId(RecuId recuId);
    Recuperacion deleteByRecuId(RecuId recuId);

}
