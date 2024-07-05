package com.example.webrentacular.Controller;

import com.example.webrentacular.Entity.CalisanEkleme;
import com.example.webrentacular.Service.CalisanEklemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calisan")
public class CalisanEklemeController {
    private final CalisanEklemeService calisanEklemeService;

    @Autowired
    public CalisanEklemeController(CalisanEklemeService calisanEklemeService){
        this.calisanEklemeService = calisanEklemeService;
    }
    @PostMapping("/ekle")
    public CalisanEkleme ekleCalisan(@RequestBody CalisanEkleme calisan) {
        return calisanEklemeService.ekleCalisan(calisan);
    }

    @PutMapping("/guncelle")
    public CalisanEkleme guncelleCalisan(@RequestBody CalisanEkleme calisan) {
        return calisanEklemeService.guncelleCalisan(calisan);
    }

    @DeleteMapping("/sil/{id}")
    public void silCalisan(@PathVariable Long id) {
        calisanEklemeService.silCalisan(id);
    }

    @GetMapping("/tumunu-getir")
    public List<CalisanEkleme> tumCalisanlariGetir() {

        return calisanEklemeService.tumCalisanlariGetir();
    }

}
