package com.example.webrentacular.Repository;

import com.example.webrentacular.Entity.Rezervasyon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface RezervasyonRepository extends JpaRepository<Rezervasyon, Long> {
}
