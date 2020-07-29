package com.example.gcr.daos;
import com.example.gcr.models.ResId;
import com.example.gcr.models.ResPabellon;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ResPabellonRepository extends CrudRepository<ResPabellon,ResId>{
    ResPabellon findByResId(ResId resId);
    void deleteByResId(ResId resId);
}
