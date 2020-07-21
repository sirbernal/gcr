package com.example.gcr.services;

import com.example.gcr.models.Recuperacion;
import com.example.gcr.daos.RecuperacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service("RecuperacionService")
public class RecuperacionService {
    @Autowired
    private RecuperacionRepository recuperacionRepository;

    public Recuperacion saveOrUpdateRecuperacion(Recuperacion medico){
        return recuperacionRepository.save(medico);
    }

    public Recuperacion findMedicById(Long id){
        return recuperacionRepository.findById(id).orElse(null);
    }

    public Iterable<Recuperacion> listAll(){
        return recuperacionRepository.findAll();
    }

    public Iterable<Recuperacion> findMedicoByState(String estado){
        return recuperacionRepository.findByRecuID(estado);
    }

    public void delete(Long id){
        recuperacionRepository.deleteById(id);
    }
}

