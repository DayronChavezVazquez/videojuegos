package com.example.JuegosV.Services;

import com.example.JuegosV.Entities.Usuarios;
import com.example.JuegosV.Repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import jakarta.transaction.Transactional;

@Service
public class UsuariosService implements IUsuariosService {

    @Autowired
    private UsuarioRepository repository;

    @Override
    public List<Usuarios> mostrarUsuarios(){
        return repository.findAll();
    }

    @Override
    public Usuarios buscarUsuariosPorId(Long id){
        return repository.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public  Usuarios guardarUsuarios(Usuarios usuarios){
        return repository.save(usuarios);
    }

    @Transactional
    @Override
    public  void eliminarUsuarios(Long id){
        repository.deleteById(id);
    }

}
