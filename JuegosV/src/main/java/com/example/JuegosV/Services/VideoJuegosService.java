package com.example.JuegosV.Services;

import com.example.JuegosV.Entities.VideoJuegos;
import com.example.JuegosV.Repositories.VideoJuegoReopository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoJuegosService implements IVideoJuegosService{

    @Autowired
    private VideoJuegoReopository repository;

    @Override
     public List<VideoJuegos> mostrarVideoJuegos(){
        return repository.findAll();
    }

    @Override
    public VideoJuegos buscarVideoJuesgosPorId(Long id ){
        return repository.findById(id).orElse(null);

    }

    @Transactional
    @Override
    public  VideoJuegos guardarVideoJuegos(VideoJuegos videoJuegos){
        return repository.save(videoJuegos);
    }

    @Transactional
    @Override
    public void eliminarVideoJuegos(Long id) {
        repository.deleteById(id);
    }
}
