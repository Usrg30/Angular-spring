package com.crud.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaServiceImp implements PersonaService {
    
    @Autowired
    private PersonaRepositorio repositorio;

    @Override
    public List<Persona> listar(){
        return repositorio.findAll();
    }
    @Override
    public Persona listarId(int id){
        throw new UnsupportedOperationException("No esta implementado aun"); // implementar
    }

    @Override
    public Persona add(Persona p){
        throw new UnsupportedOperationException("No esta implementado aun"); // implementar
    }
    @Override
    public Persona edit(Persona p){
        throw new UnsupportedOperationException("No esta implementado aun"); // implementar
    }
    @Override
    public Persona delete(int id){
        throw new UnsupportedOperationException("No esta implementado aun"); // implementar
    }
    
}
