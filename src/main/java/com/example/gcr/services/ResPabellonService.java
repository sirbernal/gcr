package com.example.gcr.services;
import com.example.gcr.daos.ResPabellonRepository;
import com.example.gcr.models.ResId;
import com.example.gcr.models.ResPabellon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("QuimioterapiaService")
public class ResPabellonService {
    @Autowired
    private ResPabellonRepository quimioterapiaRepository;

    public ResPabellon saveUpdateQuimio(ResPabellon resPabellon){
        return quimioterapiaRepository.save(resPabellon);
    }
    public ResPabellon findResById(ResId resId){
        return quimioterapiaRepository.findByResId(resId);
    }
    public Iterable<ResPabellon> listAllRes() {
        return quimioterapiaRepository.findAll();
    }
    public void deleteQuimio(ResId resId){
        quimioterapiaRepository.deleteByResId(resId);
    }

}