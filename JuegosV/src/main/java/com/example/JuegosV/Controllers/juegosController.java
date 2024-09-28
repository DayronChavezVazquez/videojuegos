package com.example.JuegosV.Controllers;


import com.example.JuegosV.Entities.VideoJuegos;
import com.example.JuegosV.Services.VideoJuegosService;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import jakarta.faces.event.ActionEvent;
import java.util.List;

@Component
@Data
@ViewScoped

public class juegosController {

    @Autowired
    VideoJuegosService juegosService;

    private List<VideoJuegos> listaVideojuegos;

    private VideoJuegos videojuegoAGuardar;

    @PostConstruct
    public void init(){
        mostrarJuegos();
    }

    public  void mostrarJuegos(){
        this.listaVideojuegos= juegosService.mostrarVideoJuegos();
    }


    public void nuevo(ActionEvent event) {
        System.out.println("Ya jalo");
        this.videojuegoAGuardar=new VideoJuegos();

    }
    public  void guardar(){
        System.out.println("vamos el "+ this.videojuegoAGuardar);
        if(this.videojuegoAGuardar.getId()==null){
            this.juegosService.guardarVideoJuegos(this.videojuegoAGuardar);
            System.out.println("Se guardo con exito");
        }
        System.out.println("algo salio mal");
    }
}
