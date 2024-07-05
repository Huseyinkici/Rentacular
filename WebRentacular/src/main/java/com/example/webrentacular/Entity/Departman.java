package com.example.webrentacular.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "departman")
public class Departman {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ad;


}
