package com.example.gcr.controllers;

import com.example.gcr.models.Formulario;
import com.example.gcr.models.Quimioterapia;
import com.example.gcr.services.FormularioService;
import com.example.gcr.services.QuimioterapiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reserva/sillon")
public class QuimioterapiaController {

    @Autowired
    @Qualifier("QuimioterapiaService")
    private QuimioterapiaService quimioterapiaService;

    @GetMapping("/ver")
    public Iterable<Quimioterapia> getQuimio () {
        return quimioterapiaService.listAllQuimio();
    }

    @PostMapping("")
    public ResponseEntity<Quimioterapia> addQuimio(@RequestBody Quimioterapia quimioterapia){
        Quimioterapia quimio = quimioterapiaService.saveUpdateQuimio(quimioterapia);
        return new ResponseEntity<Quimioterapia>(quimio, HttpStatus.CREATED);
    }

}
