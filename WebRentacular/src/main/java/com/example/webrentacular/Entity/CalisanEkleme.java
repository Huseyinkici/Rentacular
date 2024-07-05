package com.example.webrentacular.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "calisan_ekleme")
public class CalisanEkleme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String adi;
    private String soyadi;

    @ManyToOne
    private Departman departman;

    @ManyToOne
    private Rol rol;

    private String telefonNumarasi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public Departman getDepartman() {
        return departman;
    }

    public void setDepartman(Departman departman) {
        this.departman = departman;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getTelefonNumarasi() {
        return telefonNumarasi;
    }

    public void setTelefonNumarasi(String telefonNumarasi) {
        this.telefonNumarasi = telefonNumarasi;
    }
}
