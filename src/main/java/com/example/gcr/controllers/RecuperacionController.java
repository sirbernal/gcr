package com.example.gcr.controllers;

import com.example.gcr.models.*;
import com.example.gcr.services.QuimioterapiaService;
import com.example.gcr.services.RecuperacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
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

    @PutMapping("/update")
    public ResponseEntity updateRecu(@RequestBody Recuperacion recuperacion){
        Recuperacion recu = recuperacionService.findByRecuId(recuperacion.getRecuId());
        if(recu!=null){
            recu.setEstado(recuperacion.isEstado());
            recu.setId_paciente(recuperacion.getId_paciente());
            recuperacionService.saveUpdateRecu(recu);
            return new ResponseEntity<Recuperacion>(recu, HttpStatus.OK);
        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/delete")
    public ResponseEntity deleteRecu(@RequestBody RecuId recuId){
        Recuperacion recu = recuperacionService.findByRecuId(recuId);
        if(recu!=null){
            recuperacionService.deleteRecu(recuId);
            return new ResponseEntity<>(true,HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);


    }

}
