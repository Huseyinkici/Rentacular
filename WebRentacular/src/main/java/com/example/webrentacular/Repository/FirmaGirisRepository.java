package com.example.webrentacular.Repository;

import com.example.webrentacular.Entity.FirmaGiris;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirmaGirisRepository extends JpaRepository<FirmaGiris, Long> {
}
