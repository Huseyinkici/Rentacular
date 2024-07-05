package com.example.webrentacular.Controller;

import com.example.webrentacular.Entity.Rezervasyon;
import com.example.webrentacular.Service.RezervasyonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rezervasyon")
public class RezervasyonController {

    private final RezervasyonService rezervasyonService;

    @Autowired
    public RezervasyonController(RezervasyonService rezervasyonService) {
        this.rezervasyonService = rezervasyonService;
    }

    @PostMapping("/ekle")
    public Rezervasyon rezervasyonEkle(@RequestBody Rezervasyon rezervasyon) {
        return rezervasyonService.rezervasyonEkle(rezervasyon);
    }

    @PutMapping("/guncelle")
    public Rezervasyon rezervasyonGuncelle(@RequestBody Rezervasyon rezervasyon) {
        return rezervasyonService.rezervasyonGuncelle(rezervasyon);
    }

    @DeleteMapping("/sil/{id}")
    public void rezervasyonSil(@PathVariable Long id) {
        rezervasyonService.rezervasyonSil(id);
    }

    @GetMapping("/tumunu-getir")
    public List<Rezervasyon> tumRezervasyonlariGetir() {

        return rezervasyonService.tumRezervasyonlariGetir();
    }
}
