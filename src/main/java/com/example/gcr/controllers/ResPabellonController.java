package com.example.gcr.controllers;

import com.example.gcr.models.RecuId;
import com.example.gcr.models.Recuperacion;
import com.example.gcr.models.ResId;
import com.example.gcr.models.ResPabellon;
import com.example.gcr.services.RecuperacionService;
import com.example.gcr.services.ResPabellonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reserva/pabellon")
public class ResPabellonController {
    @Autowired
    @Qualifier("ResPabellonService")
    private ResPabellonService resPabellonService;

    @GetMapping("/ver")
    public Iterable<ResPabellon> getResPabellon () {
        return resPabellonService.listAllRes();
    }

    @PostMapping("")
    public ResponseEntity<ResPabellon> addResPabellon(@RequestBody ResPabellon resPabellon){
        ResPabellon resPa = resPabellonService.saveUpdateRes(resPabellon);
        return new ResponseEntity<ResPabellon>(resPa, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity updateResPabellon(@RequestBody ResPabellon resPabellon){
        ResPabellon resPa = resPabellonService.findResById(resPabellon.getResId());
        if(resPa!=null){
            resPa.setEstado(resPabellon.isEstado());
            resPa.setId_equipo(resPabellon.getId_equipo());
            resPa.setId_paciente(resPabellon.getId_paciente());
            resPa.setMotivo(resPabellon.getMotivo());
            resPabellonService.saveUpdateRes(resPa);
            return new ResponseEntity<ResPabellon>(resPa, HttpStatus.OK);
        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("/delete")
    public ResponseEntity deleteResPabellon(@RequestBody ResPabellon resPabellon){
        ResId resId = resPabellon.getResId();
        ResPabellon resPab = resPabellonService.findResById(resId);
        if(resPab!=null){
            resPabellonService.deleteRes(resId);
            return new ResponseEntity<>(true,HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);


    }
}
