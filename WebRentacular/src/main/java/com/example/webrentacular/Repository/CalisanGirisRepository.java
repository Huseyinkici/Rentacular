package com.example.webrentacular.Repository;

import com.example.webrentacular.Entity.CalisanGiris;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalisanGirisRepository extends JpaRepository<CalisanGiris, Long> {

}
