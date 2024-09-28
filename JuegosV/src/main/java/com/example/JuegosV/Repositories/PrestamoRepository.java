package com.example.JuegosV.Repositories;

import com.example.JuegosV.Entities.Prestamos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestamoRepository extends JpaRepository<Prestamos, Long> {
}
