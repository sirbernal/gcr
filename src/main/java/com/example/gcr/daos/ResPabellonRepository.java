package com.example.gcr.daos;
import com.example.gcr.models.ResId;
import com.example.gcr.models.ResPabellon;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ResPabellonRepository extends CrudRepository<ResPabellon,Long>{
    ResPabellon findByResId(ResId resId);
    ResPabellon deleteByResId(ResId resId);
}
