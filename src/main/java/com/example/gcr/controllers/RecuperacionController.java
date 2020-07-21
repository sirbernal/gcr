package com.example.gcr.controllers;

import com.example.gcr.models.Quimioterapia;
import com.example.gcr.models.Recuperacion;
import com.example.gcr.services.QuimioterapiaService;
import com.example.gcr.services.RecuperacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reserva/cama")
public class RecuperacionController {

    @Autowired
    @Qualifier("RecuperacionService")
    private RecuperacionService recuperacionService;

    @GetMapping("/ver")
    public Iterable<Recuperacion> getRecuperacion () {
        return recuperacionService.listAllRecu();
    }

    @PostMapping("")
    public ResponseEntity<Recuperacion> addRecu(@RequestBody Recuperacion recuperacion){
        Recuperacion recu = recuperacionService.saveUpdateRecu(recuperacion);
        return new ResponseEntity<Recuperacion>(recu, HttpStatus.CREATED);
    }

}
