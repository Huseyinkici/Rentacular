package com.example.webrentacular.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "rol")
public class Rol {

    @Id
    private Long id;
    private String ad;
}
