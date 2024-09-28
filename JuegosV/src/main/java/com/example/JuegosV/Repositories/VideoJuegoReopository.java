package com.example.JuegosV.Repositories;

import com.example.JuegosV.Entities.VideoJuegos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoJuegoReopository extends JpaRepository<VideoJuegos, Long> {
}
