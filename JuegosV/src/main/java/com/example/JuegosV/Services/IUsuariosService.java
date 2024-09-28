package com.example.JuegosV.Services;

import com.example.JuegosV.Entities.Usuarios;

import java.util.List;

public interface IUsuariosService {

    public List<Usuarios> mostrarUsuarios();

    public Usuarios buscarUsuariosPorId(Long id);

    public Usuarios guardarUsuarios (Usuarios usuarios);

    public void  eliminarUsuarios(Long id);

}
