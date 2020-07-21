package com.example.gcr.controllers;

import com.example.gcr.models.Recuperacion;
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
}
