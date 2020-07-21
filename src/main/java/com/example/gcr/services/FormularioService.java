package com.example.gcr.services;

import com.example.gcr.daos.FormularioRepository;
import com.example.gcr.models.Formulario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("FormularioService")
public class FormularioService {
    @Autowired
    private FormularioRepository formularioRepository;

    public Formulario saveFormulario(Formulario formulario){
        return formularioRepository.save(formulario);
    }

    public Formulario findFormularioById(Long id){
        return formularioRepository.findById(id).orElse(null);
    }

    public Iterable<Formulario> listAllForm(){
        return formularioRepository.findAll();
    }

    public void deleteFormulario(Long id){
        formularioRepository.deleteById(id);
    }
}
