package com.example.JuegosV.Services;


import com.example.JuegosV.Entities.Prestamos;
import com.example.JuegosV.Repositories.PrestamoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrestamosService implements  IPrestamosService{

    @Autowired
    private PrestamoRepository repository;

    @Override
    public List<Prestamos> mostrarPrestamos(){
        return repository.findAll();
    }

    @Override
    public Prestamos buscarPrestamosPorId(Long id){
        return  repository.findById(id).orElse(null);

    }

    @Transactional
    @Override
    public Prestamos guardarPrestamos(Prestamos prestamos){
        return repository.save(prestamos);
    }

    @Transactional
    @Override
    public void eliminarPrestamos(Long id){
        repository.deleteById(id);
    }

}
