package com.example.webrentacular.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "rezervasyon")
public class Rezervasyon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firmaAdi;
    private String yetkiliAdi;
    private String yetkiliSoyadi;
    private String yetkiliTelefonNumarasi;
    private LocalDateTime rezervasyonTarihi;
    private String kullaniciAdi;
    private String sifre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirmaAdi() {
        return firmaAdi;
    }

    public void setFirmaAdi(String firmaAdi) {
        this.firmaAdi = firmaAdi;
    }

    public String getYetkiliAdi() {
        return yetkiliAdi;
    }

    public void setYetkiliAdi(String yetkiliAdi) {
        this.yetkiliAdi = yetkiliAdi;
    }

    public String getYetkiliSoyadi() {
        return yetkiliSoyadi;
    }

    public void setYetkiliSoyadi(String yetkiliSoyadi) {
        this.yetkiliSoyadi = yetkiliSoyadi;
    }

    public String getYetkiliTelefonNumarasi() {
        return yetkiliTelefonNumarasi;
    }

    public void setYetkiliTelefonNumarasi(String yetkiliTelefonNumarasi) {
        this.yetkiliTelefonNumarasi = yetkiliTelefonNumarasi;
    }

    public LocalDateTime getRezervasyonTarihi() {
        return rezervasyonTarihi;
    }

    public void setRezervasyonTarihi(LocalDateTime rezervasyonTarihi) {
        this.rezervasyonTarihi = rezervasyonTarihi;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
}
