package com.example.webrentacular.Repository;

import com.example.webrentacular.Entity.CalisanEkleme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalisanEklemeRepository extends JpaRepository<CalisanEkleme, Long> {
}
