package com.example.gcr.services;

import com.example.gcr.models.RecuId;
import com.example.gcr.models.Recuperacion;
import com.example.gcr.daos.RecuperacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("RecuperacionService")
public class RecuperacionService {
    @Autowired
    private RecuperacionRepository recuperacionRepository;

    public Recuperacion saveUpdateRecu(Recuperacion recuperacion){
        return recuperacionRepository.save(recuperacion);
    }
    public Recuperacion findByRecuId(RecuId recuId){
        return recuperacionRepository.findByRecuId(recuId);
    }
    public Iterable<Recuperacion> listAllRecu() {
        return recuperacionRepository.findAll();
    }
    @Transactional
    public void deleteRecu(RecuId recuId){
        recuperacionRepository.deleteByRecuId(recuId);
    }
}

