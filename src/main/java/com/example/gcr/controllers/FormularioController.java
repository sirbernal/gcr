package com.example.gcr.controllers;
import com.example.gcr.models.Formulario;
import com.example.gcr.services.FormularioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
@RestController
@RequestMapping("/solicitud")
public class FormularioController {

    @Autowired
    @Qualifier("FormularioService")
    private FormularioService formularioService;

    @GetMapping("/ver")
    public Iterable<Formulario> getFormulario () {
        return formularioService.listAllForm();
        }

    @PostMapping("")
    public ResponseEntity<Formulario> addFormulario(@RequestBody Formulario formulario){
        Formulario form = formularioService.saveFormulario(formulario);
        return new ResponseEntity<Formulario>(form, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteFormulario(@PathVariable Long id){
        Formulario form = formularioService.findFormularioById(id);
        if(form!=null){
            formularioService.deleteFormulario(id);
            return new ResponseEntity<>(true, HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>(false,HttpStatus.BAD_REQUEST);
    }
}



