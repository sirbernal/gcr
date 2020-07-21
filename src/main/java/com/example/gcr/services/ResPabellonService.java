package com.example.gcr.services;
import com.example.gcr.daos.ResPabellonRepository;
import com.example.gcr.models.ResId;
import com.example.gcr.models.ResPabellon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ResPabellonService")
public class ResPabellonService {
    @Autowired
    private ResPabellonRepository resPabellonRepository;

    public ResPabellon saveUpdateRes(ResPabellon resPabellon){
        return resPabellonRepository.save(resPabellon);
    }
    public ResPabellon findResById(ResId resId){
        return resPabellonRepository.findByResId(resId);
    }
    public Iterable<ResPabellon> listAllRes() {
        return resPabellonRepository.findAll();
    }
    public void deleteRes(ResId resId){
        resPabellonRepository.deleteByResId(resId);
    }

}