package com.example.gcr.controllers;

import com.example.gcr.models.Formulario;
import com.example.gcr.models.QuimioId;
import com.example.gcr.models.Quimioterapia;
import com.example.gcr.models.ResPabellon;
import com.example.gcr.services.FormularioService;
import com.example.gcr.services.QuimioterapiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;


@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
@RequestMapping("/reserva/sillon")
public class QuimioterapiaController {

    @Autowired
    @Qualifier("QuimioterapiaService")
    private QuimioterapiaService quimioterapiaService;

    @GetMapping("/ver")
    public Iterable<Quimioterapia> getQuimio() {
        return quimioterapiaService.listAllQuimio();
    }

    @PostMapping("")
    public ResponseEntity<Quimioterapia> addQuimio(@RequestBody Quimioterapia quimioterapia) {
        Quimioterapia quimio = quimioterapiaService.saveUpdateQuimio(quimioterapia);
        return new ResponseEntity<Quimioterapia>(quimio, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity updateQuimio(@RequestBody Quimioterapia quimioterapia) {
        Quimioterapia quimio = quimioterapiaService.findQuimioById(quimioterapia.getQuimioId());
        if (quimio != null) {
            quimio.setEstado(quimioterapia.isEstado());
            quimio.setId_paciente(quimioterapia.getId_paciente());
            quimioterapiaService.saveUpdateQuimio(quimio);
            return new ResponseEntity<Quimioterapia>(quimio, HttpStatus.OK);
        }
        return new ResponseEntity<>(false, HttpStatus.NOT_FOUND);


    }

    @DeleteMapping("/delete")
    public ResponseEntity deleteQuimio(@RequestBody Quimioterapia quimioterapia) {
        QuimioId quimioId = quimioterapia.getQuimioId();
        Quimioterapia quimio = quimioterapiaService.findQuimioById(quimioId);
        if (quimio != null) {
            quimioterapiaService.deleteQuimio(quimioId);
            return new ResponseEntity<>(true, HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>(false, HttpStatus.NOT_FOUND);


    }
}
