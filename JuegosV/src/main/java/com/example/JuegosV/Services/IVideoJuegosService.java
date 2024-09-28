package com.example.JuegosV.Services;

import com.example.JuegosV.Entities.VideoJuegos;

import java.util.List;

public interface IVideoJuegosService {

    public List<VideoJuegos> mostrarVideoJuegos();

    public VideoJuegos buscarVideoJuesgosPorId (Long id);

    public VideoJuegos guardarVideoJuegos(VideoJuegos videoJuegos);

    public void eliminarVideoJuegos(Long id);



}
