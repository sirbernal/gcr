package com.example.gcr.services;

import com.example.gcr.daos.QuimioterapiaRepository;
import com.example.gcr.models.QuimioId;
import com.example.gcr.models.Quimioterapia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("QuimioterapiaService")
public class QuimioterapiaService {
    @Autowired
    private QuimioterapiaRepository quimioterapiaRepository;

    public Quimioterapia saveUpdateQuimio(Quimioterapia quimioterapia){
        return quimioterapiaRepository.save(quimioterapia);
    }
    public Quimioterapia findQuimioById(QuimioId quimioId){
        return quimioterapiaRepository.findByQuimioId(quimioId);
    }
    public Iterable<Quimioterapia> listAllQuimio() {
        return quimioterapiaRepository.findAll();
    }
    @Transactional
    public void deleteQuimio(QuimioId quimioId){
        quimioterapiaRepository.deleteByQuimioId(quimioId);
    }

}