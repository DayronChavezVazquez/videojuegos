package com.example.JuegosV.Services;


import com.example.JuegosV.Entities.Prestamos;

import java.util.List;

public interface IPrestamosService {

    public List<Prestamos> mostrarPrestamos();

    public Prestamos buscarPrestamosPorId(Long id);

    public Prestamos guardarPrestamos(Prestamos prestamos);

    public void eliminarPrestamos(Long id);
}
