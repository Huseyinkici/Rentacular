package com.example.webrentacular.Repository;

import com.example.webrentacular.Entity.Departman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmanRepository extends JpaRepository<Departman, Long> {
}
